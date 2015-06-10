package com.korwe.kordapt.gradle.task

import com.korwe.kordapt.api.bean.KordaptConfig
import com.korwe.thecore.client.ClientServiceRequest
import com.korwe.thecore.client.CoreClient
import com.korwe.thecore.client.ServiceResult
import com.korwe.thecore.client.XStreamSerializationStrategy
import com.thoughtworks.xstream.XStream
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.bundling.Jar
import org.gradle.api.tasks.compile.JavaCompile

/**
 * Created by tjad on 2015/06/08.
 */
class PullApi extends DefaultTask{

    @TaskAction
    def pullApi() {
        KordaptConfig kordaptConfig = new KordaptConfig()

        project.kordapt.thirdParties?.each{ groupName ->
            def thirdPartyDirPath = "${project.buildDir}/tmp/${groupName}"
            def thirdPartyBuildPath = "${thirdPartyDirPath}/build"

            kordaptConfig.mainPath = "${thirdPartyDirPath}/src/main"
            kordaptConfig.mainJavaPath = "${kordaptConfig.mainPath}/java"

            CoreClient client = new CoreClient(UUID.randomUUID().toString(), new XStreamSerializationStrategy(new XStream()))
            ClientServiceRequest request = new ClientServiceRequest("ServiceRegistry", "downloadApiDefinition")
            request.setParameter("groupID", "com.korwe")

            def resultMap = client.makeRequests(10000L, request)

            ServiceResult result = resultMap.get(request.guid)

            kordaptConfig.apiPath =  "${thirdPartyDirPath}/api-definition"
            kordaptConfig.apiServicesPath = kordaptConfig.apiPath + File.separator + "services"
            kordaptConfig.apiTypesPath = kordaptConfig.apiPath + File.separator + "types"
            kordaptConfig.defaultTypePackageName = "pullApi.error.default.type.package"
            kordaptConfig.typePackagePath = kordaptConfig.defaultTypePackageName.replace('.', File.separator)

            File javaDir = new File(kordaptConfig.mainJavaPath)
            javaDir.mkdirs()

            File apiDir = new File(kordaptConfig.apiPath)
            apiDir.mkdirs()

            //save data to file
            File apiTarFile = new File("${thirdPartyDirPath}/api-def.tar")
            (new FileOutputStream(apiTarFile)).write(result.data)

            //Unpack data
            project.copy {
                from project.tarTree(apiTarFile)
                into apiDir
            }

            //generate api source
            GenerateApiSrc generateApiSrcTask = project.task('generateThirdPartyApiSrc', type: GenerateApiSrc)
            generateApiSrcTask.kordaptConfig = kordaptConfig
            generateApiSrcTask.apiPath = kordaptConfig.apiPath

            generateApiSrcTask.execute()

            //compile api source
            JavaCompile compileTask = project.task('compileThirdPartyApiSrc', type: JavaCompile)
            compileTask.source = project.fileTree(kordaptConfig.mainJavaPath)
            compileTask.destinationDir = project.file(thirdPartyBuildPath)
            compileTask.classpath = project.compileJava.classpath
            compileTask.execute()

            //jar api classes
            Jar jarTask = project.task('thirdPartySharedJarFromApi', type: Jar)
            jarTask.archiveName = "${groupName}.jar"
            jarTask.from project.fileTree(dir:thirdPartyBuildPath, include: '**/*.class')
            jarTask.destinationDir = project.file("${project.projectDir.absolutePath}/lib")
            jarTask.execute()

        }

    }


}
