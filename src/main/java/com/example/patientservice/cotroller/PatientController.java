package com.example.patientservice.cotroller;

import com.example.patientservice.bl.PatientBl;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiResponse.PatientUIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/patient")
public class PatientController {

    @Autowired
    PatientBl bl;


    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public ResponseEntity<String> createPatient(@PathVariable(value = "patientId", required = false) Long patientId, @RequestBody PatientUiRequest patientUiRequest){
            if(patientId==null) return ResponseEntity.ok(bl.createPatient(patientUiRequest));
            else{
                return bl.updatePatientDetails(patientId,patientUiRequest);
            }


    }
    @GetMapping("/getPatientDetails/{patientId}")

    public PatientUIResponse getPatientDetails(@PathVariable int patientId){
        System.out.println("Testing");
        return bl.getPatientDetails(patientId);
    }


}
