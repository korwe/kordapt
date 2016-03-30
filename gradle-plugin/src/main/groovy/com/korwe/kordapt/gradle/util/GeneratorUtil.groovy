package com.korwe.kordapt.gradle.util

import com.korwe.kordapt.api.bean.Annotatable
import com.korwe.kordapt.api.bean.KordaptConfig
import com.korwe.kordapt.api.bean.Service
import com.korwe.kordapt.api.bean.Type
import com.korwe.kordapt.api.util.ApiUtil
import org.stringtemplate.v4.STGroup
import org.stringtemplate.v4.STGroupFile
/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 * @author <a href="mailto:dario.matonicki@korwe.com">Dario Matonicki</a>
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
        service = ApiBeanFactory.getServiceAdapterDefinition(service)
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
        def processedServiceImplDefinition = ApiBeanFactory.getServiceImplDefinition(service)
        serviceImplTemplate.add('service', processedServiceImplDefinition)
        serviceImplTemplate.add('packageName', kordaptConfig.serviceImplPackagePath.replace(File.separator, '.'))

        def serviceImplImports = serviceImports(kordaptConfig.serviceImplPackagePath.replace(File.separator, '.'), processedServiceImplDefinition)
        serviceImplImports << processedServiceImplDefinition.packageName + "." + processedServiceImplDefinition.name
        serviceImplTemplate.add('imports', serviceImplImports.unique())

        File serviceImplDir = new File("${kordaptConfig.mainJavaPath}/${kordaptConfig.serviceImplPackagePath}")
        serviceImplDir.mkdirs()

        File serviceImplFile = new File("${serviceImplDir.absolutePath}/${service.name}Impl.java")
        serviceImplFile.write(serviceImplTemplate.render())
    }

    public static generateServiceInterface(Service service, STGroupFile serviceTemplateGroup, KordaptConfig kordaptConfig) {
    //CREATE SERVICE INTERFACE
        def serviceInterfaceTemplate = serviceTemplateGroup.getInstanceOf('service_interface')
        def processedInterfaceDefinition = ApiBeanFactory.getServiceDefinition(service)
        serviceInterfaceTemplate.add('service', processedInterfaceDefinition)
        serviceInterfaceTemplate.add('packageName', processedInterfaceDefinition.packageName)

        def serviceInterfaceImports = serviceImports(kordaptConfig.servicePackagePath.replace(File.separator, '.'), processedInterfaceDefinition)

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

    public static generateServiceClient(Service service, STGroupFile serviceClientTemplateGroup, KordaptConfig kordaptConfig) {
        //CREATE SERVICE CLIENT
        def servicePackage = service.packageName
        service = service.clone()
        service.setPackageName(kordaptConfig.serviceClientPackagePath.replace(File.separator, '.'))
        def serviceClientImplTemplate = serviceClientTemplateGroup.getInstanceOf('service_client')
        serviceClientImplTemplate.add('service', service)
        serviceClientImplTemplate.add('packageName', service.packageName)

        def serviceClientImports = serviceImports(kordaptConfig.serviceClientPackagePath.replace(File.separator, '.'), service)
        serviceClientImports << 'java.util.Map'
        serviceClientImports << 'java.util.HashMap'
        serviceClientImports << 'com.korwe.thecore.client.CoreClient'
        serviceClientImports << 'com.korwe.thecore.client.AbstractServiceClient'
        serviceClientImports << 'com.korwe.thecore.messages.AbstractAsyncMessageContext'
        serviceClientImports << "${servicePackage}.${service.name}"
        serviceClientImplTemplate.add('imports', serviceClientImports.unique())


        File serviceClientImplDir = new File("${kordaptConfig.mainJavaPath}/${kordaptConfig.serviceClientPackagePath}")
        serviceClientImplDir.mkdirs()

        File serviceInterfaceFile = new File("${serviceClientImplDir.absolutePath}/${service.name}Client.java")
        serviceInterfaceFile.write(serviceClientImplTemplate.render())
    }

    public static generateServiceClientMessageContext(Service service, STGroupFile serviceClientTemplateGroup, KordaptConfig kordaptConfig) {
        def servicePackage = service.packageName
        service = service.clone()
        service.setPackageName(kordaptConfig.serviceClientPackagePath.replace(File.separator, '.'))
        def serviceClientImplTemplate = serviceClientTemplateGroup.getInstanceOf('service_client_message_context')
        serviceClientImplTemplate.add('service', service)
        serviceClientImplTemplate.add('packageName', service.packageName)

        def serviceClientMsgCtxImports = serviceImports(kordaptConfig.serviceClientPackagePath.replace(File.separator, '.'), service)
        serviceClientMsgCtxImports << 'com.korwe.thecore.messages.AbstractAsyncMessageContext'
        serviceClientMsgCtxImports << "${servicePackage}.${service.name}"
        serviceClientImplTemplate.add('imports', serviceClientMsgCtxImports.unique())

        File serviceClientImplDir = new File("${kordaptConfig.mainJavaPath}/${kordaptConfig.serviceClientPackagePath}")
        serviceClientImplDir.mkdirs()

        File serviceInterfaceFile = new File("${serviceClientImplDir.absolutePath}/${service.name}MessageContext.java")
        serviceInterfaceFile.write(serviceClientImplTemplate.render())
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


        def processedType = ApiBeanFactory.getType(type)
        beanTemplate.add('type', processedType)
        beanTemplate.add('imports', typeImports(processedType).unique())

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

            imports.addAll(annotatableImports(a))
        }

        if(type.inheritsFrom && !(ApiUtil.isBasicType(type.inheritsFrom) || type.packageName.equals(type.inheritsFrom.packageName))){
            imports << type.inheritsFrom.fullQualifiedName
        }

        //Handle typeArguments
        imports.addAll(typeArgumentImports(type.packageName, type))

        //Handle annotations
        imports.addAll(annotatableImports(type))

        imports
    }

    static def annotatableImports(Annotatable annotatable){
        def imports = []
        annotatable.annotations?.each{ annotation ->
            imports << annotation.fullQualifiedName
        }
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

            imports.addAll(annotatableImports(f))
        }


        imports.addAll(annotatableImports(service))

        imports
    }

}
