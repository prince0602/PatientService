package com.example.patientservice.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.patientservice.bl.PatientBl;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiResponse.PatientUIResponse;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("api/patient")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})


public class PatientController {

	@Autowired
	PatientBl bl;

	@Operation(summary = "This endpoint is used to create patient")
	@PostMapping("/createPatient")
	public Long createPatient(@RequestBody PatientUiRequest patientUiRequest) {
		return bl.createPatient(patientUiRequest);
	}

	@Operation(summary = "This endpoint is used to view patient details")
	@GetMapping("/getPatientDetails/{patientId}")
	public PatientUIResponse getPatientDetails(@PathVariable int patientId) {
		System.out.println("Testing");
		return bl.getPatientDetails(patientId);
	}

	/*@Operation(summary = "This endpoint is used to update patient details")
    @PostMapping("/updatePatient/{patientId}")
    public ResponseEntity<String> updatePatient(@PathVariable int patientId, @RequestBody PatientUiRequest patientUiRequest) {
        if (bl.updatePatient(patientId, patientUiRequest)) {
            return ResponseEntity.ok("Patient updated successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Patient not found.");
        }
    }*/

	@GetMapping("/getAllPatients")
	public List<PatientUIResponse> getAllPatients() {
		return bl.getAllPatients();
	}
	
	
	
	

}
