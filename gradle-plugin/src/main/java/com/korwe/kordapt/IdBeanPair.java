package com.korwe.kordapt;

import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 */
public class IdBeanPair {
    private String id;
    private BeanDefinition beanDef;

    public IdBeanPair(String id, BeanDefinition beanDef) {
        this.id = id;
        this.beanDef = beanDef;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BeanDefinition getBeanDef() {
        return beanDef;
    }

    public void setBeanDef(BeanDefinition beanDef) {
        this.beanDef = beanDef;
    }
}
