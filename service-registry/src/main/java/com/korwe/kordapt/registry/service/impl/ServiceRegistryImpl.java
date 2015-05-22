package com.korwe.kordapt.registry.service.impl;

import com.korwe.kordapt.api.util.ApiUtil;
import com.korwe.kordapt.registry.ServiceRegistryServiceException;
import com.korwe.kordapt.registry.dao.ServiceDAO;
import com.korwe.kordapt.registry.dao.ServiceInstanceDAO;
import com.korwe.kordapt.registry.dao.ServiceProviderDAO;
import com.korwe.kordapt.registry.domain.Service;
import com.korwe.kordapt.registry.domain.ServiceInstance;
import com.korwe.kordapt.registry.domain.ServiceProvider;
import com.korwe.kordapt.registry.service.ServiceRegistry;
import com.korwe.thecore.exception.CoreServiceException;
import com.korwe.thecore.service.ping.PingServiceImpl;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;


/**
 * This file was generated using Kordapt
 */

public class ServiceRegistryImpl extends PingServiceImpl implements ServiceRegistry {

    private ServiceDAO serviceDAO;
    private ServiceInstanceDAO serviceInstanceDAO;

    @Autowired
    private ServiceProviderDAO serviceProviderDAO;

    private Logger LOG = LoggerFactory.getLogger(ServiceRegistryImpl.class);

    public ServiceRegistryImpl(ServiceDAO serviceDAO, ServiceInstanceDAO serviceInstanceDAO){
        this.serviceDAO = serviceDAO;
        this.serviceInstanceDAO = serviceInstanceDAO;
    }

    @Override
    public String registerServiceInstance(ServiceInstance serviceInstance){

        if(serviceInstance.getService() == null){
            LOG.error("Service is required");
            throw new ServiceRegistryServiceException("registration.serviceRequired");
        }

        String serviceName = serviceInstance.getService().getName();
        Service service = serviceDAO.findByName(serviceName);

        if(service == null){
            LOG.error("Service with name {} does not exist.", serviceName);
            throw new CoreServiceException("db.notFound", Service.class.getSimpleName(), serviceName);
        }

        serviceInstance.setQueueName(UUID.randomUUID().toString());
        serviceInstanceDAO.saveOrUpdate(serviceInstance);

        return serviceInstance.getQueueName();
    }

    @Override
    public ServiceInstance getServiceInstance(Long id){
        
        ServiceInstance serviceInstance = serviceInstanceDAO.findById(id);
        
        if(serviceInstance == null){
            LOG.info("ServiceInstance for provided id{} does not exist", id);
            return null;
        }

        return serviceInstance;
    }

    @Override
    public List getServiceInstanceList(){
        return serviceInstanceDAO.findAll();
    }

    @Override
    public Service getService(Long id){
        Service service = serviceDAO.findById(id);

        if(service == null){
            LOG.info("Service for provided id{} does not exist", id);
            return null;
        }

        return service;
    }

    @Override
    public List<Service> getServiceList(){
        return serviceDAO.findAll();
    }

    @Override
    public void uploadApiDefinitions(byte[] apiDef, String groupID) throws IOException {

        ServiceProvider provider = serviceProviderDAO.findGroupId(groupID);

        if(provider == null){
            LOG.error("ServiceProvider with GroupId : [{}] does not exist.", groupID);
            throw new CoreServiceException("db.notFound", ServiceProvider.class.getSimpleName(), groupID);
        }

        InputStream inputStream = new ByteArrayInputStream(apiDef);

        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(inputStream);

        TarArchiveEntry nextEntry;

        while ((nextEntry= tarArchiveInputStream.getNextTarEntry()) != null) {
            if (nextEntry.isFile() && nextEntry.getName().startsWith("./services/")) {

                ByteArrayInputStream fileByteStream = new ByteArrayInputStream(IOUtils.toByteArray(tarArchiveInputStream));

                //Do with serviceDefinition
                if (nextEntry.getName().endsWith(".yml") || nextEntry.getName().endsWith(".yaml")) {
                    com.korwe.kordapt.api.bean.Service serviceDefinition = ApiUtil.populateServiceFromApi(fileByteStream);

                    Service service = new Service();

                    service.setProvider(provider);
                    service.setName(serviceDefinition.getName());
                    service.setDescription(serviceDefinition.getDescription());
                    service.setApiDef(apiDef);
                    LOG.debug("Processed apiDef for Service name : {}", service.getName());

                    Service savedService = serviceDAO.save(service);
                }

            }

        }

    }

    public ServiceDAO getServiceDAO() {
        return serviceDAO;
    }

    public void setServiceDAO(ServiceDAO serviceDAO) {
        this.serviceDAO = serviceDAO;
    }

    public ServiceInstanceDAO getServiceInstanceDAO() {
        return serviceInstanceDAO;
    }

    public void setServiceInstanceDAO(ServiceInstanceDAO serviceInstanceDAO) {
        this.serviceInstanceDAO = serviceInstanceDAO;
    }
}