package com.korwe.kordapt.plugin;

import com.google.common.base.CaseFormat;
import com.korwe.kordapt.api.bean.Annotation;
import com.korwe.kordapt.api.bean.Attribute;
import com.korwe.kordapt.api.bean.Service;
import com.korwe.kordapt.api.bean.Type;
import com.korwe.kordapt.api.util.ApiUtil;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.Scanner;

/**
 * Created by tjad on 2015/06/04.
 */
public class HibernatePlugin implements com.korwe.kordapt.gradle.plugin.KordaptGeneratorPlugin {
    private Scanner scanner;

    @Override
    public void changeTypeDefinition(Type typeDefinition) {
        scanner = new Scanner(System.in);
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
            else if(ApiUtil.isCollection(attribute.getType())){
                loop: do{
                    System.out.printf("\nChoose entity relationship type for attribute[%s] with type[%s]:\n", attribute.getName(), attribute.getType().getDefinitionString());
                    System.out.println("one-to-many(12m) : many-to-many(m2m) : none");
                    String input = "12m";
                    switch (input) {
                        case "12m":
                            String name = attribute.getType().getTypeArguments().get(0).getName();
                            String mappedBy = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, name);
                            attribute.addAnnotation(
                                    new Annotation(OneToMany.class).setAttribute("mappedBy", mappedBy)
                            );
                            break loop;
                        case "m2m":
                            attribute.addAnnotation(new Annotation(ManyToMany.class));
                            attribute.addAnnotation(
                                    new Annotation(JoinColumns.class)
                                            .addValue(
                                                    new Annotation(JoinColumn.class)
                                                            .setAttribute("name", CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, attribute.getName()).concat("_id"))
                                                            .setAttribute("referencedColumnName", "id")
                                            )
                                            .addValue(new Annotation(JoinColumn.class)
                                                            .setAttribute("name", CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, typeDefinition.getName()).concat("_id"))
                                                            .setAttribute("referencedColumnName", "id")
                                            )
                            );
                            break loop;
                        case "none":
                            break loop;
                        default:
                    }
                }while (true);
            }
            else {
                loop: do {

                    System.out.printf("\nChoose entity relationship type for attribute[%s] with type[%s]:\n", attribute.getName(), attribute.getType().getDefinitionString());
                    System.out.println("one-to-one(121) : many-to-one(m21) : none");
                    String input = "m21";
                    switch (input){
                        case "121":
                            attribute.addAnnotation(new Annotation(OneToOne.class));
                            attribute.addAnnotation(
                                    new Annotation(JoinColumn.class)
                                            .setAttribute("name", CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, attribute.getName()).concat("_id"))
                                            .setAttribute("referencedColumnName", "id")
                            );
                            break loop;
                        case "m21":
                            attribute.addAnnotation(new Annotation(ManyToOne.class));
                            attribute.addAnnotation(
                                    new Annotation(JoinColumn.class)
                                            .setAttribute("name", CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, attribute.getName()).concat("_id"))
                                            .setAttribute("referencedColumnName", "id")
                            );
                            break loop;

                        case "none":
                            break loop;
                        default:

                    }
                }while (true);
            }
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
