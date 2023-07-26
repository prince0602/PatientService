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

<<<<<<< Updated upstream
    public ReferringProviderUiRequest(String npi, String npiType, String specialty, String providerFirstName, String providerLastName, String organisationName) {
        this.npi = npi;
        this.npiType = npiType;
        this.specialty = specialty;
        this.providerFirstName = providerFirstName;
        this.providerLastName = providerLastName;
        this.organisationName = organisationName;
    }
//changed data
    public String getNpi() {
        return npi;
    }

    public void setNpi(String npi) {
        this.npi = npi;
    }

    public String getNpiType() {
        return npiType;
    }

    public void setNpiType(String npiType) {
        this.npiType = npiType;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getProviderFirstName() {
        return providerFirstName;
    }

    public void setProviderFirstName(String providerFirstName) {
        this.providerFirstName = providerFirstName;
    }

    public String getProviderLastName() {
        return providerLastName;
    }

    public void setProviderLastName(String providerLastName) {
        this.providerLastName = providerLastName;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }
=======

>>>>>>> Stashed changes
}
