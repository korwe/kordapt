package com.korwe.kordapt.gradle.util
import com.esotericsoftware.yamlbeans.YamlReader
import com.korwe.kordapt.api.bean.*
import org.stringtemplate.v4.STGroup
import org.stringtemplate.v4.STGroupFile

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * @author <a href="mailto:dario.matonicki@korwe.com>Dario Matonicki</a>
 */
class ApiUtil {

    static customDefinitions = ['Object': new Type('Object', null),
                             'DateTime': new Type('DateTime', 'org.joda.time'),
                             'Set': new Type('Set', 'java.util'),
                             'List': new Type('List', 'java.util'),
                             'Map': new Type('Map','java.util')]

    static Service populateServiceFromApi(File file){
        def reader = new YamlReader(new FileReader(file))
        def serviceYaml = reader.read()

        //Populate service definition object
        def serviceDefinition = new Service()

        //Set name and packageName(if packageName exists)
        String serviceYamlName = serviceYaml.name
        def packageNameOffset = serviceYamlName.lastIndexOf('.')
        if(packageNameOffset != -1){
            serviceDefinition.name = serviceYamlName.substring(packageNameOffset+1)
            serviceDefinition.packageName = serviceYamlName.substring(0, packageNameOffset)
        }
        else{
            serviceDefinition.name = serviceYamlName
        }

        //Populate service function definition objects
        serviceDefinition.functions = functionDefinitions(serviceYaml.functions)
        serviceDefinition
    }

    static def populateTypeFromApi(File file) {
        def reader = new YamlReader(new FileReader(file))
        def typeYaml = reader.read()

        //Populate type def object
        def typeDefObject = typeDefinitionFromTypeName(typeYaml.name)
        typeDefObject.inheritsFrom = typeDefinitionFromTypeName(typeYaml.inherits_from)
        typeDefObject.attributes = attributeDefinitions(typeYaml.attributes)

        typeDefObject

    }

    static def attributeDefinitions(attributeDefYaml) {

        attributeDefYaml.collect { a ->
            def attribute = new Attribute()
            attribute.name = a.name
            attribute.description = a.description
            attribute.type = typeDefinitionFromTypeName(a.type)

            attribute
        }
    }

    static def functionDefinitions(functionsYaml) {

        functionsYaml.collect { f ->
            def function = new ServiceFunction()
            function.name = f.name
            function.description = f.description
            if(f.parameters!=null){
                function.parameters = functionParameterDefinition(f.parameters)
            }

            if(f.return_type != null && !"".equals(f.return_type)){
                def returnType = typeDefinitionFromTypeName(f.return_type)
                if (returnType.name != null && !'void'.equals(returnType.name)) {
                    function.returnType = returnType
                }
            }
            function
        }
    }

    static def functionParameterDefinition(parametersYaml){
        parametersYaml.collect{ p ->
            def serviceFunctionParameter = new ServiceFunctionParameter()
            serviceFunctionParameter.name = p.name
            serviceFunctionParameter.description = p.description
            serviceFunctionParameter.type = typeDefinitionFromTypeName(p.type)
            serviceFunctionParameter
        }
    }

    static def typeDefinitionFromTypeName(String typeIdentifier){
        if(typeIdentifier == null)return null;

        Type type = new Type()
        //handle generics
        def typeName = typeIdentifier

        def typeParameterOffset = typeIdentifier.indexOf('<')
        if(typeParameterOffset != -1 ){ // if generic
            typeName = typeIdentifier.substring(0, typeParameterOffset)
            def typeArgumentNames = typeIdentifier.substring(typeParameterOffset+1, typeIdentifier.length()-1).split(',')
            type.typeArguments = []
            typeArgumentNames.each{ t ->
                type.typeArguments << typeDefinitionFromTypeName(t.trim())
            }
        }

        def packageNameOffset = typeName.lastIndexOf('.')
        if(packageNameOffset != -1){
            type.name = typeName.substring(packageNameOffset+1)
            type.packageName = typeName.substring(0, packageNameOffset)
        }
        else{
            if(customDefinitions.containsKey(typeName)){
                def customType = customDefinitions.get(typeName)
                type.name = customType.name
                type.packageName = customType.packageName
            }
            else{
                type.name = typeName
            }
        }
        type

    }


    static def noTypeFile(KordaptConfig kordaptConfig, Type type, Closure c){
        if(type && !isBasicType(type)) {
            String typeFileName = kordaptConfig.mainJavaPath + File.separator + type.fullQualifiedName.replace('.', File.separator) + ".java";
            if (type.packageName.contains(kordaptConfig.defaultPackageName) && !(new File(typeFileName)).exists()) {
                c.call()
            }
        }
    }

    static def correctPackageName(Type type, KordaptConfig kordaptConfig){
        if(type && !isBasicType(type)){
            if(!type.packageName){
                type.packageName = kordaptConfig.typePackagePath.replace(File.separator, '.')
            }
        }
    }

