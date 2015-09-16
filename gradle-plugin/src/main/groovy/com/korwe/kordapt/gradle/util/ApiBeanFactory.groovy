package com.korwe.kordapt.gradle.util

import com.korwe.kordapt.api.bean.Service
import com.korwe.kordapt.api.bean.Type
import com.korwe.kordapt.gradle.KordaptPlugin

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 */
class ApiBeanFactory {
    public static Service getServiceImplDefinition(Service service){

        Service serviceImplDefinition = service.clone()

        KordaptPlugin.pluginContainer.plugins?.each { plugin ->
            plugin.changeServiceDefinitionImpl(serviceImplDefinition)
        }

        serviceImplDefinition
    }

    public static Service getServiceDefinition(Service service){
        Service serviceInterfaceDefinition = service.clone()

        KordaptPlugin.pluginContainer.plugins?.each { plugin ->
            plugin.changeServiceDefinition(serviceInterfaceDefinition)
        }
        serviceInterfaceDefinition
    }

    public static Service getServiceAdapterDefinition(Service service){
        Service serviceAdapterDefinition = service.clone()

        KordaptPlugin.pluginContainer.plugins?.each { plugin ->
            plugin.changeServiceDefinitionAdapter(serviceAdapterDefinition)
        }
        serviceAdapterDefinition
    }

    public static Type getType(Type type){
        Type clonedType = type.clone()
        KordaptPlugin.pluginContainer.plugins?.each { plugin ->
            plugin.changeTypeDefinition(clonedType)
        }
        clonedType
    }
}
