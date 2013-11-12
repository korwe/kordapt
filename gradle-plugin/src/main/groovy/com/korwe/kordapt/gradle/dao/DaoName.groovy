package com.korwe.kordapt.gradle.dao

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
public enum DaoName {
    HibernateDao('com.korwe.kordapt.hibernate.GenericDAO')

    def classId

    public DaoName(classId){
        this.classId = classId
    }
}
