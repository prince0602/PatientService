package com.example.patientservice.uiRequest;

import lombok.Data;

import java.time.LocalDate;

@Data
public class GuarantorUiRequest {
    private String guarantorRecordNumber;
    private String name;
    private String firstName;
    private String type;
    private String phone;
    private String gender;
    private LocalDate dateOfBirth;
}
