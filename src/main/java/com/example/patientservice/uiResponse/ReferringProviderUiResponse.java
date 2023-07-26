package com.example.patientservice.uiResponse;

import lombok.Data;

@Data
public class ReferringProviderUiResponse {
	private String npi;
    private String npiType;
    private String specialty;
    private String providerFirstName;
    private String providerLastName;
    private String organisationName;


}
