package com.korwe.kordapt.gradle

import org.springframework.beans.factory.config.ConstructorArgumentValues
import org.springframework.beans.factory.config.RuntimeBeanReference


/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * */
class KordaptInit {

    static void setup(){
        ConstructorArgumentValues.ValueHolder.metaClass.isReference = {
            RuntimeBeanReference.isAssignableFrom(delegate.value.class)
        }


        org.springframework.beans.PropertyValue.metaClass.isReference = {
            RuntimeBeanReference.isAssignableFrom(delegate.value.class)
        }
    }


}
