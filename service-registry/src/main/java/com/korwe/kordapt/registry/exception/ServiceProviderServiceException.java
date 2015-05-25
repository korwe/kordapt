package com.korwe.kordapt.registry.exception;

import com.korwe.kordapt.registry.service.ServiceProviderService;
import com.korwe.thecore.exception.CoreServiceException;
import com.korwe.thecore.service.PingService;

/**
 * Created by tjad on 2015/05/24.
 */
public class ServiceProviderServiceException extends CoreServiceException {

    public ServiceProviderServiceException(String errorCode, String... errorVars) {
        super(ServiceProviderService.class, errorCode, errorVars);
    }

    public ServiceProviderServiceException(Throwable cause, String errorCode, String... errorVars) {
        super(ServiceProviderService.class, cause, errorCode, errorVars);

    }

}
