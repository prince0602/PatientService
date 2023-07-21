package com.example.patientservice.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.patientservice.bl.PatientBl;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiResponse.PatientUIResponse;

import io.swagger.v3.oas.annotations.Operation;

@RestController

@RequestMapping("api/patient")

public class PatientController {

	@Autowired
	PatientBl bl;

	@Operation(summary = "This endpoint is used to create patient")
	@CrossOrigin(origins = "http://localhost:8092")
	@PostMapping("/createPatient")
	public Long createPatient(@RequestBody PatientUiRequest patientUiRequest) {
		return bl.createPatient(patientUiRequest);
	}

	@Operation(summary = "This endpoint is used to view patient details")
	@GetMapping("/getPatientDetails/{patientId}")
	@CrossOrigin(origins = "http://localhost:8092")
	public PatientUIResponse getPatientDetails(@PathVariable int patientId) {
		System.out.println("Testing");
		return bl.getPatientDetails(patientId);
	}

	@CrossOrigin(origins = "http://localhost:8092")

	@GetMapping("/getAllPatients")
	public List<PatientUIResponse> getAllPatients() {
		return bl.getAllPatients();
	}

}
