package com.korwe.kordapt.service;

import com.korwe.thecore.annotation.ParamNames;
import com.korwe.thecore.service.PingService;
import com.korwe.kordapt.domain.ServiceInstance;
import com.korwe.kordapt.domain.Service;

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