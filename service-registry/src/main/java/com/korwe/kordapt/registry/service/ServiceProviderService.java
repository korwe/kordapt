package com.korwe.kordapt.registry.service;

import com.korwe.thecore.annotation.ParamNames;
import com.korwe.thecore.service.PingService;
import com.korwe.kordapt.registry.domain.ServiceProvider;


/**
 * This file was generated using Kordapt
 */

public interface ServiceProviderService extends PingService{

    @ParamNames("id")
    public ServiceProvider getServiceProvider(Long id);

    @ParamNames("groupId")
    public ServiceProvider getServiceProvider(String groupId);

    @ParamNames("serviceProvider")
    public ServiceProvider updateServiceProvider(ServiceProvider serviceProvider);

    @ParamNames("serviceProvider")
    public ServiceProvider saveServiceProvider(ServiceProvider serviceProvider);

    @ParamNames("serviceProvider")
    public void deleteServiceProvider(ServiceProvider serviceProvider);
}