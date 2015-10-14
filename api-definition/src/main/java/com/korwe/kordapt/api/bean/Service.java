package com.korwe.kordapt.api.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 * */
public class Service extends ClassType implements Cloneable{
    private List<ServiceFunction> functions = new ArrayList<>();

    public Service() {
        super();
    }

    public Service(Service service){
        super(service);
        if(service.functions!=null){
            for(ServiceFunction serviceFunction : service.functions){
                functions.add(serviceFunction.clone());
            }
        }

    }
    public Service(Class klass) {
        super(klass);
    }

    public Service(String packageName, String name) {
        super(packageName, name);
    }



    public List<ServiceFunction> getFunctions() {
        return functions;
    }

    public void setFunctions(List<ServiceFunction> functions) {
        this.functions = functions;
    }

    @Override
    public Service clone(){
        return new Service(this);
    }
}
