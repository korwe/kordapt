package com.korwe.kordapt.registry.service.impl;

import com.korwe.kordapt.registry.dao.ServiceProviderDAO;
import com.korwe.kordapt.registry.exception.ServiceProviderServiceException;
import com.korwe.thecore.service.ping.PingServiceImpl;
import com.korwe.kordapt.registry.domain.ServiceProvider;
import com.korwe.kordapt.registry.service.ServiceProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * This file was generated using Kordapt
 */

public class ServiceProviderServiceImpl extends PingServiceImpl implements ServiceProviderService{

        @Autowired
        private ServiceProviderDAO serviceProviderDAO;
        private Logger log = LoggerFactory.getLogger(ServiceProviderServiceImpl.class);


        @Override
        public ServiceProvider getServiceProvider(Long id){

            ServiceProvider serviceProvider = serviceProviderDAO.findById(id);

            if(serviceProvider == null){
                log.info("ServiceProvider[{}] not found", id);
                throw new ServiceProviderServiceException("db.notFound", ServiceProvider.class.getSimpleName(), String.valueOf(id));
            }


            return serviceProvider;
        }

        @Override
        public ServiceProvider getServiceProvider(String groupId){
            ServiceProvider serviceProvider = serviceProviderDAO.findGroupId(groupId);

            if(serviceProvider == null){
                log.info("ServiceProvider with groupId[{}] not found", groupId);
                throw new ServiceProviderServiceException("db.notFound", ServiceProvider.class.getSimpleName(), groupId);
            }

            return serviceProvider;
        }

        @Override
        public ServiceProvider updateServiceProvider(ServiceProvider serviceProvider){
            ServiceProvider persistentServiceProvider = serviceProviderDAO.findById(serviceProvider.getId());

            if(persistentServiceProvider == null){
                log.info("ServiceProvider with id[{}] not found", serviceProvider.getId());
                throw new ServiceProviderServiceException("db.notFound", ServiceProvider.class.getSimpleName(), String.valueOf(serviceProvider.getGroupId()));
            }

            persistentServiceProvider = serviceProviderDAO.merge(serviceProvider);

            return persistentServiceProvider;
        }

        @Override
        public ServiceProvider saveServiceProvider(ServiceProvider serviceProvider){
            ServiceProvider persistedServiceProvider = serviceProviderDAO.save(serviceProvider);

            return persistedServiceProvider;
        }

        @Override
        public void deleteServiceProvider(ServiceProvider serviceProvider){
            ServiceProvider persistedServiceProvider = serviceProviderDAO.findById(serviceProvider.getId());

            if(persistedServiceProvider == null){
                log.info("ServiceProvider[{}] not found", serviceProvider.getId());
                throw new ServiceProviderServiceException("db.notFound", ServiceProvider.class.getSimpleName(), String.valueOf(serviceProvider.getId()));
            }

            serviceProviderDAO.delete(persistedServiceProvider);
        }
}