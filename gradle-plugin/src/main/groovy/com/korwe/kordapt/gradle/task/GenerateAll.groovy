package com.korwe.kordapt.gradle.task

import com.korwe.kordapt.api.bean.Service
import com.korwe.kordapt.api.bean.Type
import com.korwe.kordapt.cl.KordaptCLImpl
import com.korwe.kordapt.cl.KordaptCLLexer
import com.korwe.kordapt.cl.KordaptCLParser
import com.korwe.kordapt.gradle.util.ClasspathUtil
import com.korwe.kordapt.gradle.util.SpringBeanUtil
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.apache.tools.ant.filters.StringInputStream
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.stringtemplate.v4.STGroupFile

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
class GenerateAll extends DefaultTask {

    String packageName
    String apiPath
    String mainPath = "${project.projectDir.absolutePath}/src/main"
    String mainJavaPath = "${mainPath}/java"
    String testPath = "${project.projectDir.absolutePath}/src/test"
    String testJavaPath = "${testPath}/java"
    String stringInput = "myService Integer:myFunction(Hello world, String param) Boolean:secondFunction() void:thirdFunction()"
    @TaskAction
    def generateApi(){

        ANTLRInputStream stream = new ANTLRInputStream(new StringInputStream(stringInput));

        KordaptCLLexer lexer = new KordaptCLLexer(stream);

        CommonTokenStream tokens =  new CommonTokenStream(lexer);
        KordaptCLParser parser = new KordaptCLParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        KordaptCLImpl impl = new KordaptCLImpl();
        walker.walk(impl, parser.kordaptCl());
        if(impl.service !=null){
            generateService(impl.service)
        }
        else{
            generateType(impl.type)
        }


    }

    def noTypeFile(Type type, Closure c){
        if(type && !isBasicType(type)) {
            String typeFileName = mainJavaPath + File.separator + type.fullQualifiedName.replace('.', File.separator) + ".java";
            if (type.packageName.contains(packageName) && !(new File(typeFileName)).exists()) {
                c.call()
            }
        }
    }

    def correctPackageName(Type type){
        if(type && !isBasicType(type)){
            if(!type.packageName){
                type.packageName = "${packageName}.dto"
            }
        }
    }

    def generateService(Service service){


        //Check functions for missing types
        service.functions.each { f ->
            correctPackageName(f.returnType)
            noTypeFile f.returnType, { ->

                generateType(f.returnType)
            }

            f.parameters.each { p ->
                correctPackageName(p.type)
                noTypeFile p.type, {
                    generateType(p.type)
                }
            }
        }

        //CREATE API DEFINITION
        STGroupFile serviceTemplateGroup = new STGroupFile('ST/service.stg')
        def serviceApiTemplate = serviceTemplateGroup.getInstanceOf('service_api')
        serviceApiTemplate.add('service', service)

        File serviceApiFile = new File("${apiPath}/services/${packageName.replace('.','/')}/service/${service.name}.yaml")
        serviceApiFile.write(serviceApiTemplate.render())


        //CREATE SERVICE INTERFACE
        def serviceInterfaceTemplate = serviceTemplateGroup.getInstanceOf('service_interface')
        serviceInterfaceTemplate.add('service', service)
        serviceInterfaceTemplate.add('packageName', packageName+".service")

        def serviceInterfaceImports = serviceImports("${packageName}.dto", service)

        serviceInterfaceImports.each {
            if(!ClasspathUtil.checkRuntimeForClass(project, it)){
                print("Please provide attributes for class ${it}: ")
                def attributes = System.in

            }
        }

        serviceInterfaceTemplate.add('imports', serviceInterfaceImports.unique())

        File serviceInterfaceFile = new File("${mainJavaPath}/${packageName.replace('.','/')}/service/${service.name}.java")
        serviceInterfaceFile.write(serviceInterfaceTemplate.render())

        //CREATE SERVICE IMPL
        def serviceImplTemplate = serviceTemplateGroup.getInstanceOf('service_impl')
        serviceImplTemplate.add('service', service)
        serviceImplTemplate.add('packageName', packageName+".service.impl")

        def serviceImplImports = serviceImports("${packageName}.dto", service)
        serviceImplImports << packageName+".service."+service.name
        serviceImplTemplate.add('imports', serviceImplImports.unique())

        File serviceImplFile = new File("${mainJavaPath}/${packageName.replace('.','/')}/service/impl/${service.name}Impl.java")
        serviceImplFile.write(serviceImplTemplate.render())

        //CREATE SERVICE ADAPTER
        def serviceAdapterTemplate = serviceTemplateGroup.getInstanceOf('service_adapter')
        serviceAdapterTemplate.add('service', service)
        serviceAdapterTemplate.add('packageName', packageName+".service.adapter")

        def serviceAdapterImports = [packageName+".service."+service.name]
        serviceAdapterTemplate.add('imports', serviceAdapterImports.unique())

        File serviceAdapterFile = new File("${mainJavaPath}/${packageName.replace('.','/')}/service/adapter/Core${service.name}.java")
        serviceAdapterFile.write(serviceAdapterTemplate.render())

        //ADD SERVICE BEAN DEFINITION
        SpringBeanUtil.addServiceToBeans("${mainPath}/resources/spring/service-beans.xml",packageName, service)




    }

