package com.example.patientservice.bl;

import com.example.patientservice.entity.Patient;
import com.example.patientservice.repository.PatientRepo;
import com.example.patientservice.service.PatientService;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiResponse.PatientUIResponse;
import com.example.patientservice.utility.PatientHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;


@Component
    public class PatientBl {
        private final PatientRepo patientRepo;

    public PatientBl(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }
    @Autowired
    PatientService service;

    public String createPatient(PatientUiRequest req)
        {
            Patient p = PatientHelper.convertPatientRequest(req);
            return service.createPatient(p);
            //return null;
        }

		/*
		 * public ResponseEntity<String> updatePatientDetails(@PathVariable("patientId")
		 * Long patientId, @RequestBody PatientUiRequest updatedPatient) {
		 * Optional<Patient>
		 * optionalPatient=patientRepo.findById(Math.toIntExact(patientId));
		 * if(optionalPatient.isPresent()){ Patient patient=optionalPatient.get();
		 * //patient.setPhone(updatedPatient.getPhone());
		 * patient.setEmail(updatedPatient.getEmail()); patientRepo.save(patient);
		 * return ResponseEntity.ok("Patient details updated successfully"); } else{
		 * return ResponseEntity.notFound().build(); }
		 */
        }

        public PatientUIResponse getPatientDetails(int patientId) {
           Patient p=service.getPatientDetails(patientId);
            PatientUIResponse response=PatientHelper.convertToPatientUiRequest(p);
            return response;
        }


    }

