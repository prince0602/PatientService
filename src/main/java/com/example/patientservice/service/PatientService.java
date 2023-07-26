package com.example.patientservice.service;

import com.example.patientservice.entity.Patient;
import com.example.patientservice.repository.PatientRepo;

import java.io.IOException;
import java.util.List;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
