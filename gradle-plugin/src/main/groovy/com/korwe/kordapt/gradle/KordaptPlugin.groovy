package com.korwe.kordapt.gradle

import com.korwe.kordapt.gradle.task.GenerateAPI
import com.korwe.kordapt.gradle.task.InitTask
import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project


/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class KordaptPlugin implements Plugin<Project> {


    void apply(Project project){

        project.extensions.create('kordapt', KordaptPluginExtension)

        project.task('init', type: InitTask)

        project.init.doFirst {
            if(project.kordapt.defaultPackage == null || project.kordapt.defaultPackage.isEmpty()){
                throw new GradleException("You are required to supply a non-empty string for 'defaultPackage'")
            }

            packageName = project.kordapt.defaultPackage
            apiPath = "${project.projectDir.absolutePath}/api-definition"
        }

        project.task('generateApi', type: GenerateAPI)

        project.generateApi.doFirst{
            if(project.kordapt.defaultPackage == null || project.kordapt.defaultPackage.isEmpty()){
                throw new GradleException("You are required to supply a non-empty string for 'defaultPackage'")
            }

            if(!project.hasProperty('input') || project.input.isEmpty()){
                throw new GradleException("You are required to supply a non-empty string for project parameter 'input'")
            }

            packageName = project.kordapt.defaultPackage
            apiPath = "${project.projectDir.absolutePath}/api-definition"
            stringInput = project.input




        }



    }

}

public class KordaptPluginExtension {
    String defaultPackage
}