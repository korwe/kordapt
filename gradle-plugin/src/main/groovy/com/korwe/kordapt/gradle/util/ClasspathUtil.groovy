package com.korwe.kordapt.gradle.util

import org.gradle.api.Project

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
class ClasspathUtil {
    static boolean checkRuntimeForClass(Project project, String className){
        try{
            ClassLoader loader = new URLClassLoader(project.sourceSets.main.runtimeClasspath.collect {
                it.toURI().toURL() } as URL[])
            loader.findClass(className)
            return true
        }
        catch(ClassNotFoundException cnfe){
            return false
        }
    }

}
