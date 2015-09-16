package com.korwe.kordapt.gradle.util

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 * */
public enum JdbcDriver {
    Postgresql('org.postgresql.Driver')

    public JdbcDriver(driverClass){
        this.driverClass = driverClass
    }

    String driverClass;

}
