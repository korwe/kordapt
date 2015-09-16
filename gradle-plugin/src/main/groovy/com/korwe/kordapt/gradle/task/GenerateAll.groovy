package com.korwe.kordapt.gradle.task
import com.korwe.kordapt.api.bean.KordaptConfig
import com.korwe.kordapt.cl.KordaptCLImpl
import com.korwe.kordapt.cl.KordaptCLLexer
import com.korwe.kordapt.cl.KordaptCLParser
import com.korwe.kordapt.gradle.util.GeneratorUtil
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.apache.tools.ant.filters.StringInputStream
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 * */
class GenerateAll extends DefaultTask {

    String packageName
    String apiPath
    String mainPath = "${project.projectDir.absolutePath}/src/main"
    String mainJavaPath = "${mainPath}/java"
    String testPath = "${project.projectDir.absolutePath}/src/test"
    String testJavaPath = "${testPath}/java"
    String stringInput = "myService Integer:myFunction(Hello world, String param) Boolean:secondFunction() void:thirdFunction()"
    String defaultTypePackageExtension = "dto"

    @TaskAction
    def generateApi(){

        ANTLRInputStream stream = new ANTLRInputStream(new StringInputStream(stringInput));

        KordaptCLLexer lexer = new KordaptCLLexer(stream);

        CommonTokenStream tokens =  new CommonTokenStream(lexer);
        KordaptCLParser parser = new KordaptCLParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        def kordaptConfig = new KordaptConfig()
        kordaptConfig.defaultPackageName = packageName
        kordaptConfig.apiPath = apiPath
        kordaptConfig.apiServicesPath = apiPath + File.separator + "services"
        kordaptConfig.apiTypesPath = apiPath + File.separator + "types"
        kordaptConfig.defaultTypePackageName = "${packageName}.${defaultTypePackageExtension}"
        kordaptConfig.typePackagePath = kordaptConfig.defaultTypePackageName.replace('.', File.separator)
        kordaptConfig.mainPath = mainPath
        kordaptConfig.mainJavaPath = mainJavaPath
        kordaptConfig.testJavaPath = testJavaPath

        KordaptCLImpl impl = new KordaptCLImpl();
        impl.setDefaultTypePackageName(kordaptConfig.defaultTypePackageName)

        walker.walk(impl, parser.kordaptCl());


        if(impl.service !=null){
            def service = impl.service
            if(!service.packageName || (service.packageName && !service.packageName.endsWith(".service"))){
                service.packageName = packageName +".service"
            }
            kordaptConfig.servicePackagePath = service.packageName.replace(".","/")
            kordaptConfig.serviceAdapterPackagePath = kordaptConfig.servicePackagePath + File.separator + "adapter"
            kordaptConfig.serviceImplPackagePath = kordaptConfig.servicePackagePath + File.separator + "impl"
            GeneratorUtil.generateService(service, kordaptConfig)
        }
        else{
            GeneratorUtil.generateType(impl.type, kordaptConfig)
        }


    }

}
