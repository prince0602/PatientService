package com.example.patientservice.bl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.patientservice.entity.Patient;
import com.example.patientservice.service.PatientService;
import com.example.patientservice.service.ReadJsonFileService;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiResponse.PatientUIResponse;
import com.example.patientservice.uiResponse.RefferingProviderDemoData;
import com.example.patientservice.utility.PatientHelper;


@Component
    public class PatientBl {
     
    @Autowired
    PatientService service;
    
    @Autowired
    ReadJsonFileService jsonService;
    
    @Autowired
    RestTemplate restTemplate;

    public Long createPatient(PatientUiRequest req)
        {

            Patient p = PatientHelper.convertPatientRequest(req);
//            if (req.getImageFile() != null && !req.getImageFile().isEmpty()) {
//                try {
//                    p.setImage(req.getImageFile().getBytes());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            Long patId=service.createPatient(p);
            return patId;
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
        

        public PatientUIResponse getPatientDetails(int patientId) {
           Patient p=service.getPatientDetails(patientId);
            PatientUIResponse response=PatientHelper.convertToPatientUiRequest(p);
            return response;
        }

		public List<PatientUIResponse> getAllPatients() {
			// TODO Auto-generated method stub
			List<Patient> patients =service.getAllPatients();
			List<PatientUIResponse> listOfPatients=PatientHelper.convertToPatientListUiResponse(patients);
			return listOfPatients;
		}
        public void savePatientPicture(){

        }

		public List<RefferingProviderDemoData> getNpdiDetails() {
			// TODO Auto-generated method stub
		//	restTemplate.get
			
			List<RefferingProviderDemoData> readRefferingProviderJsonFile = new ArrayList<RefferingProviderDemoData>();
			try {
				readRefferingProviderJsonFile= jsonService.readRefferingProviderJsonFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return readRefferingProviderJsonFile;
		}


    }

