package com.example.patientservice.uiRequest;

import lombok.Data;

@Data
public class ReferringProviderUiRequest {

    private String npi;
    private String npiType;
    private String specialty;
    private String providerFirstName;
    private String providerLastName;
    private String organisationName;
}
