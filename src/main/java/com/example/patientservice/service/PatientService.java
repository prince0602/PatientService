package com.example.patientservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.patientservice.entity.Patient;
import com.example.patientservice.repository.PatientRepo;

@Service
public class PatientService {
    @Autowired
    PatientRepo patientRepo;

    public Long createPatient(Patient patient){
        Patient p=patientRepo.save(patient);
        if(p==null){
            return null;
        }
        else{
            return p.getPatientId();
        }
    }

    @Transactional()
    public Patient getPatientDetails(int patientId) {
        Patient p=patientRepo.getById(patientId);
        if(p!=null){
            return p;
        }
        return null;
    }

	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
		
	}
	
	public boolean updatePatient(Patient patient) {
        Patient updatedPatient = patientRepo.save(patient);
        return updatedPatient != null;
    }
//    public void savePatientPicture(@PathVariable Long id, @RequestParam("file") MultipartFile file) throws IOException {
//
//        Patient patient = patientRepo.findById(Math.toIntExact(id)).orElseThrow(() -> new EntityNotFoundException("Patient not found"));
//
//        patient.setPicture(file.getBytes());
//
//        patientRepo.save(patient);
//
//    }
}
