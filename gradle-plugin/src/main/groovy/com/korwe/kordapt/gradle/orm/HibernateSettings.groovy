package com.korwe.kordapt.gradle.orm

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 * */
class HibernateSettings extends OrmSettings{

    public HibernateSettings(){
        name  = OrmName.Hibernate
    }

    def dialect
    def transactionManager = 'org.springframework.orm.hibernate4.HibernateTransactionManager'
    def domainPackage
}
