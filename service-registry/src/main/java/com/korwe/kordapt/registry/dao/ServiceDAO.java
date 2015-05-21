package com.korwe.kordapt.registry.dao;

import com.korwe.kordapt.hibernate.AbstractGenericDAO;
import com.korwe.kordapt.registry.domain.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class ServiceDAO extends AbstractGenericDAO<Service, Long> {
    Logger log = LoggerFactory.getLogger(ServiceDAO.class);

    public Service findByName(String name) {
        Service service = new Service();
        service.setName(name);
        List<Service> services = findByProperties(service);


        if(services.size() < 1){
            log.error("Could not find service with name {}", name);
            return null;
        }
        return services.get(0);
    }
}
