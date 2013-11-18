package com.korwe.kordapt.gradle.util

import com.korwe.kordapt.IdBeanPair
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.beans.factory.config.ConstructorArgumentValues
import org.springframework.beans.factory.support.GenericBeanDefinition
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader
import org.stringtemplate.v4.STGroupFile

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
class SpringBeanUtil {

    static void addServiceToBeans(String springBeansFilePath, packageName, service){
        //ADD SERVICE BEAN DEFINITION
        STGroupFile springTemplateGroup = new STGroupFile('ST/spring.stg')
        def serviceBeanTemplate = springTemplateGroup.getInstanceOf('service_beans')

        SimpleBeanDefinitionRegistry beanDefinitionRegistry = new SimpleBeanDefinitionRegistry()
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry)
        xmlBeanDefinitionReader.loadBeanDefinitions("file://${springBeansFilePath}")

        beanDefinitionRegistry.registerBeanDefinition(service.identifierName, createServiceImplBeanDefinition(packageName, service))
        beanDefinitionRegistry.registerBeanDefinition("core${service.name}", createCoreServiceBeanDefinition(packageName, service))

        def beanNameValuePairs = beanDefinitionRegistry.beanDefinitionNames.collect { name ->
            new IdBeanPair(name, beanDefinitionRegistry.getBeanDefinition(name))
        }

        serviceBeanTemplate.add('beans', beanNameValuePairs)
        new File(springBeansFilePath).write(serviceBeanTemplate.render())
    }

    static BeanDefinition createCoreServiceBeanDefinition(packageName, service){
        BeanDefinition coreServiceBeanDefinition = new GenericBeanDefinition()
        coreServiceBeanDefinition.setBeanClassName("${packageName}.service.adapter.Core${service.name}")
        coreServiceBeanDefinition.setParentName('abstractCoreService')

        ConstructorArgumentValues constructorArgumentValues = new ConstructorArgumentValues()

        ConstructorArgumentValues.ValueHolder vhServiceName = new ConstructorArgumentValues.ValueHolder(service.name)
        vhServiceName.name = 'serviceName'
        constructorArgumentValues.addGenericArgumentValue(vhServiceName)

        ConstructorArgumentValues.ValueHolder vhDelegateRef = new ConstructorArgumentValues.ValueHolder(service.identifierName)
        vhDelegateRef.name = 'delegate-ref'
        constructorArgumentValues.addGenericArgumentValue(vhDelegateRef)

        ConstructorArgumentValues.ValueHolder vhMaxThreads = new ConstructorArgumentValues.ValueHolder(10)
        vhMaxThreads.name = 'maxThreads'
        constructorArgumentValues.addGenericArgumentValue(vhMaxThreads)

        coreServiceBeanDefinition.setConstructorArgumentValues(constructorArgumentValues)
        coreServiceBeanDefinition
    }

    static BeanDefinition createServiceImplBeanDefinition(packageName, service){
        BeanDefinition serviceBeanDefinition = new GenericBeanDefinition()
        serviceBeanDefinition.setBeanClassName("${packageName}.service.impl.${service.name}Impl")
        serviceBeanDefinition

    }
}
