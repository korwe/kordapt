package com.korwe.kordapt.gradle.orm

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 * */
public enum OrmName {
    Hibernate('org.hibernate.Hibernate')

    def classId

    public OrmName(classId){
        this.classId = classId
    }

}
