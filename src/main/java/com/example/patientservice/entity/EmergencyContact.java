package com.example.patientservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@Entity
@Builder
@AllArgsConstructor
public class EmergencyContact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emergencyContactId")
	private Long emergencyContactId;
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

	public EmergencyContact() {

	}

	


}
