package com.korwe.kordapt.registry.service.adapter;

import com.korwe.kordapt.registry.service.ServiceRegistry;
import com.korwe.thecore.service.GenericCoreService;
import com.thoughtworks.xstream.XStream;


/**
 * This file was generated using Kordapt
 */
public class CoreServiceRegistry extends GenericCoreService<ServiceRegistry>{
    public CoreServiceRegistry(ServiceRegistry delegate, String serviceName, int maxThreads) {
        super(delegate, serviceName, maxThreads);
    }

    public CoreServiceRegistry(ServiceRegistry delegate, String serviceName, int maxThreads, XStream xStream) {
        super(delegate, serviceName, maxThreads, xStream);
    }
}
