package com.korwe.kordapt.registry.domain;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * This file was generated using Kordapt
 */
@Entity
@Table(name = "service_instance")
public class ServiceInstance {
    private Long id;
    private String queueName;
    private Service service;
    private String description;

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

    @Column(name = "queue_name")
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "id")
    public Service getService(){
        return service;
    }

    public void setService(Service service){
        this.service = service;
    }

    @Column(name="description")
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}