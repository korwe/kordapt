package com.korwe.kordapt.gradle.plugin

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 */
public class KordaptGeneratorPluginContainer {
    List<KordaptGeneratorPlugin> plugins;

    public List<KordaptGeneratorPlugin> getPlugins() {
        if(!plugins) plugins = []
        return plugins;
    }

    public void registerPlugin(KordaptGeneratorPlugin plugin){
        getPlugins().add plugin
    }
}
