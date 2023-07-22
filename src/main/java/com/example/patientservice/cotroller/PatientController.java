package com.example.patientservice.cotroller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< Updated upstream
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> Stashed changes

import com.example.patientservice.bl.PatientBl;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiResponse.PatientUIResponse;
import com.example.patientservice.uiResponse.RefferingProviderDemoData;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("api/patient")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})


public class PatientController {

	@Autowired
	PatientBl bl;

	@Operation(summary = "This endpoint is used to create patient")
	@PostMapping("/createPatient")
	public Long createPatient(@RequestBody PatientUiRequest patientUiRequest)  {
		return bl.createPatient(patientUiRequest);
	}

	@Operation(summary = "This endpoint is used to view patient details")
	@GetMapping("/getPatientDetails/{patientId}")
	public PatientUIResponse getPatientDetails(@PathVariable int patientId) {
		System.out.println("Testing");
		return bl.getPatientDetails(patientId);
	}

	@GetMapping("/getAllPatients")
	public List<PatientUIResponse> getAllPatients() {
		return bl.getAllPatients();
	}
<<<<<<< Updated upstream
	
	@PostMapping("/getAllRefferal")
	public List<RefferingProviderDemoData> getNpdiResponse()
	{
		return bl.getNpdiDetails();
		}

=======
>>>>>>> Stashed changes
}
