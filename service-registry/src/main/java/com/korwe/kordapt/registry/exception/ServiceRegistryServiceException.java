package com.korwe.kordapt.registry.exception;

import com.korwe.kordapt.registry.service.ServiceRegistry;
import com.korwe.thecore.exception.CoreServiceException;

/**
 * @author <a href="mailto:dario.matonicki@korwe.com>Dario Matonicki</a>
 */
public class ServiceRegistryServiceException extends CoreServiceException{
    public ServiceRegistryServiceException(String errorCode, String... errorVars) {
        super(ServiceRegistry.class, errorCode, errorVars);
    }

    public ServiceRegistryServiceException(Throwable cause, String errorCode, String... errorVars) {
        super(ServiceRegistry.class, cause, errorCode, errorVars);
    }

}
