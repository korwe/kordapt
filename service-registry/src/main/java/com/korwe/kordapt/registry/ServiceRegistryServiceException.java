package com.korwe.kordapt.registry;

import com.korwe.kordapt.registry.service.ServiceRegistry;
import com.korwe.thecore.exception.CoreServiceException;

/**
 * @author <a href="mailto:dario.matonicki@korwe.com>Dario Matonicki</a>
 */
public class ServiceRegistryServiceException extends CoreServiceException{
    public ServiceRegistryServiceException(String errorCode, String... errorVars) {
        super(serviceErrorCode(errorCode), errorVars);
    }

    public ServiceRegistryServiceException(Throwable cause, String errorCode, String... errorVars) {
        super(cause, serviceErrorCode(errorCode), errorVars);
    }

    private static String serviceErrorCode(String errorCode) {
        return ServiceRegistry.class.getName().concat(errorCode);
    }
}
