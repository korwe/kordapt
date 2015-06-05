package com.korwe.kordapt.api.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tjad on 2015/06/04.
 */
public class Annotation extends ClassType implements Cloneable{

    private Map<String, String> annotationAttributes = new HashMap<>();

    public Annotation() {
        super();
    }

    public Annotation(Annotation annotation){
        super(annotation);
        if(annotation.annotationAttributes != null){
            for(String key : annotation.annotationAttributes.keySet()){
                annotationAttributes.put(key, annotation.annotationAttributes.get(key));
            }
        }
    }

    public Annotation(Class klass) {
        super(klass);
    }

    public Annotation(String packageName, String name) {
        super(packageName, name);
    }

    public Map<String, String> getAnnotationAttributes() {
        return annotationAttributes;
    }

    public void setAnnotationAttributes(Map<String, String> annotationAttributes) {
        this.annotationAttributes = annotationAttributes;
    }

    public Annotation setAttribute(String key, String value){
        annotationAttributes.put(key, value);
        return this;
    }

    public String getAttribute(String key){

        return annotationAttributes.get(key);
    }

    @Override
    public Annotation clone(){
        return new Annotation(this);
    }
}
