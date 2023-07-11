package com.example.patientservice.uiRequest;

import java.time.LocalDate;

public class MedicalHistoryUiRequest {

	private String diagnosis;
	private String symptoms;
	private String medication;
	private String doctorName;
	private LocalDate appointmentDate;
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
}
