package com.korwe.kordapt.registry.service;

import com.korwe.kordapt.registry.domain.Service;
import com.korwe.kordapt.registry.domain.ServiceInstance;
import com.korwe.thecore.annotation.ParamNames;
import com.korwe.thecore.service.PingService;

import java.util.List;


/**
 * This file was generated using Kordapt
 */

public interface ServiceRegistry extends PingService{

    @ParamNames("serviceInstance")
    public void registerServiceInstance(ServiceInstance serviceInstance);

    @ParamNames("id")
    public ServiceInstance getServiceInstance(String id);

    public List getServiceInstanceList();

    @ParamNames("id")
    public Service getService(String id);

    public List getServiceList();
}