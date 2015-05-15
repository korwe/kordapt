package com.korwe.kordapt.api.bean;

import java.util.List;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
public class Service {
    private String name;
    private List<ServiceFunction> functions;
    private String packageName;
    private String description;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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
