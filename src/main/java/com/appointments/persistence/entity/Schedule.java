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


}
