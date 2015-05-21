package com.korwe.kordapt.registry.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "`service_provider`")
public class ServiceProvider extends AbstractEntity{
    private String name;
    private String groupId;
    private Set<Service> services;


    @OneToMany(mappedBy = "provider")
    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "group_id")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
