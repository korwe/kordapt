package com.korwe.kordapt.gradle.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.StopExecutionException
import org.gradle.api.tasks.TaskAction

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
class InitTask extends DefaultTask{

    String packageName
    String apiPath

    @TaskAction
    def init(){
        if(packageName == null || packageName.isEmpty()){
            println("You are required to set packageName of this task")
            throw new StopExecutionException()
        }

        if(apiPath == null || apiPath.isEmpty()){
            println("You are required to set apiPath of this task")
            throw new StopExecutionException()
        }

        def packageDirective = packageName.replace('.', File.separator)

        initSrc(packageDirective)
        initApi(packageDirective)
    }

    def initSrc(String packageDirective){

        //Create src directory structure
        def companyMainDir = new File(project.projectDir.absolutePath + File.separator + 'src' + File.separator + 'main' + File.separator + 'java' + File.separator + packageDirective)

        if(!companyMainDir.exists()){
            companyMainDir.mkdirs()
        }

        def mainServiceDir = new File(companyMainDir.absolutePath + File.separator + 'service')

        if(!mainServiceDir.exists()){
            mainServiceDir.mkdir()
        }

        def mainServiceImplDir = new File(mainServiceDir.absolutePath + File.separator + 'impl')
        if(!mainServiceImplDir.exists()){
            mainServiceImplDir.mkdir()
        }

        def mainServiceAdapterDir = new File(mainServiceDir.absolutePath + File.separator + 'adapter')
        if(!mainServiceAdapterDir.exists()){
            mainServiceAdapterDir.mkdir()
        }

        def mainDtoDir = new File(companyMainDir.absolutePath + File.separator + 'dto')
        if(!mainDtoDir.exists()){
            mainDtoDir.mkdir()
        }

        //Create test directory structure
        def companyTestDir = new File(project.projectDir.absolutePath + File.separator + 'src' + File.separator + 'test' + File.separator + 'java' + File.separator + packageDirective)

        if(!companyTestDir.exists()){
            companyTestDir.mkdirs()
        }

        def testServiceDir = new File(companyTestDir.absolutePath + File.separator + 'service')

        if(!testServiceDir.exists()){
            testServiceDir.mkdir()
        }

        def testServiceImplDir = new File(testServiceDir.absolutePath + File.separator + 'impl')
        if(!testServiceImplDir.exists()){
            testServiceImplDir.mkdir()
        }

        def testServiceAdapterDir = new File(testServiceDir.absolutePath + File.separator + 'adapter')
        if(!testServiceAdapterDir.exists()){
            testServiceAdapterDir.mkdir()
        }

        def testDtoDir = new File(companyTestDir.absolutePath + File.separator + ' dto')
        if(!testDtoDir.exists()){
            testDtoDir.mkdir()
        }
    }

    def initApi(String packageDirective){
        //Create service directory structure

        def serviceDir = new File(apiPath + File.separator + 'services' + File.separator + packageDirective + File.separator + 'service')

        if(!serviceDir.exists()){
            serviceDir.mkdirs()
        }

        //Create types directory structure
        def typesDir = new File(apiPath + File.separator + 'types' + File.separator + packageDirective + File.separator + 'dto')

        if(!typesDir.exists()){
            typesDir.mkdirs()
        }

    }

}
