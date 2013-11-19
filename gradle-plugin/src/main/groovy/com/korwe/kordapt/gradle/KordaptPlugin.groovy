package com.korwe.kordapt.gradle

import com.korwe.kordapt.gradle.task.GenerateAll
import com.korwe.kordapt.gradle.task.InitTask
import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project


/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class KordaptPlugin implements Plugin<Project> {


    void apply(Project project){

        KordaptInit.setup()

        project.apply {
            plugin 'java'
            plugin 'application'
        }

        project.dependencies {
            compile 'com.korwe:kordapt-core:1.0.0'
        }

        project.extensions.create('kordapt', KordaptPluginExtension)

        project.task('kinit', type: InitTask)

        project.kinit.doFirst {
            if(project.kordapt.defaultPackage == null || project.kordapt.defaultPackage.isEmpty()){
                throw new GradleException("You are required to supply a non-empty string for 'defaultPackage'")
            }

            packageName = project.kordapt.defaultPackage
            apiPath = "${project.projectDir.absolutePath}/api-definition"
        }

        project.task('kgenerate', type: GenerateAll, dependsOn: 'compileJava')

        project.kgenerate.doFirst{
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

        project.mainClassName = 'com.korwe.kordapt.Kordapt'



    }

}

public class KordaptPluginExtension {
    String defaultPackage
}
