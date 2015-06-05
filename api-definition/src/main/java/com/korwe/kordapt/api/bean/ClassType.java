package com.korwe.kordapt.api.bean;

/**
 * Created by tjad on 2015/06/04.
 */
public abstract class ClassType extends Annotatable{
    private String name;
    private String packageName;

    public ClassType(){
        super();
    }

    public ClassType(ClassType classType){
        super(classType);
        this.name = classType.name;
        this.packageName = classType.packageName;
    }

    public ClassType(String packageName, String name){
        this.name = name;
        this.packageName = packageName;
    }

    public ClassType(Class klass){
        this.name = klass.getSimpleName();
        this.packageName = klass.getPackage().getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getIdentifierName(){
        return name.substring(0, 1).toLowerCase()+name.substring(1);
    }

    public String getFullQualifiedName(){
        return this.packageName == null ? this.name : this.packageName + '.' + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassType classType = (ClassType) o;

        if (name != null ? !name.equals(classType.name) : classType.name != null) return false;
        return !(packageName != null ? !packageName.equals(classType.packageName) : classType.packageName != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (packageName != null ? packageName.hashCode() : 0);
        return result;
    }

}
