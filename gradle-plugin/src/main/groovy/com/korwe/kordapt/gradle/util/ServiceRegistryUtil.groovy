package com.korwe.kordapt.gradle.util

import com.korwe.thecore.client.ClientServiceRequest
import com.korwe.thecore.client.CoreClient
import com.korwe.thecore.client.XStreamSerializationStrategy
import com.thoughtworks.xstream.XStream

/**
 * Created by tjad on 2015/05/24.
 */
class ServiceRegistryUtil {

    public static void pushApi(String groupId, File apiDir) {
        CoreClient client = new CoreClient(UUID.randomUUID().toString(), new XStreamSerializationStrategy(new XStream()))
        ClientServiceRequest request = serviceRegistryRequest("uploadApiDefinitions")
        request.setParameter("apiDef", apiDir.bytes)
        request.setParameter("groupID", groupId)

        client.makeRequests(10000L, request)

    }
    public static def getApi(String groupId){
        CoreClient client = new CoreClient(UUID.randomUUID().toString(), new XStreamSerializationStrategy(new XStream()))
        ClientServiceRequest request = serviceRegistryRequest("getApiDefinition")
        request.setParameter("groupID", groupId)
        def responseMap = client.makeRequests(10000L, request)
        def result = responseMap.get(request.guid)
        result.data
    }

    private static ClientServiceRequest serviceRegistryRequest(String functionName){
        ClientServiceRequest request = new ClientServiceRequest("ServiceRegistry", functionName)
    }
}
