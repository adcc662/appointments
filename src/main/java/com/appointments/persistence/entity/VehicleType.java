package com.appointments.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "vehicle_type")
public class VehicleType {

    @Id
    private Long id;
    private String type;

    @OneToMany(mappedBy = "vehicleType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Model> models;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }
}
