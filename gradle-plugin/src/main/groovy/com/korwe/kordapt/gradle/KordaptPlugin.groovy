package com.korwe.kordapt.gradle

import com.korwe.kordapt.gradle.task.InitTask
import org.gradle.api.GradleException;
import org.gradle.api.Plugin;
import org.gradle.api.Project
import org.gradle.api.tasks.StopExecutionException;


/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class KordaptPlugin implements Plugin<Project> {


    void apply(Project project){

        project.extensions.create('kordapt', KordaptPluginExtension)

        project.task('init', type: InitTask)

        project.init.doFirst {
            if(project.kordapt.companyName == null || project.kordapt.companyName.isEmpty()){
                throw new GradleException("You are required to supply a non-empty string for 'companyName'")
            }

            companyName = project.kordapt.companyName
        }



    }

}

public class KordaptPluginExtension {
    String companyName
}
