package com.appointments.persistence.entity;

import jakarta.persistence.*;


import java.time.*;
import java.util.List;

@Entity
@Table(name = "schedule")
public class Schedule {

    @Id
    private Long id;
    private LocalDate time_from;
    private LocalDate time_to;
    private String plan;
    private String actual;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contact> contacts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getTime_from() {
        return time_from;
    }

    public void setTime_from(LocalDate time_from) {
        this.time_from = time_from;
    }

    public LocalDate getTime_to() {
        return time_to;
    }

    public void setTime_to(LocalDate time_to) {
        this.time_to = time_to;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
