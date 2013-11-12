package com.korwe.kordapt.gradle.util

import com.korwe.kordapt.gradle.dao.DaoName
import org.gradle.api.Project

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
class DaoUtil {

    static def getDaoName(Project project){
        DaoName.values().find {
            ClasspathUtil.checkRuntimeForClass(project, it.classId)
        }
    }
}
