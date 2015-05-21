package com.korwe.kordapt.registry.dao;

import com.korwe.kordapt.hibernate.AbstractGenericDAO;
import com.korwe.kordapt.registry.domain.ServiceProvider;
import com.korwe.thecore.exception.CoreServiceException;

import java.util.List;

/**
 * @author <a href="mailto:dario.matonicki@korwe.com>Dario Matonicki</a>
 */
public class ServiceProviderDAO extends AbstractGenericDAO<ServiceProvider, Long> {
    public ServiceProvider findGroupId(String groupID) {

        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.setGroupId(groupID);
        List<ServiceProvider> providers = findByProperties(serviceProvider);

        if (providers != null) {
            throw new CoreServiceException("db.notfound",ServiceProvider.class.getSimpleName(), groupID);
        }

        return providers.get(0);

    }
}
