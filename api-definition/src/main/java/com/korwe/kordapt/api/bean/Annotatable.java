package com.korwe.kordapt.api.bean;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by tjad on 2015/06/04.
 */
public abstract class Annotatable{
    private List<Annotation> annotations = new ArrayList<>();

    public Annotatable(){

    }

    public Annotatable(Annotatable annotatable){
        if(annotatable.annotations != null){
            for(Annotation annotation : annotatable.annotations){
                annotations.add(annotation.clone());
            }
        }
    }

    public List<Annotation> getAnnotations() {
        if(annotations == null){
            annotations = new ArrayList<>();
        }
        return annotations;
    }

    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    public void addAnnotation(Annotation annotation){
        getAnnotations().add(annotation);
    }

}
