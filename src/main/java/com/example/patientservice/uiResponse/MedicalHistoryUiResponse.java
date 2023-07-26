package com.example.patientservice.uiResponse;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MedicalHistoryUiResponse {

	
	private String diagnosis;
	private String symptoms;
	private String medication;
	private String doctorName;
	private LocalDate appointmentDate;
	private String additionalComments;

}
