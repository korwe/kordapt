package com.korwe.kordapt.registry.dao;

import com.korwe.kordapt.hibernate.AbstractGenericDAO;
import com.korwe.kordapt.registry.domain.ServiceProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author <a href="mailto:dario.matonicki@korwe.com>Dario Matonicki</a>
 */
public class ServiceProviderDAO extends AbstractGenericDAO<ServiceProvider, Long> {
    Logger log = LoggerFactory.getLogger(ServiceDAO.class);

    public ServiceProvider findGroupId(String groupID) {

        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.setGroupId(groupID);
        List<ServiceProvider> providers = findByProperties(serviceProvider);

        if (providers.size() < 1) {
            log.error("Could not find serviceProvider with groupID {}", groupID);
            return null;
        }

        return providers.get(0);

    }
}
