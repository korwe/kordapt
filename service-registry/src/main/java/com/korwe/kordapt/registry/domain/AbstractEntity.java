package com.korwe.kordapt.registry.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {
    private Long id;

    @Id
    @GenericGenerator(name = "primaryKeyGenerator", strategy = "org.hibernate.id.enhanced.TableGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "optimizer", value = "pooled"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "prefer_entity_table_as_segment_value", value = "true") })
    @GeneratedValue(generator = "primaryKeyGenerator")
    @Column(name = "id")
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
}
