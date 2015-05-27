package com.korwe.kordapt.gradle.util
import com.korwe.kordapt.api.bean.KordaptConfig
import com.korwe.kordapt.api.bean.Service
import com.korwe.kordapt.api.bean.Type
import com.korwe.kordapt.api.util.ApiUtil
import org.stringtemplate.v4.STGroup
import org.stringtemplate.v4.STGroupFile
/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * @author <a href="mailto:dario.matonicki@korwe.com>Dario Matonicki</a>
 */
class GeneratorUtil {

    static def noTypeFile(KordaptConfig kordaptConfig, Type type, Closure c){
        if(type && !ApiUtil.isBasicType(type)) {
            String typeFileName = kordaptConfig.mainJavaPath + File.separator + type.fullQualifiedName.replace('.', File.separator) + ".java";

            //If contained within defaultPackage and file does not exist
            if (type.packageName.startsWith(kordaptConfig.defaultPackageName) && !(new File(typeFileName)).exists()) {
                c.call()
            }
            //TODO: Else check classpath for existing class file - if not exist, generate

            type.typeArguments?.each { ta ->
                noTypeFile(kordaptConfig, ta, c)
            }

        }
    }

    public static def generateService(Service service, KordaptConfig kordaptConfig){

        //Check functions for missing types (to stop compilation failures after generation)
        service.functions.each { f ->
            if(f.returnType){
                noTypeFile kordaptConfig, f.returnType, { ->
                    generateType(f.returnType,  kordaptConfig)
                }
            }

            f.parameters?.each { p ->
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

        type.attributes.each { attr ->
            noTypeFile kordaptConfig, attr.type, {
                generateType(attr.type, kordaptConfig)
            }
        }

        if(type.inheritsFrom){
            noTypeFile kordaptConfig, type.inheritsFrom, {
                generateType(type.inheritsFrom, kordaptConfig)
            }
        }

        type.typeArguments?.each { ta ->
            noTypeFile kordaptConfig, ta, {
                generateType(ta, kordaptConfig);
            }
        }


        if(type && !ApiUtil.isBasicType(type) && type.packageName.startsWith(kordaptConfig.defaultPackageName)) {
            STGroupFile typeTemplateGroup = new STGroupFile('ST/type.stg')

            generateTypeApi(type, typeTemplateGroup, kordaptConfig)


            generateTypeBean(type, typeTemplateGroup, kordaptConfig)
        }



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

    static def typeImports(Type type){
        def imports = []
        type.attributes.each { a ->
            //Not basic type and not same package
            if(!(ApiUtil.isBasicType(a.type) || type.packageName.equals(a.type.packageName))){
                imports << a.type.fullQualifiedName
                imports.addAll(typeArgumentImports(type.packageName, a.type))
            }
        }

        if(type.inheritsFrom && !(ApiUtil.isBasicType(type.inheritsFrom) || type.packageName.equals(type.inheritsFrom.packageName))){
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
                if(!ApiUtil.isBasicType(t)){
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
                if(!ApiUtil.isBasicType(f.returnType)){
                    imports.addAll(typeArgumentImports(defaultPackage, f.returnType))
                    f.returnType.packageName = f.returnType.packageName ? f.returnType.packageName : defaultPackage
                    imports << f.returnType.fullQualifiedName
                }
            }

            f.parameters.each { p ->
                if(!ApiUtil.isBasicType(p.type)){
                    imports.addAll(typeArgumentImports(defaultPackage, p.type))
                    p.type.packageName = p.type.packageName ? p.type.packageName : defaultPackage
                    imports << p.type.fullQualifiedName
                }
            }
        }
        imports
    }

}
