package com.korwe.kordapt.service.impl;

import com.korwe.kordapt.dao.ServiceDAO;
import com.korwe.kordapt.dao.ServiceInstanceDAO;
import com.korwe.thecore.service.ping.PingServiceImpl;
import com.korwe.kordapt.domain.ServiceInstance;
import com.korwe.kordapt.domain.Service;
import com.korwe.kordapt.service.ServiceRegistry;

import java.util.List;


/**
 * This file was generated using Kordapt
 */

public class ServiceRegistryImpl extends PingServiceImpl implements ServiceRegistry{

    private ServiceDAO serviceDAO;
    private ServiceInstanceDAO serviceInstanceDAO;

    public ServiceRegistryImpl(ServiceDAO serviceDAO, ServiceInstanceDAO serviceInstanceDAO){
        this.serviceDAO = serviceDAO;
        this.serviceInstanceDAO = serviceInstanceDAO;
    }

    @Override
    public void registerServiceInstance(ServiceInstance serviceInstance){
        //TODO: Implement function registerServiceInstance
    }

    @Override
    public ServiceInstance getServiceInstance(String id){
        //TODO: Implement function getServiceInstance
        return null;
    }

    @Override
    public List getServiceInstanceList(){
        //TODO: Implement function getServiceInstanceList
        return null;
    }

    @Override
    public Service getService(String id){
        //TODO: Implement function getService
        return null;
    }

    @Override
    public List getServiceList(){
        //TODO: Implement function getServiceList
        return null;
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