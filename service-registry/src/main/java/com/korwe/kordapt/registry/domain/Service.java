package com.korwe.kordapt.registry.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This file was generated using Kordapt
 */
@Entity
@Table(name = "service")
public class Service{
    private String id;

    @Id
    @Column(name = "id")
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
}