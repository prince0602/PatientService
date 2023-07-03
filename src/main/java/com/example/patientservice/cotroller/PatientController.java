package com.example.patientservice.cotroller;

import com.example.patientservice.bl.PatientBl;
import com.example.patientservice.entity.Patient;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiResponse.PatientUIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/patient")
public class PatientController {
    @Autowired
    PatientBl bl;

    @PostMapping("/createPatient")
    public  String createPatient(@RequestBody PatientUiRequest patientUiRequest){
        return bl.createPatient(patientUiRequest);
    }
    @GetMapping("/getPatientDetails/{patientId}")

    public PatientUIResponse getPatient(@RequestParam int patientId){
        return bl.getPatientDetails(patientId);
    }

}
