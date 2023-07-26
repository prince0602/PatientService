package com.example.patientservice.uiRequest;

import lombok.Data;

import java.time.LocalDate;
@Data
public class MedicalHistoryUiRequest {

	private String diagnosis;
	private String symptoms;
	private String medication;
	private String doctorName;
	private LocalDate appointmentDate;
	private String additionalComments;

}
