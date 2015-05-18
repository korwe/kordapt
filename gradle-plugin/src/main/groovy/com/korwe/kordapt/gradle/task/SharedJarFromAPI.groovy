package com.korwe.kordapt.gradle.task

import com.korwe.kordapt.api.bean.KordaptConfig
import com.korwe.kordapt.api.bean.Service
import com.korwe.kordapt.api.bean.Type
import com.korwe.kordapt.gradle.util.ApiUtil
import org.gradle.api.DefaultTask
import org.gradle.api.file.FileTree
import org.gradle.api.tasks.TaskAction
import org.stringtemplate.v4.STGroupFile

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * @author <a href="mailto:dario.matonicki@korwe.com>Dario Matonicki</a>
 * */
class SharedJarFromAPI extends DefaultTask{
    String pathToAPI

    @TaskAction
    def sharedJarFromApi() {

        def kordaptConfig = new KordaptConfig()

        kordaptConfig.mainPath = "${project.projectDir.absolutePath}/src/main"
        kordaptConfig.mainJavaPath = "${mainPath}/java"


        STGroupFile serviceTemplateGroup = new STGroupFile('ST/service.stg')
        STGroupFile typeTemplateGroup = new STGroupFile('ST/type.stg')

        //from api dir

        File  apiFile = file(pathToAPI)
        if (apiFile.isDirectory()){
            apiFile.list().each { File dir ->
                if (dir.isDirectory()) {
                    if ('types'.equals(dir.name)) {
                        FileTree fileTree = fileTree(dir: dir, includes: ['**/*.yml', '**/*.yaml'])
                        fileTree.files.each { File typeFile ->
                            Type typeDefinition = ApiUtil.populateTypeFromApi(typeFile)
                            ApiUtil.generateTypeBean(typeDefinition, typeTemplateGroup, kordaptConfig)
                        }
                    }
                    else if('services'.equals(dir.name)){
                        FileTree fileTree = fileTree(dir: dir, includes: ['**/*.yml', '**/*.yaml'])
                        fileTree.files.each { File serviceFile ->
                            Service serviceDefinition = ApiUtil.populateServiceFromApi(serviceFile)
                            ApiUtil.generateServiceInterface(serviceDefinition, serviceTemplateGroup, kordaptConfig)
                        }
                    }
                }
            }
        }


        //package into jar

        //move jar to lib folder

    }


}
