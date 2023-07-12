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
        p.setAddressLine2(req.getAddressLine2());
        p.setCellPhone(req.getCellPhone());
        p.setCity(req.getCity());
        p.setCountry(req.getCountry());
        p.setDateOfBirth(req.getDateOfBirth());
        p.setCounty(req.getCounty());
        p.setEmail(req.getEmail());
        p.setExtension(req.getExtension());
        p.setFirstName(req.getFirstName());
        p.setLastName(req.getLastName());
        p.setHomePhone(req.getHomePhone());
        p.setMiddleInitial(req.getMiddleInitial());
        p.setPreferredName(req.getPreferredName());
        p.setSex(req.getSex());
        p.setSsn(req.getSsn());
        p.setState(req.getState());
        p.setZip(req.getZip());
        p.setWorkPhone(req.getWorkPhone());
        p.setSuffix(req.getSuffix());
        p.setPreviousName(req.getPreviousName());

        List<MedicalHistory> medicalHistories=new ArrayList<MedicalHistory>();
        List<MedicalHistoryUiRequest> medicalHistoryUiRequests=req.getMedicalHistory();
//        for(MedicalHistoryUiRequest mReq:medicalHistoryUiRequests){
//            MedicalHistory mh=new MedicalHistory();
//            mh.setDiagnosis(mReq.getDiagnosis());
//            mh.setSymptoms(mReq.getSymptoms());
//            mh.setMedication(mReq.getMedication());
//            mh.setAppointmentDate(mReq.getAppointmentDate());
//            mh.setDoctorName(mReq.getDoctorName());
//            medicalHistories.add(mh);
//        }
        p.setMedicalHistory(medicalHistories);


        return p;
    }

    public static PatientUIResponse convertToPatientUiRequest(Patient p) {
        PatientUIResponse uiResponse=new PatientUIResponse();

        uiResponse.setEmail(p.getEmail());
        uiResponse.setId( p.getId());
        uiResponse.setCity(p.getCity());
        uiResponse.setZip(p.getZip());
        uiResponse.setSex(p.getSex());
        uiResponse.setSsn(p.getSsn());
        uiResponse.setAccountNo(p.getAccountNo());
        uiResponse.setAddressLine1(p.getAddressLine1());
        uiResponse.setAddressLine2(p.getAddressLine2());
        uiResponse.setCounty(p.getCounty());
        uiResponse.setCountry(p.getCountry());
        uiResponse.setCellPhone(p.getCellPhone());
        uiResponse.setHomePhone(p.getHomePhone());
        uiResponse.setWorkPhone(p.getWorkPhone());
        uiResponse.setExtension(p.getExtension());
        uiResponse.setFirstName(p.getFirstName());
        uiResponse.setMiddleInitial(p.getMiddleInitial());
        uiResponse.setLastName(p.getLastName());
        uiResponse.setPreferredName(p.getPreferredName());
        uiResponse.setPreviousName(p.getPreviousName());
        uiResponse.setPrefix(p.getPrefix());
        uiResponse.setSuffix(p.getSuffix());
        return uiResponse;
    }
}
