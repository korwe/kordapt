package com.korwe.kordapt.registry.service.impl;

import com.korwe.kordapt.registry.dao.ServiceDAO;
import com.korwe.kordapt.registry.dao.ServiceInstanceDAO;
import com.korwe.kordapt.registry.domain.Service;
import com.korwe.kordapt.registry.domain.ServiceInstance;
import com.korwe.kordapt.registry.service.ServiceRegistry;
import com.korwe.thecore.service.ping.PingServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


/**
 * This file was generated using Kordapt
 */

public class ServiceRegistryImpl extends PingServiceImpl implements ServiceRegistry {

    private ServiceDAO serviceDAO;
    private ServiceInstanceDAO serviceInstanceDAO;
    private Logger LOG = LoggerFactory.getLogger(ServiceRegistryImpl.class);

    public ServiceRegistryImpl(ServiceDAO serviceDAO, ServiceInstanceDAO serviceInstanceDAO){
        this.serviceDAO = serviceDAO;
        this.serviceInstanceDAO = serviceInstanceDAO;
    }

    @Override
    public String registerServiceInstance(ServiceInstance serviceInstance){
        serviceDAO.saveOrUpdate(serviceInstance.getService());
        serviceInstanceDAO.saveOrUpdate(serviceInstance);

        return serviceInstance.getId();
    }

    @Override
    public ServiceInstance getServiceInstance(String id){
        
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
    public Service getService(String id){
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