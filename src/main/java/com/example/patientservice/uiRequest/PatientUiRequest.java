package com.example.patientservice.uiRequest;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PatientUiRequest {
	
	private int accountNo;
	private byte[] imageData;
	
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
	private String ssn;
	private String gender;
	private String primaryPhoneNumber;
	private String secondaryPhoneNumber;
	private String releaseOfInfo;
	private String empStatus;
	private String ethnicity;
	private String language;
	private String pcp;
	private String pcg;
	private String prescriptionHistoryConsent;
	private String maritalStatus;
	private double outStandingBalance;
	private String profileImage;
	private List<EmergencyContactUiRequest> emergencyContacts;
	private List<AttorneyUiRequest> attorneyUiRequests;
		
	private String npi;

	private boolean selfResponsibleFlag;
	
	private String emailPermission;
	private String textPermission;
	private String voicePermission;
	private String preferredModeOfCommunication;


}
