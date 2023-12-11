package com.appointments.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "contact_type")
public class ContactType {

    @Id
    private Long id;
    private String type_name;

    @OneToMany(mappedBy = "contactType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contact> contacts;

}
