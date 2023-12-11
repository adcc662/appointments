package com.appointments.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "model")
public class Model {
    @Id
    private Long id;
    private String model_name;

    @OneToMany(mappedBy = "model", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Vehicle> vehicles;

    @ManyToOne
    @JoinColumn(name = "vehicle_type_id", referencedColumnName = "id")
    private VehicleType vehicleType;
}
