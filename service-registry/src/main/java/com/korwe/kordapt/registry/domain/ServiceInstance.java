package com.korwe.kordapt.registry.domain;


import javax.persistence.*;

/**
 * This file was generated using Kordapt
 */
@Entity
@Table(name = "service_instance")
public class ServiceInstance extends AbstractEntity{
    private String queueName;
    private Service service;
    private String description;



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