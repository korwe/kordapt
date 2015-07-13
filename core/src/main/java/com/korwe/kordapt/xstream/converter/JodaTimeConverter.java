package com.korwe.kordapt.xstream.converter;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 */
public class JodaTimeConverter implements Converter {
    private final String timeStampFormat = "yyyyMMdd'T'HHmmss.SSS";
    @Override
    public void marshal(Object o, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        marshallingContext.convertAnother(((DateTime)o).toString(timeStampFormat));
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        return DateTimeFormat.forPattern(timeStampFormat).parseDateTime(hierarchicalStreamReader.getValue());
    }

    @Override
    public boolean canConvert(Class aClass) {
        return DateTime.class.isAssignableFrom(aClass);
    }
}
