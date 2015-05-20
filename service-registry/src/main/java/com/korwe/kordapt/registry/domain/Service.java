package com.korwe.kordapt.registry.domain;


import javax.persistence.*;

/**
 * This file was generated using Kordapt
 */
@Entity
@Table(name = "service")
public class Service{
    private String id;
    private String name;
    private String description;
    private ServiceProvider provider;
    private byte[] apiDef;

    @Id
    @Column(name = "id")
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne()
    @JoinColumn(name="provider")
    public ServiceProvider getProvider() {
        return provider;
    }

    public void setProvider(ServiceProvider provider) {
        this.provider = provider;
    }

    @Column(name = "api_definition_data")
    public byte[] getApiDef() {
        return apiDef;
    }

    public void setApiDef(byte[] apiDef) {
        this.apiDef = apiDef;
    }
}