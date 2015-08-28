package com.korwe.kordapt.gradle

import com.korwe.kordapt.api.bean.KordaptConfig
import com.korwe.kordapt.gradle.plugin.KordaptGeneratorPluginContainer
import com.korwe.kordapt.gradle.task.GenerateAll
import com.korwe.kordapt.gradle.task.InitTask
import com.korwe.kordapt.gradle.task.GenerateApiSrc
import com.korwe.kordapt.gradle.task.PullApi
import com.korwe.kordapt.gradle.task.PushApi
import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.bundling.Compression
import org.gradle.api.tasks.bundling.Jar
import org.gradle.api.tasks.bundling.Tar
import org.gradle.api.tasks.compile.JavaCompile

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class KordaptPlugin implements Plugin<Project> {

    public static KordaptGeneratorPluginContainer pluginContainer = new KordaptGeneratorPluginContainer()


    void apply(Project project){

        KordaptInit.setup()


        project.apply {
            plugin 'java'
            plugin 'application'
        }

        project.dependencies {
            compile 'com.korwe:kordapt-core:1.0.1'
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
        project.task('generateApiSrc', type: GenerateApiSrc)
        project.task('compileApiSrc', type: JavaCompile, dependsOn: 'generateApiSrc'){
            source = project.fileTree "${project.projectDir.absolutePath}/build/tmp/src/main/java"
            destinationDir = project.file "${project.projectDir.absolutePath}/build/tmp/build"
            classpath = project.compileJava.classpath

        }
        project.task('sharedJarFromApi', type: Jar, dependsOn: 'compileApiSrc')
        project.task('tarApi', type: Tar){
            from project.fileTree(dir: "${project.projectDir.absolutePath}/api-definition", includes: ["**/*.yml", '**/*.yaml'])
            archiveName = 'api-definition.tar'
            destinationDir = project.file("${project.projectDir.absolutePath}/build/")
            compression = Compression.NONE
        }
        project.task('pushApi', type: PushApi, dependsOn: 'tarApi'){
            apiPath = project.file("${project.projectDir.absolutePath}/build/api-definition.tar")
        }

        project.task('pullApi', type: PullApi)


        project.generateApiSrc.doFirst{
            if(!project.hasProperty('apiPath') || project.apiPath.isEmpty()){
                project.ext {
                    apiPath = './api-definition'
                }
            }
            apiPath = project.apiPath

            kordaptConfig = new KordaptConfig()
            kordaptConfig.mainPath = "${project.projectDir.absolutePath}/build/tmp/src/main"
            kordaptConfig.mainJavaPath = "${kordaptConfig.mainPath}/java"
            kordaptConfig.typePackagePath = "type/package/path" // used as default, but no default
            kordaptConfig.defaultTypePackageName = "default.type.package.name" // used as default, but no default

        }

        project.sharedJarFromApi.doFirst{
            from project.fileTree(dir:"${project.projectDir.absolutePath}/build/tmp/build",include: '**/*.class')
            destinationDir=project.file("${project.projectDir.absolutePath}/build/tmp/lib")

        }

        project.kgenerate.doFirst{
            //Setup plugins
            project.kordapt.plugins?.each{ String pluginClassName ->
                pluginContainer.plugins.add(Class.forName(pluginClassName).newInstance())
            }

            if(project.kordapt.defaultPackage == null || project.kordapt.defaultPackage.isEmpty()){
                throw new GradleException("You are required to supply a non-empty string for 'defaultPackage'")
            }

            if(project.kordapt.plugins){

            }

            if(!project.hasProperty('input') || project.input.isEmpty()){
                throw new GradleException("You are required to supply a non-empty string for project parameter 'input'")
            }

            if(project.hasProperty('pkgExt')){
                defaultTypePackageExtension = project.pkgExt
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
    List<String> plugins = []
    List thirdParties = []
}
