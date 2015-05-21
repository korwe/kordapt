package com.korwe.kordapt.service.impl;

import com.google.common.io.Files;
import com.korwe.kordapt.registry.dao.ServiceDAO;
import com.korwe.kordapt.registry.dao.ServiceInstanceDAO;
import com.korwe.kordapt.registry.dao.ServiceProviderDAO;
import com.korwe.kordapt.registry.domain.Service;
import com.korwe.kordapt.registry.domain.ServiceInstance;
import com.korwe.kordapt.registry.domain.ServiceProvider;
import com.korwe.kordapt.registry.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.*;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
@ContextConfiguration({"/spring/kordapt.xml"})
public class ServiceRegistryImplTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    ServiceRegistry serviceRegistry;

    @Autowired
    ServiceDAO serviceDAO;
    @Autowired
    ServiceProviderDAO serviceProviderDAO;

    @Autowired
    ServiceInstanceDAO serviceInstanceDAO;



    @Test
    @Transactional
    @Rollback
    public void registerServiceInstance() {
        Service service = createTestService("my.service");
        ServiceInstance serviceInstance = createTestServiceInstance();
        serviceInstance.setService(service);

        String serviceInstanceQueue = serviceRegistry.registerServiceInstance(serviceInstance);

        assertThat(serviceInstance.getQueueName(), equalTo(serviceInstanceQueue));
        Long persistedService = service.getId();
        assertNotNull(serviceDAO.findById(persistedService));

        ServiceInstance persistedServiceInstance = serviceInstanceDAO.findById(serviceInstance.getId());
        assertNotNull(persistedServiceInstance);

        assertThat(persistedServiceInstance.getDescription(), equalTo(serviceInstance.getDescription()));
        assertThat(persistedServiceInstance.getService(), notNullValue());
        assertThat(persistedServiceInstance.getService().getId(), equalTo(service.getId()));
    }

    @Test
    @Transactional
    @Rollback
    public void getServiceInstance() {
        Service service = createTestService("my.service");
        ServiceInstance serviceInstance = createTestServiceInstance();
        serviceInstance.setService(service);

        serviceDAO.save(service);
        serviceInstanceDAO.save(serviceInstance);

        ServiceInstance persistedServiceInstance = serviceRegistry.getServiceInstance(serviceInstance.getId());

        assertThat(persistedServiceInstance, notNullValue());
        assertThat(persistedServiceInstance.getDescription(), equalTo(serviceInstance.getDescription()));
        assertThat(persistedServiceInstance.getService(), notNullValue());
        assertThat(persistedServiceInstance.getService().getId(), equalTo(service.getId()));

    }

    @Test
    @Transactional
    @Rollback
    public void getServiceInstanceList() {
        Service service = createTestService("my.service");
        serviceDAO.save(service);

        ServiceInstance serviceInstance1 = createTestServiceInstance();
        serviceInstance1.setService(service);
        serviceInstanceDAO.save(serviceInstance1);

        ServiceInstance serviceInstance2 = createTestServiceInstance();
        serviceInstance2.setService(service);
        serviceInstanceDAO.save(serviceInstance2);

        List<ServiceInstance> serviceInstances = serviceRegistry.getServiceInstanceList();

        assertThat(serviceInstances, notNullValue());

        assertTrue(serviceInstances.contains(serviceInstance1));
        assertTrue(serviceInstances.contains(serviceInstance2));
    }

    @Test
    @Transactional
    @Rollback
    public void getService() {
        Service service = createTestService("my.service");
        serviceDAO.save(service);

        Service persistedService = serviceRegistry.getService(service.getId());

        assertThat(persistedService, notNullValue());
        assertThat(persistedService.getId(), equalTo(service.getId()));
    }

    @Test
    @Transactional
    @Rollback
    public void getServiceList() {
        Service service1 = createTestService("my.service1");
        serviceDAO.save(service1);

        Service service2 = createTestService("my.service2");
        serviceDAO.save(service2);

        List<Service> services = serviceRegistry.getServiceList();

        assertThat(services, notNullValue());
        assertTrue(services.contains(service1));
        assertTrue(services.contains(service2));
    }


    private ServiceInstance createTestServiceInstance() {
        ServiceInstance serviceInstance = new ServiceInstance();
        serviceInstance.setDescription("Some test ServiceInstance");
        return serviceInstance;
    }

    private Service createTestService(String name) {
        Service service = new Service();
        service.setName(name);
        return service;
    }

    @Test
    @Rollback
    public void testUploadApiDefinitions() throws Exception {

        ServiceProvider serviceProvider = new ServiceProvider();
        String groupId = "com.korwe";
        serviceProvider.setGroupId(groupId);
        ServiceProvider savedProvider = serviceProviderDAO.save(serviceProvider);
        assertEquals(savedProvider.getGroupId(), groupId, "should have saved provider");

        URL resource = this.getClass().getResource("/tree-api-def.tar");
        byte[] apiDef = Files.toByteArray(new File(resource.toURI()));
        serviceRegistry.uploadApiDefinitions(apiDef, groupId);

    }
}