    def generateType(Type type){


        correctPackageName(type)
        type.attributes.each { attr ->
            correctPackageName(attr.type)

            noTypeFile attr.type, {
                generateType(attr.type)
            }

            generateTypeArguments(attr.type)

        }

        if(type.inheritsFrom){
            correctPackageName(type.inheritsFrom)
        }


        //CREATE API DEFINITION
        STGroupFile typeTemplateGroup = new STGroupFile('ST/type.stg')
        def typeApiTemplate = typeTemplateGroup.getInstanceOf('type_api')
        typeApiTemplate.add('type', type)


        //Make sure package directory exists
        def apiDir = new File("${apiPath}/types/${type.packageName.replace('.','/')}")

        if(!apiDir.exists()){
            println("Creating folder '${apiDir.absolutePath}'")
            apiDir.mkdirs()
        }

        File typeApiFile = new File("${apiDir.absolutePath}/${type.name}.yaml")
        typeApiFile.write(typeApiTemplate.render())

        //CREATE JAVA BEAN
        def beanTemplate = typeTemplateGroup.getInstanceOf('bean')

        //Make sure package directory exists
        def beanDir = new File("${mainJavaPath}/${type.packageName.replace('.','/')}")

        if(!beanDir.exists()){
            println("Creating folder '${beanDir.absolutePath}'")
            beanDir.mkdirs()
        }

        beanTemplate.add('type', type)
        beanTemplate.add('imports', typeImports(type).unique())

        File beanFile = new File("${beanDir.absolutePath}/${type.name}.java")
        beanFile.write(beanTemplate.render())

    }

    def generateTypeArguments(Type type){
        if (type.typeArguments) {
            type.typeArguments.each { ta ->
               correctPackageName(ta)
               noTypeFile ta, {
                   generateType(ta);
               }
            }
        }
    }


    def typeImports(Type type){
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
    def typeArgumentImports(String basePackage, Type type){
        def imports = []
        if(type.typeArguments && !type.typeArguments.empty){
            type.typeArguments.each { t ->
                if(!basePackage.equals(t.packageName)) imports << t.fullQualifiedName //Add this typeArgument
                imports.addAll(typeArgumentImports(basePackage, t)) //Add further type arguments
            }
        }
        imports
    }

    def serviceImports(String defaultPackage, Service service){
        def imports = []
        service.functions.each { f ->
            if(f.returnType){
                if(!isBasicType(f.returnType)){
                    f.returnType.packageName = f.returnType.packageName ? f.returnType.packageName : defaultPackage
                    imports << f.returnType.fullQualifiedName
                }
            }

            f.parameters.each { p ->
                if(!isBasicType(p.type)){
                    p.type.packageName = p.type.packageName ? p.type.packageName : defaultPackage
                    imports << p.type.fullQualifiedName
                }
            }
        }
        imports
    }

    def isBasicType(type){
        ['String', 'Boolean', 'Integer', 'Long', 'Short', 'Double', 'Float', 'Character'].any { name ->
            name.equals(type.name)
        } && !type.packageName
    }

}
