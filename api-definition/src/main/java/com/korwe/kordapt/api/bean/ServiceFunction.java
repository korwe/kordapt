package com.korwe.kordapt.api.bean;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
public class ServiceFunction extends Annotatable implements Cloneable{
    private String name;
    private String description;
    private List<ServiceFunctionParameter> parameters = new ArrayList<>();
    private Type returnType;

    public ServiceFunction(){}

    public ServiceFunction(ServiceFunction serviceFunction){
        name = serviceFunction.name;
        description = serviceFunction.description;
        if(serviceFunction.returnType != null){
            returnType = serviceFunction.returnType.clone();
        }

        if(serviceFunction.parameters!=null){
            for(ServiceFunctionParameter sfp : serviceFunction.parameters){
                parameters.add(sfp.clone());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ServiceFunctionParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<ServiceFunctionParameter> parameters) {
        this.parameters = parameters;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public Boolean getMultiParam(){
        return this.parameters != null && this.parameters.size() > 1;
    }

    @Override
    public ServiceFunction clone(){
        return new ServiceFunction(this);
    }
}
