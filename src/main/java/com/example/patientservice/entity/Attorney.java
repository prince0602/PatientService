package com.example.patientservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Attorney {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patientId")
    private Long AttorneyId;
    private String firstName;
    private String lastName;
    private String phone;
    private String officeAdd;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String notes;


}
