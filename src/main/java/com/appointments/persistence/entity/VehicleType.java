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
}
