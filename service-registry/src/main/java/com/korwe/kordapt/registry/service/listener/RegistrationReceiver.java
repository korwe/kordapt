package com.korwe.kordapt.registry.service.listener;

import com.korwe.thecore.api.CoreReceiver;
import com.korwe.thecore.api.MessageQueue;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class RegistrationReceiver extends CoreReceiver {

    public RegistrationReceiver(String queueName){
        super(queueName);
    }

    //DO NOT USE THIS CONSTRUCTOR
    private RegistrationReceiver(MessageQueue queue) {
        super(queue);
    }
}
