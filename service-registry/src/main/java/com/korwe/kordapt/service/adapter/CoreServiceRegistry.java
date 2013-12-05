package com.korwe.kordapt.service.adapter;

import com.korwe.thecore.service.GenericCoreService;
import com.thoughtworks.xstream.XStream;
import com.korwe.kordapt.service.ServiceRegistry;


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
