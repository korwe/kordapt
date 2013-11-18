package com.korwe.kordapt.gradle.task

import com.korwe.kordapt.gradle.util.DaoUtil
import com.korwe.kordapt.gradle.util.HibernateUtil
import com.korwe.kordapt.gradle.util.JdbcDriver
import com.korwe.kordapt.gradle.util.JdbcUtil
import com.korwe.kordapt.gradle.util.OrmUtil
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.StopExecutionException
import org.gradle.api.tasks.TaskAction
import org.stringtemplate.v4.STGroupFile

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

        initApi(packageDirective)
        initSrc(packageDirective)
        initResource()
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

    def initResource(){

        def resourceDir = new File(project.projectDir.absolutePath + File.separator + 'src' + File.separator + 'main' + File.separator + 'resources')

        if(!resourceDir.exists()){
            resourceDir.mkdir()
        }

        STGroupFile springTemplates = new STGroupFile('ST/spring.stg')

        def springDir = new File(resourceDir.absolutePath + File.separator + 'spring')

        if(!springDir.exists()){
            springDir.mkdir()
        }

        def kordaptTemplate = springTemplates.getInstanceOf('kordapt')
        kordaptTemplate.add('packageName', packageName)

        JdbcDriver jdbcDriver = JdbcUtil.jdbcDriverClassName(project)

        if(jdbcDriver){
            File datasourceFile = new File(springDir.absolutePath + File.separator + 'datasource.xml')

            def datasourceTemplate = springTemplates.getInstanceOf('datasource')
            datasourceTemplate.add('jdbcDriver', jdbcDriver.driverClass)
            datasourceTemplate.add('jdbcUrl', JdbcUtil.jdbcUrl(jdbcDriver))
            datasourceFile.write(datasourceTemplate.render())
            kordaptTemplate.add('datasource', true)

            def ormName = OrmUtil.getOrmName(project)

            if(ormName){
                kordaptTemplate.add('orm', true)
                def ormSettings = OrmUtil.getOrmSettings(ormName)
                ormSettings.dialect = HibernateUtil.getDialect(jdbcDriver)
                ormSettings.domainPackage = packageName+'.domain'
                def ormTemplate = springTemplates.getInstanceOf('orm')
                ormTemplate.add('orm_settings', ormSettings)

                File ormFile = new File(springDir.absolutePath + File.separator + 'orm.xml')
                ormFile.write(ormTemplate.render())

                def daoName = DaoUtil.getDaoName(project)

                if(daoName){
                    kordaptTemplate.add('dao', true)
                    File daoFile = new File(springDir.absolutePath + File.separator + 'dao-beans.xml')

                    def daoBeansTemplate = springTemplates.getInstanceOf('dao_beans')
                    daoFile.write(daoBeansTemplate.render())
                }

            }

        }



        File kordaptFile = new File(springDir.absolutePath + File.separator + 'kordapt.xml')
        kordaptFile.write(kordaptTemplate.render())

        File servicesFile = new File(springDir.absolutePath + File.separator + 'service-beans.xml')
        def serviceBeansTemplate = springTemplates.getInstanceOf('service_beans')
        servicesFile.write(serviceBeansTemplate.render())
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
