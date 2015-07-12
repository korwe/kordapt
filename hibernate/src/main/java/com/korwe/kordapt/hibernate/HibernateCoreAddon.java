package com.korwe.kordapt.hibernate;

import com.korwe.kordapt.hibernate.xstream.converter.HibernatePersistentCollectionConverter;
import com.korwe.kordapt.hibernate.xstream.converter.HibernateProxyConverter;
import com.thoughtworks.xstream.XStream;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class HibernateCoreAddon implements com.korwe.kordapt.KordaptCoreAddon{

    @Override
    public void preBootHook() {

    }

    @Override
    public void postBootHook(AbstractApplicationContext ctx) {
        if(ctx.containsBean("xstream")){
            XStream xStream = (XStream)ctx.getBean("xstream");
            xStream.registerConverter(new HibernateProxyConverter());
            xStream.registerConverter(new HibernatePersistentCollectionConverter(xStream.getMapper()));
        }

    }
}
