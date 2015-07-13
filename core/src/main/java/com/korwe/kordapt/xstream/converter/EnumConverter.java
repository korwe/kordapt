package com.korwe.kordapt.xstream.converter;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 */
public class EnumConverter implements Converter {

    @Override
    public void marshal(Object o, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        final Enum e = (Enum)o;
        hierarchicalStreamWriter.startNode("id");
        hierarchicalStreamWriter.setValue(String.valueOf(e.ordinal()));
        hierarchicalStreamWriter.endNode();
        hierarchicalStreamWriter.startNode("name");
        hierarchicalStreamWriter.setValue(e.name());
        hierarchicalStreamWriter.endNode();
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {

        String name = null;
        while(hierarchicalStreamReader.hasMoreChildren() && name == null){

            hierarchicalStreamReader.moveDown();
            if("name".equals(hierarchicalStreamReader.getNodeName())){
                name = hierarchicalStreamReader.getValue();
                hierarchicalStreamReader.moveUp();
            }
            else
                hierarchicalStreamReader.moveUp();
        }
        if(name == null) return null;

        return Enum.valueOf(unmarshallingContext.getRequiredType(), name);
    }

    @Override
    public boolean canConvert(Class aClass) {
        return aClass.isEnum();
    }
}
