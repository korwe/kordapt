package com.korwe.kordapt.gradle.task

import com.korwe.kordapt.api.bean.KordaptConfig
import com.korwe.kordapt.api.bean.Service
import com.korwe.kordapt.api.bean.Type
import com.korwe.kordapt.api.util.ApiUtil
import com.korwe.kordapt.gradle.util.GeneratorUtil
import org.gradle.api.DefaultTask
import org.gradle.api.file.FileTree
import org.gradle.api.tasks.TaskAction
import org.stringtemplate.v4.STGroupFile

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * @author <a href="mailto:dario.matonicki@korwe.com>Dario Matonicki</a>
 * */
class GenerateApiSrc extends DefaultTask{
    String apiPath

    @TaskAction
    def generateApiSrc() {

        def kordaptConfig = new KordaptConfig()

        kordaptConfig.mainPath = "${project.projectDir.absolutePath}/build/tmp/src/main"
        kordaptConfig.mainJavaPath = "${kordaptConfig.mainPath}/java"
        kordaptConfig.typePackagePath = "java.util" // used as default, but no default


        STGroupFile serviceTemplateGroup = new STGroupFile('ST/service.stg')
        STGroupFile typeTemplateGroup = new STGroupFile('ST/type.stg')

        //from api dir

        File  apiFile = project.file(apiPath)
        if (apiFile.isDirectory()){
            apiFile.listFiles().each { File dir ->
                if (dir.isDirectory()) {
                    if ('types'.equals(dir.name)) {
                        FileTree fileTree = project.fileTree(dir: dir, includes: ['**/*.yml', '**/*.yaml'])
                        fileTree.files.each { File typeFile ->
                            Type typeDefinition = ApiUtil.populateTypeFromApi(typeFile)
                            GeneratorUtil.generateTypeBean(typeDefinition, typeTemplateGroup, kordaptConfig)
                        }
                    }
                    else if('services'.equals(dir.name)){
                        FileTree fileTree = project.fileTree(dir: dir, includes: ['**/*.yml', '**/*.yaml'])
                        fileTree.files.each { File serviceFile ->
                            Service serviceDefinition = ApiUtil.populateServiceFromApi(serviceFile)
                            kordaptConfig.servicePackagePath = serviceDefinition.packageName.replace(".",File.separator)
                            GeneratorUtil.generateServiceInterface(serviceDefinition, serviceTemplateGroup, kordaptConfig)
                        }
                    }
                }
            }
        }

    }


}