    public static def generateService(Service service, KordaptConfig kordaptConfig){

        //Check functions for missing types (to stop compilation failures after generation)
        service.functions.each { f ->
            correctPackageName(f.returnType, kordaptConfig)
            noTypeFile kordaptConfig, f.returnType, { ->

                generateType(f.returnType,  kordaptConfig)
            }

            f.parameters.each { p ->
                correctPackageName(p.type, kordaptConfig)
                noTypeFile kordaptConfig, p.type, {
                    generateType(p.type, kordaptConfig)
                }
            }
        }

        STGroupFile serviceTemplateGroup = new STGroupFile('ST/service.stg')

        generateServiceAPIDefinition(service, serviceTemplateGroup, kordaptConfig)

        generateServiceInterface(service, serviceTemplateGroup, kordaptConfig)

        generateServiceImplementation(service, serviceTemplateGroup, kordaptConfig)

        generateServiceAdapter(service, serviceTemplateGroup, kordaptConfig)

    }

    public static generateServiceAdapter(Service service, STGroupFile serviceTemplateGroup, KordaptConfig kordaptConfig) {
    //CREATE SERVICE ADAPTER
        def serviceAdapterTemplate = serviceTemplateGroup.getInstanceOf('service_adapter')
        serviceAdapterTemplate.add('service', service)
        serviceAdapterTemplate.add('packageName', kordaptConfig.serviceAdapterPackagePath.replace(File.separator, '.'))

        def serviceAdapterImports = [kordaptConfig.servicePackagePath.replace(File.separator, '.') + "." + service.name]
        serviceAdapterTemplate.add('imports', serviceAdapterImports.unique())

        File serviceAdapterDir = new File("${kordaptConfig.mainJavaPath}/${kordaptConfig.serviceAdapterPackagePath}")
        serviceAdapterDir.mkdirs()

        File serviceAdapterFile = new File("${serviceAdapterDir.absolutePath}/Core${service.name}.java")
        serviceAdapterFile.write(serviceAdapterTemplate.render())

        //ADD SERVICE BEAN DEFINITION
        SpringBeanUtil.addServiceToBeans("${kordaptConfig.mainPath}/resources/spring/service-beans.xml", kordaptConfig.servicePackagePath.replace(File.separator, '.'), service)
    }

    public static generateServiceImplementation(Service service, STGroupFile serviceTemplateGroup, KordaptConfig kordaptConfig) {
    //CREATE SERVICE IMPL
        def serviceImplTemplate = serviceTemplateGroup.getInstanceOf('service_impl')
        serviceImplTemplate.add('service', service)
        serviceImplTemplate.add('packageName', kordaptConfig.serviceImplPackagePath.replace(File.separator, '.'))

        def serviceImplImports = serviceImports(kordaptConfig.typePackagePath.replace(File.separator, '.'), service)
        serviceImplImports << service.packageName + "." + service.name
        serviceImplTemplate.add('imports', serviceImplImports.unique())

        File serviceImplDir = new File("${kordaptConfig.mainJavaPath}/${kordaptConfig.serviceImplPackagePath}")
        serviceImplDir.mkdirs()

        File serviceImplFile = new File("${serviceImplDir.absolutePath}/${service.name}Impl.java")
        serviceImplFile.write(serviceImplTemplate.render())
    }

    public static generateServiceInterface(Service service, STGroupFile serviceTemplateGroup, KordaptConfig kordaptConfig) {
    //CREATE SERVICE INTERFACE
        def serviceInterfaceTemplate = serviceTemplateGroup.getInstanceOf('service_interface')
        serviceInterfaceTemplate.add('service', service)
        serviceInterfaceTemplate.add('packageName', service.packageName)

        def serviceInterfaceImports = serviceImports(kordaptConfig.typePackagePath.replace(File.separator, '.'), service)

        /*serviceInterfaceImports.each {
            if(!ClasspathUtil.checkRuntimeForClass(project, it)){
                print("Please provide attributes for class ${it}: ")
                def attributes = System.in

            }
        }*/

        serviceInterfaceTemplate.add('imports', serviceInterfaceImports.unique())

        File serviceInterfaceDir = new File("${kordaptConfig.mainJavaPath}/${kordaptConfig.servicePackagePath}")
        serviceInterfaceDir.mkdirs()

        File serviceInterfaceFile = new File("${serviceInterfaceDir.absolutePath}/${service.name}.java")
        serviceInterfaceFile.write(serviceInterfaceTemplate.render())
    }

    public static generateServiceAPIDefinition(Service service, STGroup serviceTemplateGroup, KordaptConfig kordaptConfig) {
    //CREATE API DEFINITION

        def serviceApiTemplate = serviceTemplateGroup.getInstanceOf('service_api')
        serviceApiTemplate.add('service', service)

        File serviceApiDir = new File("${kordaptConfig.apiServicesPath}/${kordaptConfig.servicePackagePath}")
        serviceApiDir.mkdirs()

        File serviceApiFile = new File("${serviceApiDir.absolutePath}/${service.name}.yaml")
        serviceApiFile.write(serviceApiTemplate.render())
    }

