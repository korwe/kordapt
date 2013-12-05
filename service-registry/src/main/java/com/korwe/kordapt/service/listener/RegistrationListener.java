package com.korwe.kordapt.service.listener;

import com.korwe.kordapt.service.adapter.CoreServiceRegistry;
import com.korwe.thecore.api.CoreReceiver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class RegistrationListener {
    @Autowired
    private final CoreReceiver receiver;
    private CoreServiceRegistry serviceRegistryHandler;

    public RegistrationListener(CoreReceiver receiver, CoreServiceRegistry serviceRegistryHandler){
        this.receiver = receiver;
        this.serviceRegistryHandler = serviceRegistryHandler;
        this.receiver.connect(this.serviceRegistryHandler);
    }

}
