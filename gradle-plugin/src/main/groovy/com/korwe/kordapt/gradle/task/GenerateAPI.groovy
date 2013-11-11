package com.korwe.kordapt.gradle.task

import com.korwe.kordapt.Service
import com.korwe.kordapt.cl.KordaptCLImpl
import com.korwe.kordapt.cl.KordaptCLLexer
import com.korwe.kordapt.cl.KordaptCLParser
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
class GenerateAPI extends DefaultTask {

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
        walker.walk(impl, parser.service());
        generateService(impl.service)


    }

    def generateService(Service service){

        //CREATE API DEFINITION
        STGroupFile serviceApiTemplateGroup = new STGroupFile('ST/service-api-definition.stg')
        def serviceTemplate = serviceApiTemplateGroup.getInstanceOf('service')
        serviceTemplate.add('service', service)

        File serviceApiFile = new File("${apiPath}/services/${packageName.replace('.','/')}/service/${service.name}.yaml")
        serviceApiFile.write(serviceTemplate.render())


        //CREATE SERVICE INTERFACE
        STGroupFile serviceTemplateGroup = new STGroupFile('ST/service-interface.stg')
        def serviceInterfaceTemplate = serviceTemplateGroup.getInstanceOf('service_interface')
        serviceInterfaceTemplate.add('service', service)
        serviceInterfaceTemplate.add('packageName', packageName+".service")

        serviceInterfaceTemplate.add('imports', imports(service))

        File serviceInterfaceFile = new File("${mainJavaPath}/${packageName.replace('.','/')}/service/${service.name}.java")
        serviceInterfaceFile.write(serviceInterfaceTemplate.render())

        //CREATE SERVICE IMPL
        def serviceImplTemplate = serviceTemplateGroup.getInstanceOf('service_impl')
        serviceImplTemplate.add('service', service)
        serviceImplTemplate.add('packageName', packageName+".service.impl")

        def serviceImplImports = imports(service)
        serviceImplImports << packageName+".service."+service.name
        serviceImplTemplate.add('imports', serviceImplImports)

        File serviceImplFile = new File("${mainJavaPath}/${packageName.replace('.','/')}/service/impl/${service.name}Impl.java")
        serviceImplFile.write(serviceImplTemplate.render())


    }

    def imports(Service service){
        def imports = []
        service.functions.each { f ->
            if(f.returnType){
                if(!isBasicType(f.returnType)){
                    imports << f.returnType
                }
            }

            f.parameters.each { p ->
                if(!isBasicType(p.type)){
                    imports << p.type
                }
            }
        }
        imports
    }

    def isBasicType(typeName){
        ['String', 'Boolean', 'Integer', 'Long', 'Short', 'Double', 'Float', 'Character'].any { name ->
            name.equals(typeName)
        }
    }

}
