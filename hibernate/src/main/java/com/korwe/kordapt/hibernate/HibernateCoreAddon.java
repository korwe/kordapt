package com.korwe.kordapt.hibernate;

import com.korwe.kordapt.hibernate.xstream.HibernatePersistentCollectionConverter;
import com.korwe.kordapt.hibernate.xstream.HibernateProxyConverter;
import com.thoughtworks.xstream.XStream;
import org.hibernate.collection.internal.PersistentBag;
import org.hibernate.collection.internal.PersistentList;
import org.hibernate.collection.internal.PersistentSet;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
            xStream.addDefaultImplementation(PersistentList.class, List.class);
            xStream.addDefaultImplementation(PersistentBag.class, List.class);
            xStream.addDefaultImplementation(PersistentSet.class, Set.class);
        }

    }
}
