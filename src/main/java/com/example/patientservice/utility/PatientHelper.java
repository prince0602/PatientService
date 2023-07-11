package com.example.patientservice.utility;

import com.example.patientservice.entity.MedicalHistory;
import com.example.patientservice.entity.Patient;
import com.example.patientservice.repository.MedicalHistoryRepo;
import com.example.patientservice.uiRequest.MedicalHistoryUiRequest;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiResponse.PatientUIResponse;

import java.util.ArrayList;
import java.util.List;

public class PatientHelper {
    public static Patient convertPatientRequest(PatientUiRequest req) {
        Patient p = new Patient();

        
        p.setAccountNo( req.getAccountNo());
        p.setAddressLine1(req.getAddressLine1());
        req.getAddressLine2();
        req.getCellPhone();
        req.getCity();
        req.getCountry();
        req.getDateOfBirth();
        req.getCounty();
        req.getEmail();
        req.getExtension();
        p.setFirstName(req.getFirstName());
        req.getLastName();
        req.getHomePhone();
        req.getMiddleInitial();
        req.getPreferredName();
        req.getSex();
        req.getSsn();
        req.getState();
        req.getZip();
        req.getWorkPhone();
        req.getSuffix();
        req.getPreviousName();
        
        
        
        
        
        List<MedicalHistory> medicalHistories=new ArrayList<MedicalHistory>();
        List<MedicalHistoryUiRequest> medicalHistoryUiRequests=req.getMedicalHistory();
        for(MedicalHistoryUiRequest mReq:medicalHistoryUiRequests){
            MedicalHistory mh=new MedicalHistory();
            mreq.g
        }
        //p.setMedicalHistory(medicalHistories);


        return p;
    }

    public static PatientUIResponse convertToPatientUiRequest(Patient p) {
        PatientUIResponse uiResponse=new PatientUIResponse();

        uiResponse.setEmail(p.getEmail());
        uiResponse.setId( p.getId());
        uiResponse.setGender(p.getGender());
        uiResponse.setName(p.getName());
        uiResponse.setPhone(p.getPhone());
        uiResponse.setInsuranceProvider(p.getInsuranceProvider());
        uiResponse.setPolicyNumber(p.getPolicyNumber());
        return uiResponse;
    }
}
