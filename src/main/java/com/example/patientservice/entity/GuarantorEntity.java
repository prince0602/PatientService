package com.example.patientservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class GuarantorEntity {

    @Id
    private String guarantorRecordNumber;
    private String name;
    private String firstName;
    private String type;
    private String phone;
    private String gender;
    private LocalDate dateOfBirth;
}
