package com.example.patientservice.bl;

import com.example.patientservice.entity.Patient;
import com.example.patientservice.service.PatientService;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiResponse.PatientUIResponse;
import com.example.patientservice.utility.PatientHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



    @Component
    public class PatientBl {


        @Autowired
        PatientService service;

        public String createPatient(PatientUiRequest req)
        {
            Patient p = PatientHelper.convertPatientRequest(req);
            return service.createPatient(p);
            //return null;
        }


        public PatientUIResponse getPatientDetails(int patientId) {
           Patient p=service.getPatientDetails(patientId);
            PatientUIResponse response=PatientHelper.convertToPatientUiRequest(p);
            return response;
        }
    }

