package com.korwe.kordapt.registry.domain;


import javax.persistence.*;

/**
 * This file was generated using Kordapt
 */
@Entity
@Table(name = "service")
public class Service extends AbstractEntity{
    private String name;
    private String description;
    private ServiceProvider provider;
    private byte[] apiDef;

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
    @JoinColumn(name="service_provider_id")
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