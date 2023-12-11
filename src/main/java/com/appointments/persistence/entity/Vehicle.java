package com.appointments.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue
    private long id;
    private String details;
    private String license;

    @Column(name = "manufactured_year")
    private LocalDate manufactYear;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="model_id", referencedColumnName = "id")
    private Model model;


}
