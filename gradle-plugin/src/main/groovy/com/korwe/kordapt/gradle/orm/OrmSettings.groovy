package com.korwe.kordapt.gradle.orm

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 * */
class OrmSettings {

    OrmName name;

    public boolean getIsHibernate(){
        OrmName.Hibernate.equals(name)
    }
}
