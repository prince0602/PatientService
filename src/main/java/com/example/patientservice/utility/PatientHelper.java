package com.example.patientservice.utility;

import com.example.patientservice.entity.Patient;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiResponse.PatientUIResponse;

import java.util.ArrayList;
import java.util.List;

public class PatientHelper {
    public static Patient convertPatientRequest(PatientUiRequest req) {
        Patient p = new Patient();

        // p.setEmail(req.getEmail());
        p.setName(req.getName());
        p.setPhone(req.getPhone());
        p.setEmail(req.getEmail());
        p.setPolicyNumber(req.getPolicyNumber());
        p.setInsuranceProvider(req.getInsuranceProvider());
        p.setGender(req.getGender());

        return p;
    }

    public static PatientUIResponse convertToPatientUiRequest(Patient p) {
        PatientUIResponse uiResponse=new PatientUIResponse();
        p.getEmail();
        p.getId();
        p.getGender();
        p.getName();
        p.getPhone();
        p.getInsuranceProvider();
        p.getPolicyNumber();


        return uiResponse;
    }
}
