package com.korwe.kordapt.gradle.util

import org.gradle.api.Project

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 * */
class JdbcUtil{
    static JdbcDriver jdbcDriverClassName(Project project){
        JdbcDriver.values().find {
            ClasspathUtil.checkRuntimeForClass(project, it.driverClass)
        }
    }

    static String jdbcUrl(JdbcDriver jdbcDriver){
        switch (jdbcDriver){
            case JdbcDriver.Postgresql:
                return 'jdbc:postgresql://${db.host}:${db.port}/${db.database}?characterEncoding=utf8'
            default:
                return '<YOUR DATABASE URL>'
        }
    }
}
