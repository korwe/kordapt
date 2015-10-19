package com.korwe.kordapt.api.bean;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 */
public class Type extends ClassType implements Cloneable{
    private Type inheritsFrom;
    private Integer arrayDimension = 0;
    private List<Attribute> attributes = new ArrayList<>();
    private List<Type> typeArguments = new ArrayList<>();


    public Type(){}

    public Type(Type type){
        super(type);
        arrayDimension = type.arrayDimension;
        if(type.attributes != null){
            for (Attribute attribute : type.attributes){
                attributes.add(attribute.clone());
            }
        }

        if(type.typeArguments != null){
            for (Type typeArgument : type.typeArguments){
                typeArguments.add(typeArgument.clone());
            }
        }

        if(type.inheritsFrom!=null){
            inheritsFrom = type.inheritsFrom.clone();
        }

    }

    public Type(Class klass) {
        super(klass);
    }

    public Type(String packageName, String name){
        super(packageName, name);
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



    public List<Type> getTypeArguments() {
        return typeArguments;
    }

    public void setTypeArguments(List<Type> typeArguments) {
        this.typeArguments = typeArguments;
    }


    public Integer getArrayDimension() {
        return arrayDimension;
    }

    public void setArrayDimension(Integer arrayDimension) {
        this.arrayDimension = arrayDimension;
    }

    public String getDeclarationString(){
        String typeDeclarationString = getName() + getArrayDeclarationString();
        typeDeclarationString += getTypeArgumentsString(
            new Function<Type, String>(){
                @Override
                public String apply(Type input) {
                    return input.getDeclarationString();
                }
            }
        );
        return typeDeclarationString;
    }


    public String getDefinitionString(){
        String qualifiedName = getPackageName() == null ? getName() : getPackageName() + "." +getName();
        qualifiedName += getTypeArgumentsString(
            new Function<Type, String>(){
                @Override
                public String apply(Type input) {
                    return input.getDefinitionString();
                }
            }
        );
        return  qualifiedName;
    }

    public String getApiDefinitionString(){
        if("java.util".equals(getPackageName())){
            if("List".equals(getName()) || "Set".equals(getName())){
                Type clone = clone();
                clone.setPackageName(null);
                return clone.getDefinitionString();
            }
        }
        return getDefinitionString();
    }

    public String getArrayDeclarationString(){
        String arrayString = "";
        for(int i = 0 ; i < arrayDimension; i++) {
            arrayString += "[]";
        }

        return arrayString;
    }

    public String getTypeArgumentsString(Function f){
        String typeArgumentString = "";
        if(!(typeArguments == null || typeArguments.isEmpty())){
            typeArgumentString += "<" +
                    Joiner.on(", ").join(Iterables.transform(typeArguments, f)) +
                    ">";
        }
        return typeArgumentString;
    }

    @Override
    public String toString(){ //Overriden to support Joiner in getDefinitionString()
        return getDeclarationString();
    }

    @Override
    public boolean equals(Object o) {
        super.equals(o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Type type = (Type) o;

        if (inheritsFrom != null ? !inheritsFrom.equals(type.inheritsFrom) : type.inheritsFrom != null) return false;
        if (attributes != null ? !attributes.equals(type.attributes) : type.attributes != null) return false;
        if (arrayDimension != null ? !arrayDimension.equals(type.arrayDimension) : type.arrayDimension != null) return false;
        return !(typeArguments != null ? !typeArguments.equals(type.typeArguments) : type.typeArguments != null);

    }

    @Override
    public int hashCode() {
        int result = inheritsFrom != null ? inheritsFrom.hashCode() : 0;
        result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
        result = 31 * result + (typeArguments != null ? typeArguments.hashCode() : 0);
        result = 31 * result + (arrayDimension != null ? arrayDimension.hashCode() : 0);
        return result;
    }

    @Override
    public Type clone(){
        return new Type(this);
    }
}
