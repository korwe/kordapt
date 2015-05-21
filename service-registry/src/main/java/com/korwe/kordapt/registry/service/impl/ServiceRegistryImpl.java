package com.korwe.kordapt.registry.service.impl;

import com.korwe.kordapt.gradle.util.ApiUtil;
import com.korwe.kordapt.registry.dao.ServiceDAO;
import com.korwe.kordapt.registry.dao.ServiceInstanceDAO;
import com.korwe.kordapt.registry.dao.ServiceProviderDAO;
import com.korwe.kordapt.registry.domain.Service;
import com.korwe.kordapt.registry.domain.ServiceInstance;
import com.korwe.kordapt.registry.domain.ServiceProvider;
import com.korwe.kordapt.registry.service.ServiceRegistry;
import com.korwe.thecore.service.ping.PingServiceImpl;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.ByteArrayInputStream;
import java.io.File;
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
        serviceInstance.setQueueName(UUID.randomUUID().toString());
        serviceDAO.saveOrUpdate(serviceInstance.getService());
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

    private void traverseDir(TarArchiveEntry archiveEntry) {
        if (archiveEntry.isDirectory()) {
            for(TarArchiveEntry dirEntry : archiveEntry.getDirectoryEntries()){
                traverseDir(dirEntry);
            }
        }

        if(archiveEntry.isFile()){
            File file = archiveEntry.getFile();

            //Do with serviceDefinition
            if (file.getName().endsWith(".yml") || file.getName().endsWith(".yaml")) {
                com.korwe.kordapt.api.bean.Service serviceDefinition = ApiUtil.populateServiceFromApi(file);

                Service service = new Service();
                ServiceProvider provider = new ServiceProvider(); //TODO : lookup the provider give the group name.
                service.setProvider(provider);
                service.setName(serviceDefinition.getName());
                service.setDescription(serviceDefinition.getDescription());
                service.setApiDef(null); //TODO: need to work out strategy of how to share data, in order to populate common apiDef accross all services.
                LOG.debug("Processed apiDef for Service name {}", service.getName());
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