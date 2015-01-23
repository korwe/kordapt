package com.korwe.kordapt;

import java.util.*;
import org.springframework.beans.*;
import org.springframework.context.support.*;
import org.slf4j.*;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class Kordapt
{
    public static final String version = "1.0.1";
    private static final Logger LOG = LoggerFactory.getLogger((Class)Kordapt.class);

    public static void main(final String[] args) {
        Kordapt.LOG.info("Running Kordapt {}", version);
        AbstractApplicationContext ctx = null;
        try {
            ctx = (AbstractApplicationContext)new ClassPathXmlApplicationContext("/spring/kordapt.xml");
            ctx.registerShutdownHook();
            Kordapt.LOG.info("Configured beans: {}", Arrays.toString(ctx.getBeanDefinitionNames()));
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
