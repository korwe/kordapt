package com.korwe.kordapt.gradle.util

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
class HibernateUtil {
    public static getDialect(JdbcDriver driver){
        switch (driver){
            case JdbcDriver.Postgresql:
                return 'org.hibernate.dialect.PostgreSQL82Dialect'
            default:
                return '<YOUR HIBERNATE DIALECT>'
        }
    }
}
