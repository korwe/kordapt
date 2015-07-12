package com.korwe.kordapt;

import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;
import java.util.function.Function;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public interface KordaptCoreAddon {
    public static String MANIFEST_ATTRIBUTE_NAME = "Kordapt-Core-Addon";
    public void preBootHook();
    public void postBootHook(AbstractApplicationContext ctx);


}
