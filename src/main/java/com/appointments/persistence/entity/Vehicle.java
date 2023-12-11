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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public LocalDate getManufactYear() {
        return manufactYear;
    }

    public void setManufactYear(LocalDate manufactYear) {
        this.manufactYear = manufactYear;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
