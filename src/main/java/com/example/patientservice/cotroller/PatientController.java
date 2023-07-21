package com.example.patientservice.cotroller;

import java.io.IOException;
import java.util.List;

import com.example.patientservice.entity.Patient;
import com.example.patientservice.repository.PatientRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.web.bind.annotation.*;

import com.example.patientservice.bl.PatientBl;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiResponse.PatientUIResponse;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.multipart.MultipartFile;


@RestController

@RequestMapping("api/patient")

public class PatientController {


    @Autowired
    PatientBl bl;
    private PatientRepo patientRepo;

    @Operation(
    		summary = "This endpoint is used to create patient")
    @PostMapping("/createPatient")
    public Long createPatient(@RequestBody PatientUiRequest patientUiRequest){
            return bl.createPatient(patientUiRequest);
    } 
    
    
    @Operation(
    		summary = "This endpoint is used to view patient details")
    @GetMapping("/getPatientDetails/{patientId}")

    public PatientUIResponse getPatientDetails(@PathVariable int patientId){
        System.out.println("Testing");
        return bl.getPatientDetails(patientId);
    }
    
    @GetMapping("/getAllPatients")
    public List<PatientUIResponse> getAllPatients()
    {
    	return bl.getAllPatients();
    }





}
