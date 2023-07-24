package com.example.patientservice.uiResponse;

public class ReferringProviderUiResponse {
	private String npi;
    private String npiType;
    private String specialty;
    private String providerFirstName;
    private String providerLastName;
    private String organisationName;
	public String getNpi() {
		return npi;
	}
	public void setNPI(String npi) {
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
}
