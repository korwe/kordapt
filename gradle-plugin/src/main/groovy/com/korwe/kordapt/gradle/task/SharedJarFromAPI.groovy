package com.korwe.kordapt.gradle.task

import com.korwe.kordapt.api.bean.KordaptConfig
import com.korwe.kordapt.gradle.util.ApiUtil
import org.gradle.api.DefaultTask
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

        //from api dir


        //Generate service interfaces
        def serviceDef =
                ApiUtil.populateServiceFromApi("/Users/dariom/Dev/clients/korwe/env_forge/korwe_dev_tree/korwe-dev/kordapt/service-registry/api-definition/services/com/korwe/kordapt/registry/service/ServiceRegistry.yaml")

        ApiUtil.generateServiceInterface(serviceTemplateGroup, serviceDef, kordaptConfig)

        //Generate types

        //package into jar

        //move jar to lib folder

    }

}
