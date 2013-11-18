package com.korwe.kordapt;

import java.util.List;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
public class Service {
    private String name;
    private List<ServiceFunction> functions;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ServiceFunction> getFunctions() {
        return functions;
    }

    public void setFunctions(List<ServiceFunction> functions) {
        this.functions = functions;
    }

    public String getIdentifierName(){
        return this.name.substring(0,1).toLowerCase()+this.name.substring(1);
    }
}
