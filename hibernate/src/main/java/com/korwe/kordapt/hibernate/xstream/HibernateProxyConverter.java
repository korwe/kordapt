package com.korwe.kordapt.hibernate.xstream; /**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 */
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import org.hibernate.Hibernate;
import org.hibernate.proxy.HibernateProxy;

public class HibernateProxyConverter implements Converter {
    public boolean canConvert(final Class clazz) {
        // be responsible for Hibernate proxy.
        return HibernateProxy.class.isAssignableFrom(clazz);
    }

    public void marshal(final Object object, final HierarchicalStreamWriter writer,
                        final MarshallingContext context) {

        if(Hibernate.isInitialized(object)){
            final Object item = ((HibernateProxy)object).getHibernateLazyInitializer().getImplementation();
            context.convertAnother(item);
        }
    }

    public Object unmarshal(final HierarchicalStreamReader reader,
                            final UnmarshallingContext context) {
        throw new ConversionException("Cannot deserialize Hibernate proxy");
    }
}
