package com.korwe.kordapt.registry;

import com.korwe.kordapt.registry.domain.Service;
import com.korwe.kordapt.registry.domain.ServiceInstance;
import com.korwe.thecore.client.ClientServiceRequest;
import com.korwe.thecore.client.CoreClient;
import com.korwe.thecore.client.ServiceResult;
import com.korwe.thecore.client.XStreamSerializationStrategy;
import com.korwe.thecore.service.GenericCoreService;
import com.thoughtworks.xstream.XStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class KordaptCoreService<S> extends GenericCoreService<S>{
    private static Logger LOG = LoggerFactory.getLogger(KordaptCoreService.class);

    private Boolean isRegistered;
    private String queueName;

    public KordaptCoreService(S delegate, String serviceName, int maxThreads, boolean isRegistered) {
        super(delegate, serviceName, maxThreads);
        this.isRegistered = isRegistered;
    }

    public KordaptCoreService(S delegate, String serviceName, int maxThreads, XStream xStream, boolean isRegistered) {
        super(delegate, serviceName, maxThreads, xStream);
        this.isRegistered = isRegistered;
    }

    public Boolean getIsRegistered() {
        return isRegistered;
    }

    public void setIsRegistered(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }


    /**
     * Start the service.
     */
    @Override
    protected void startUp() throws Exception {
        if(isRegistered){
            CoreClient coreClient = new CoreClient(UUID.randomUUID().toString(), new XStreamSerializationStrategy(new XStream()));
            //First get the registered name
            ClientServiceRequest registrationRequest = new ClientServiceRequest("ServiceRegistry", "registerServiceInstance");

            ServiceInstance serviceInstance = new ServiceInstance();
            Service service = new Service();
            service.setId(getServiceClass().getName());
            serviceInstance.setService(service);
            registrationRequest.setParameter("serviceInstance", serviceInstance);

            List<ClientServiceRequest> requests = new ArrayList<>();
            requests.add(registrationRequest);

            int maxRegistrationRetries = 3;
            for(int i = 1 ; i <= maxRegistrationRetries; i++){
                Map<String,ServiceResult> responseMap = coreClient.makeRequests(100000L, requests);

                ServiceResult registrationResult = responseMap.get(registrationRequest.getGuid());

                if(registrationResult.getData() != null){
                    this.queueName = (String)registrationResult.getData();
                    LOG.info("Registered {} successfully on queue {}", getServiceClass().getSimpleName(), this.queueName);
                    break;
                }
                else{
                    LOG.info("Failed to register service");
                    if(i == maxRegistrationRetries){
                        LOG.info("Trying again...");
                    }
                    else{
                        LOG.info("Using queue {}", getServiceName());
                    }

                }
            }
        }


        //Then continue as per normal
        super.startUp();
    }

    //We override to use our own private serviceName
    @Override
    public String getServiceName(){
        if(this.queueName != null){
            return this.queueName;
        }

        return super.getServiceName();
    }
}
