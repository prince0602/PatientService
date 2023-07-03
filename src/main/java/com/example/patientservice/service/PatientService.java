package com.example.patientservice.service;

import com.example.patientservice.entity.Patient;
import com.example.patientservice.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
@Autowired
    PatientRepo patientRepo;

    public String createPatient(Patient patient){
        Patient p=patientRepo.save(patient);
        if(p==null){
            return "failure";
        }
        else{
            return "success";
        }
    }

    public Patient getPatientDetails(int patientId) {
        Patient p=patientRepo.getById(patientId);
        if(p!=null){
            return p;
        }
        return null;
    }
}
