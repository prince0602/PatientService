package com.example.patientservice.uiResponse;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PatientUIResponse {
    private Long id;
    private int accountNo;
    private String prefix;
    private String lastName;
    private String suffix;
    private String firstName;
    private String middleName;

    private String preferredName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String county;
    private String zip;
    private String country;
    private String email;
    private LocalDate dateOfBirth;
    private String Gender;
    private String ssn;
    private String primaryPhoneNumber;
    private String 	secondaryPhoneNumber;
    private  String releaseOfInfo;
    private String empStatus;
    private String ethnicity;
    private String language;
    private String pcp;
    private String pcg;
    private String prescriptionHistoryConsent;
    private String maritalStatus;
    private double outStandingBalance;
    private List<MedicalHistoryUiResponse> listOfMedicalHistory;
    private List<EmergencyContactUiResponse> listOfEmergencyContacts;
    private String profileImage;

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public List<EmergencyContactUiResponse> getListOfEmergencyContacts() {
        return listOfEmergencyContacts;
    }

    public void setListOfEmergencyContacts(List<EmergencyContactUiResponse> listOfEmergencyContacts) {
        this.listOfEmergencyContacts = listOfEmergencyContacts;
    }

    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public String getSecondaryPhoneNumber() {
        return secondaryPhoneNumber;
    }

    public void setSecondaryPhoneNumber(String secondaryPhoneNumber) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
    }



    public String getReleaseOfInfo() {
        return releaseOfInfo;
    }

    public void setReleaseOfInfo(String releaseOfInfo) {
        this.releaseOfInfo = releaseOfInfo;
    }



    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPcp() {
        return pcp;
    }

    public void setPcp(String pcp) {
        this.pcp = pcp;
    }

    public String getPcg() {
        return pcg;
    }

    public void setPcg(String pcg) {
        this.pcg = pcg;
    }

    public String getPrescriptionHistoryConsent() {
        return prescriptionHistoryConsent;
    }

    public void setPrescriptionHistoryConsent(String prescriptionHistoryConsent) {
        this.prescriptionHistoryConsent = prescriptionHistoryConsent;
    }



    public List<MedicalHistoryUiResponse> getListOfMedicalHistory() {
		return listOfMedicalHistory;
	}

	public void setListOfMedicalHistory(List<MedicalHistoryUiResponse> listOfMedicalHistory) {
		this.listOfMedicalHistory = listOfMedicalHistory;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public double getOutStandingBalance() {
        return outStandingBalance;
    }

    public void setOutStandingBalance(double outStandingBalance) {
        this.outStandingBalance = outStandingBalance;
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

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
