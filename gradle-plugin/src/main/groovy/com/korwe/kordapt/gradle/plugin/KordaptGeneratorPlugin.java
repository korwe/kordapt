package com.korwe.kordapt.gradle.plugin;

import com.korwe.kordapt.api.bean.Service;
import com.korwe.kordapt.api.bean.Type;

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 */
public interface KordaptGeneratorPlugin {
    public static String MANIFEST_ATTRIBUTE_NAME = "Kordapt-Generator-Plugin";

    public void changeTypeDefinition(Type typeDefinition);
    public void changeServiceDefinition(Service serviceDefinition);
    public void changeServiceDefinitionImpl(Service serviceDefinition);
    public void changeServiceDefinitionAdapter(Service serviceDefinition);

}
