package com.korwe.kordapt;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import java.util.jar.Attributes;
import java.util.jar.JarFile;

import org.springframework.beans.*;
import org.springframework.context.support.*;
import org.slf4j.*;

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 */
public class Kordapt
{
    public static final String version = "1.0.1";
    private static final Logger LOG = LoggerFactory.getLogger((Class)Kordapt.class);
    private static KordaptCoreAddonContainer addonContainer = new KordaptCoreAddonContainer();

    public static void main(final String[] args) {
        Kordapt.LOG.info("Running Kordapt {}", version);

        Kordapt.LOG.info("Initializing addons");
        Attributes.Name coreAddonAttribute = new Attributes.Name(KordaptCoreAddon.MANIFEST_ATTRIBUTE_NAME);
        for(URL url : ((URLClassLoader) (Thread.currentThread().getContextClassLoader())).getURLs()){
            String urlFile = url.getFile();
            String fileExtension = urlFile.substring(urlFile.lastIndexOf(".") + 1, urlFile.length());
            if("file".equals(url.getProtocol())){
                if("jar".equals(fileExtension)){
                    try {
                        JarFile jarFile = new JarFile(urlFile);
                        if(jarFile.getManifest()!=null){
                            Attributes mainAttributes = jarFile.getManifest().getMainAttributes();

                            if(mainAttributes.containsKey(coreAddonAttribute)){
                                String addonClassName = (String)mainAttributes.get(coreAddonAttribute);
                                Class addonClass = Class.forName(addonClassName);
                                if(KordaptCoreAddon.class.isAssignableFrom(addonClass)){
                                    addonContainer.registerAddon((KordaptCoreAddon)addonClass.newInstance());
                                    Kordapt.LOG.info("Registered addon: {}", addonClass.getName());
                                }

                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace(); //TODO: Handle jarfile exception
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace(); //TODO: Handle addon class not found
                    } catch (InstantiationException e) {
                        e.printStackTrace(); //TODO: Handle failing instantiation of addonClass
                    } catch (IllegalAccessException e) {
                        e.printStackTrace(); //TODO: Handle failing instantiation of addonClass
                    }

                }
            }
        }

        Kordapt.LOG.debug("Running preboot hooks");
        for(KordaptCoreAddon coreAddon : addonContainer.getCoreAddons()){
            coreAddon.preBootHook();
        }

        AbstractApplicationContext ctx = null;
        try {
            ctx = new ClassPathXmlApplicationContext("/spring/kordapt.xml");
            ctx.registerShutdownHook();

            Kordapt.LOG.info("Configured beans: {}", Arrays.toString(ctx.getBeanDefinitionNames()));

            Kordapt.LOG.debug("Running postboot hooks");
            for(KordaptCoreAddon coreAddon : addonContainer.getCoreAddons()){
                coreAddon.postBootHook(ctx);
            }
            Thread.currentThread().join();
        }
        catch (BeansException e) {
            Kordapt.LOG.error("Spring context error", e);
            throw e;
        }
        catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
