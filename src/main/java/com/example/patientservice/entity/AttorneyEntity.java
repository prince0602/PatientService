package com.example.patientservice.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class AttorneyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private PatientEntity patient;

}
