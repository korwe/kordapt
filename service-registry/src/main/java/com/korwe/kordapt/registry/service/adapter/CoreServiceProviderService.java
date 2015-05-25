package com.korwe.kordapt.registry.service.adapter;

import com.korwe.kordapt.KordaptCoreService;
import com.thoughtworks.xstream.XStream;
import com.korwe.kordapt.registry.service.ServiceProviderService;


/**
 * This file was generated using Kordapt
 */
public class CoreServiceProviderService extends KordaptCoreService<ServiceProviderService>{
    public CoreServiceProviderService(ServiceProviderService delegate, String serviceName, int maxThreads) {
        super(delegate, serviceName, maxThreads, false);
    }

    public CoreServiceProviderService(ServiceProviderService delegate, String serviceName, int maxThreads, XStream xStream) {
        super(delegate, serviceName, maxThreads, xStream, false);
    }
}
