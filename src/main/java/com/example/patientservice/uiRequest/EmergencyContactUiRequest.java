package com.example.patientservice.uiRequest;

import lombok.Data;

@Data
public class EmergencyContactUiRequest {
	//r First Name(required), Last Name(Required), Relation(Required), 
	//Phone Number(required), Ext(Optional),
	//Address Line 1 and 2, City, State, zip Code, Country.
	
	private String firstName;
	private String lastName;
	private String relation;
	private String phoneNumber;
	private String ext;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	
	

	
}
