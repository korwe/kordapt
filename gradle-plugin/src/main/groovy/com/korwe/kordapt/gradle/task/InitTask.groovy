package com.korwe.kordapt.gradle.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.StopExecutionException
import org.gradle.api.tasks.TaskAction

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
class InitTask extends DefaultTask{

    String companyName

    @TaskAction
    def init(){
        if(companyName == null || companyName.isEmpty()){
            println("You are required to set companyName of this task")
            throw new StopExecutionException()
        }

        def companyDirective = companyName.replace('.', File.separator)

        //Create src directory structure
        def companyMainDir = new File(project.projectDir.absolutePath + File.separator + 'src' + File.separator + 'main' + File.separator + 'java' + File.separator + companyDirective)

        if(!companyMainDir.exists()){
            companyMainDir.mkdirs()
        }

        def mainServiceDir = new File(companyMainDir.absolutePath + File.separator + 'services')

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
        def companyTestDir = new File(project.projectDir.absolutePath + File.separator + 'src' + File.separator + 'test' + File.separator + 'java' + File.separator + companyDirective)

        if(!companyTestDir.exists()){
            companyTestDir.mkdirs()
        }

        def testServiceDir = new File(companyTestDir.absolutePath + File.separator + 'services')

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

}
