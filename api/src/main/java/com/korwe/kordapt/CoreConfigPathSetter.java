package com.korwe.kordapt;

import com.korwe.thecore.api.CoreConfig;


/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class CoreConfigPathSetter {
    public CoreConfigPathSetter(String coreConfigPath){
        CoreConfig.setConfigFilePath(coreConfigPath);
    }
}
