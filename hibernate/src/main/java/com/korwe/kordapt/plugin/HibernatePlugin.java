package com.korwe.kordapt.plugin;

import com.google.common.base.CaseFormat;
import com.korwe.kordapt.api.bean.Annotation;
import com.korwe.kordapt.api.bean.Attribute;
import com.korwe.kordapt.api.bean.Service;
import com.korwe.kordapt.api.bean.Type;
import com.korwe.kordapt.api.util.ApiUtil;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by tjad on 2015/06/04.
 */
public class HibernatePlugin implements com.korwe.kordapt.gradle.plugin.KordaptGeneratorPlugin {
    @Override
    public void changeTypeDefinition(Type typeDefinition) {
        typeDefinition.addAnnotation(new Annotation(Entity.class));
        typeDefinition.addAnnotation(
                new Annotation(Table.class).setAttribute("name", CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, typeDefinition.getName())
                ));

        for(Attribute attribute : typeDefinition.getAttributes()){
            if(ApiUtil.isBasicType(attribute.getType())) {
                attribute.addAnnotation(
                        new Annotation(Column.class).setAttribute("name", CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, attribute.getName())
                        ));
            }
            //TODO: Handle many2many, 121, many21, 12many
        }
    }

    @Override
    public void changeServiceDefinition(Service serviceDefinition) {

    }

    @Override
    public void changeServiceDefinitionImpl(Service serviceDefinition) {
        serviceDefinition.addAnnotation(
                new Annotation(Transactional.class)
        );
    }

    @Override
    public void changeServiceDefinitionAdapter(Service serviceDefinition) {

    }


}
