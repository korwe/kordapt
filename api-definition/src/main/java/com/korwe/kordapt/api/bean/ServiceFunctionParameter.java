package com.korwe.kordapt.api.bean;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
public class ServiceFunctionParameter extends Annotatable implements Cloneable{
    private String name;
    private Type type;
    private String description;

    public ServiceFunctionParameter(){
        super();
    }

    public ServiceFunctionParameter(ServiceFunctionParameter serviceFunctionParameter){
        name = serviceFunctionParameter.name;
        description = serviceFunctionParameter.description;

        if(serviceFunctionParameter.type != null){
            type = serviceFunctionParameter.type.clone();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public ServiceFunctionParameter clone(){
        return new ServiceFunctionParameter(this);
    }
}
