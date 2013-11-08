package com.korwe.kordapt.gradle.task

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
    String stringInput = "myService Integer:myFunction(Hello world, String param) Boolean:secondFunction() void:thirdFunction()"
    @TaskAction
    def generateApi(){
        STGroupFile serviceTemplateGroup = new STGroupFile('ST/service-api-definition.stg')
        def serviceTemplate = serviceTemplateGroup.getInstanceOf('service')

        ANTLRInputStream stream = new ANTLRInputStream(new StringInputStream(stringInput));

        KordaptCLLexer lexer = new KordaptCLLexer(stream);

        CommonTokenStream tokens =  new CommonTokenStream(lexer);
        KordaptCLParser parser = new KordaptCLParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        KordaptCLImpl impl = new KordaptCLImpl();
        walker.walk(impl, parser.service());
        def service = impl.service
        serviceTemplate.add('service', service)

        File serviceApiFile = new File("${apiPath}/services/${packageName.replace('.','/')}/service/${service.name}")
        serviceApiFile.write(serviceTemplate.render())

    }
}