    static def generateType(Type type, KordaptConfig kordaptConfig){

        correctPackageName(type, kordaptConfig)
        type.attributes.each { attr ->
            correctPackageName(attr.type, kordaptConfig)

            noTypeFile kordaptConfig, attr.type, {
                generateType(attr.type, typeTemplateGroup, kordaptConfig)
            }

            generateTypeArguments(attr.type, kordaptConfig)

        }

        if(type.inheritsFrom){
            correctPackageName(type.inheritsFrom, kordaptConfig)
        }

        STGroupFile typeTemplateGroup = new STGroupFile('ST/type.stg')


        generateTypeApi(type, typeTemplateGroup, kordaptConfig)


        generateTypeBean(type, typeTemplateGroup, kordaptConfig)

    }

    public static generateTypeBean(Type type, STGroupFile typeTemplateGroup, KordaptConfig kordaptConfig) {
        //CREATE JAVA BEAN
        def beanTemplate = typeTemplateGroup.getInstanceOf('bean')

        //Make sure package directory exists
        def beanDir = new File("${kordaptConfig.mainJavaPath}/${type.packageName.replace('.', '/')}")

        if (!beanDir.exists()) {
            println("Creating folder '${beanDir.absolutePath}'")
            beanDir.mkdirs()
        }

        beanTemplate.add('type', type)
        beanTemplate.add('imports', typeImports(type).unique())

        File beanFile = new File("${beanDir.absolutePath}/${type.name}.java")
        beanFile.write(beanTemplate.render())
    }

    public static generateTypeApi(Type type, STGroupFile typeTemplateGroup, KordaptConfig kordaptConfig) {
        //CREATE API DEFINITION
        def typeApiTemplate = typeTemplateGroup.getInstanceOf('type_api')
        typeApiTemplate.add('type', type)

        //Make sure package directory exists within api types folder
        def apiDir = new File("${kordaptConfig.apiTypesPath}/${type.packageName.replace('.', '/')}")

        if (!apiDir.exists()) {
            println("Creating folder '${apiDir.absolutePath}'")
            apiDir.mkdirs()
        }

        File typeApiFile = new File("${apiDir.absolutePath}/${type.name}.yaml")
        typeApiFile.write(typeApiTemplate.render())
    }

    static def generateTypeArguments(Type type, KordaptConfig kordaptConfig){
        if (type.typeArguments) {
            type.typeArguments.each { ta ->
                correctPackageName(ta, kordaptConfig)
                noTypeFile kordaptConfig, ta, {
                    generateType(ta, kordaptConfig);
                }
            }
        }
    }


    static def typeImports(Type type){
        def imports = []
        type.attributes.each { a ->
            //Not basic type and not same package
            if(!(isBasicType(a.type) || type.packageName.equals(a.type.packageName))){
                imports << a.type.fullQualifiedName
                imports.addAll(typeArgumentImports(type.packageName, a.type))
            }
        }

        if(type.inheritsFrom && !(isBasicType(type.inheritsFrom) || type.packageName.equals(type.inheritsFrom.packageName))){
            imports << type.inheritsFrom.fullQualifiedName
        }

        //Handle typeArguments
        imports.addAll(typeArgumentImports(type.packageName, type))

        imports
    }

    //Separate typeArguments method for recursive strategy
    static def typeArgumentImports(String basePackage, Type type){
        def imports = []
        if(type.typeArguments && !type.typeArguments.empty){
            type.typeArguments.each { t ->
                if(!isBasicType(t)){
                    if(!basePackage.equals(t.packageName)) imports << t.fullQualifiedName //Add this typeArgument
                    imports.addAll(typeArgumentImports(basePackage, t)) //Add further type arguments
                }
            }
        }
        imports
    }

    static def serviceImports(String defaultPackage, Service service){
        def imports = []
        service.functions.each { f ->
            if(f.returnType){
                if(!isBasicType(f.returnType)){
                    imports.addAll(typeArgumentImports(defaultPackage, f.returnType))
                    f.returnType.packageName = f.returnType.packageName ? f.returnType.packageName : defaultPackage
                    imports << f.returnType.fullQualifiedName
                }
            }

            f.parameters.each { p ->
                if(!isBasicType(p.type)){
                    imports.addAll(typeArgumentImports(defaultPackage, p.type))
                    p.type.packageName = p.type.packageName ? p.type.packageName : defaultPackage
                    imports << p.type.fullQualifiedName
                }
            }
        }
        imports
    }

    static def isBasicType(type){
        ['Object', 'String', 'Boolean', 'Integer', 'Long', 'Short', 'Double', 'Float', 'Character'].any { name ->
            name.equals(type.name)
        } && !type.packageName
    }
}