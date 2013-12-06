package com.korwe.kordapt.registry.domain;


import javax.persistence.*;

/**
 * This file was generated using Kordapt
 */
@Entity
@Table(name = "service_instance")
public class ServiceInstance {
    private String id;
    private Service service;
    private String description;

    @Id
    @Column(name = "id")
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
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