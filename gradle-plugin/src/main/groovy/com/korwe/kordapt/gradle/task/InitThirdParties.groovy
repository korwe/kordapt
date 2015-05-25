package com.korwe.kordapt.gradle.task

import com.korwe.kordapt.gradle.util.ServiceRegistryUtil
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by tjad on 2015/05/24.
 */
class InitThirdParties extends DefaultTask{

    @TaskAction
    def initThirdParties() {
        project.kordapt.thirdPartyPackages.each{ groupName ->
            def apiByteArray = ServiceRegistryUtil.getApi(groupName)
            //Untar data
            //GeneratorUtil.fromApi

        }



    }
}
