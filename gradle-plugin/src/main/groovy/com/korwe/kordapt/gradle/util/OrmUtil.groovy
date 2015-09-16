package com.korwe.kordapt.gradle.util

import com.korwe.kordapt.gradle.orm.HibernateSettings
import com.korwe.kordapt.gradle.orm.OrmName
import org.gradle.api.Project

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 * */
class OrmUtil {
    static def getOrmName(Project project){
        OrmName.values().find {
            ClasspathUtil.checkRuntimeForClass(project, it.classId)
        }
    }

    static def getOrmSettings(OrmName ormName){
        switch (ormName){
            case OrmName.Hibernate:
                return new HibernateSettings()
            default:
                return null
        }
    }
}
