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

        // p.setEmail(req.getEmail());
        p.setName(req.getName());
        p.setPhone(req.getPhone());
        p.setEmail(req.getEmail());
        p.setPolicyNumber(req.getPolicyNumber());
        p.setInsuranceProvider(req.getInsuranceProvider());
        p.setGender(req.getGender());
        List<MedicalHistory> medicalHistories=new ArrayList<MedicalHistory>();
        List<MedicalHistoryUiRequest> medicalHistoryUiRequests=req.getMedicalHistory();
        for(MedicalHistoryUiRequest mReq:medicalHistoryUiRequests){
            MedicalHistory mh=new MedicalHistory();
            mh.setDate(mReq.getDate());
            mh.setCondition(mReq.getCondition());
            mh.setTreatment(mReq.getTreatment());
            medicalHistories.add(mh);
        }
        p.setMedicalHistory(medicalHistories);


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
