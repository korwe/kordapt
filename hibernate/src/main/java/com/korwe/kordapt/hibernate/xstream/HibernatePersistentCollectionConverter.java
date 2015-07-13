package com.korwe.kordapt.hibernate.xstream; /**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 */
/*
 * Copyright (C) 2011, 2012 XStream Committers.
 * All rights reserved.
 *
 * The software in this package is published under the terms of the BSD
 * style license a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 *
 * Created on 19. April 2011 by Joerg Schaible
 */

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;
import org.hibernate.collection.internal.PersistentBag;
import org.hibernate.collection.internal.PersistentList;
import org.hibernate.collection.internal.PersistentSet;


public class HibernatePersistentCollectionConverter extends CollectionConverter {

    public HibernatePersistentCollectionConverter(final Mapper mapper) {
        super(mapper);
    }

    public boolean canConvert(final Class type) {
        return type == PersistentBag.class
                || type == PersistentList.class
                || type == PersistentSet.class;
    }

    @Override
    public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        if(org.hibernate.Hibernate.isInitialized(source)){
            super.marshal(source, writer, context);
        }
    }

    @Override


    public Object unmarshal(final HierarchicalStreamReader reader,
                            final UnmarshallingContext context) {
        return super.unmarshal(reader, context);
    }
}