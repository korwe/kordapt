package com.korwe.kordapt.registry.service;

import com.korwe.kordapt.registry.domain.Service;
import com.korwe.kordapt.registry.domain.ServiceInstance;
import com.korwe.thecore.annotation.ParamNames;
import com.korwe.thecore.service.PingService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * This file was generated using Kordapt
 */

public interface ServiceRegistry extends PingService{

    @Transactional
    @ParamNames("serviceInstance")
    public String registerServiceInstance(ServiceInstance serviceInstance);

    @ParamNames("id")
    public ServiceInstance getServiceInstance(Long id);

    public List<ServiceInstance> getServiceInstanceList();

    @ParamNames("id")
    public Service getService(String id);

    public List<Service> getServiceList();
}