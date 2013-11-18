package com.korwe.kordapt;

import java.util.List;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class Type {
    private String name;
    private String packageName;
    private Type inheritsFrom;
    private List<Attribute> attributes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getInheritsFrom() {
        return inheritsFrom;
    }

    public void setInheritsFrom(Type inheritsFrom) {
        this.inheritsFrom = inheritsFrom;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }


    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getFullQualifiedName(){
        return this.packageName == null ? this.name : this.packageName + '.' + this.name;
    }
}
