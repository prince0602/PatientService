package com.example.patientservice.service;

import com.example.patientservice.entity.PatientEntity;
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

	public Long createPatient(PatientEntity patient) {
		PatientEntity p = patientRepo.save(patient);
		if (p == null) {
			return null;
		} else {
			return p.getPatientId();
		}
	}

	public PatientEntity getPatientDetails(int patientId) {
		PatientEntity p = patientRepo.getById(patientId);
		if (p != null) {
			return p;
		}
		return null;
	}

	public List<PatientEntity> getAllPatients() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();

	}

	public boolean updatePatient(PatientEntity patient) {
		PatientEntity updatedPatient = patientRepo.save(patient);
		return updatedPatient != null;
	}

}
