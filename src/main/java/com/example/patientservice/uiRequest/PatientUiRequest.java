package com.example.patientservice.uiRequest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PatientUiRequest {
	private int accountNo;
	private String prefix;
	private String lastName;
	private String suffix;
	private String firstName;
	private String middleInitial;
	private String previousName;
	private String preferredName;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String county;
	private String zip;
	private String country;
	private String homePhone;
	private String cellPhone;
	private String workPhone;
	private String extension;
	private String email;
	private LocalDate dateOfBirth;
	private String sex;
	private String ssn;
	private List<MedicalHistoryUiRequest> medicalHistoryUiRequests;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getPreviousName() {
		return previousName;
	}

	public void setPreviousName(String previousName) {
		this.previousName = previousName;
	}

	public String getPreferredName() {
		return preferredName;
	}

	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public List<MedicalHistoryUiRequest> getMedicalHistoryUiRequests() {
		return medicalHistoryUiRequests;
	}

	public void setMedicalHistoryUiRequests(List<MedicalHistoryUiRequest> medicalHistoryUiRequests) {
		this.medicalHistoryUiRequests = medicalHistoryUiRequests;
	}

	public List<MedicalHistoryUiRequest> getMedicalHistory() {
		return medicalHistoryUiRequests;
	}

	public void setMedicalHistory(List<MedicalHistoryUiRequest> medicalHistoryUiRequests) {
		this.medicalHistoryUiRequests = medicalHistoryUiRequests;
	}

}
