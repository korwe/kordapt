package com.korwe.kordapt.gradle.task

import com.korwe.thecore.client.ClientServiceRequest
import com.korwe.thecore.client.CoreClient
import com.korwe.thecore.client.XStreamSerializationStrategy
import com.thoughtworks.xstream.XStream
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
class PushApi extends DefaultTask{
    String apiPath

    @TaskAction
    def pushApi() {
        CoreClient client = new CoreClient(UUID.randomUUID().toString(), new XStreamSerializationStrategy(new XStream()))
        ClientServiceRequest request = new ClientServiceRequest("ServiceRegistry", "uploadApiDefinitions")
        request.setParameter("apiDef", project.file(apiPath).bytes)
        request.setParameter("groupID", "com.korwe")

        client.makeRequests(10000L, request)

    }


}
