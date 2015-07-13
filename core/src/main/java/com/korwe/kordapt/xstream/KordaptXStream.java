package com.korwe.kordapt.xstream;

import com.korwe.kordapt.xstream.converter.EnumConverter;
import com.korwe.kordapt.xstream.converter.JodaTimeConverter;
import com.thoughtworks.xstream.XStream;
import org.joda.time.DateTime;

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 */
public class KordaptXStream extends XStream {
    public KordaptXStream(){
        super();
        registerConverter(new JodaTimeConverter());
        registerConverter(new EnumConverter());
        alias("DateTime", DateTime.class);
    }

}
