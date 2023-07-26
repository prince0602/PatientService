package com.example.patientservice.bl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.patientservice.entity.Patient;
import com.example.patientservice.entity.ReferringProvider;
import com.example.patientservice.service.ExternalService;
import com.example.patientservice.service.PatientService;
import com.example.patientservice.service.ReadJsonFileService;
import com.example.patientservice.service.ReferringProviderService;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiRequest.ReferringProviderUiRequest;
import com.example.patientservice.uiResponse.PatientUIResponse;
import com.example.patientservice.uiResponse.ReferringProviderUiResponse;
import com.example.patientservice.utility.PatientHelper;


@Component
    public class PatientBl {
     
    @Autowired
    PatientService service;
    
    @Autowired
    ReadJsonFileService jsonService;
    
    @Autowired
    RestTemplate restTemplate;
    
    @Autowired
    ExternalService externalService;
    
    @Autowired
    ReferringProviderService referringService;

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
           
            PatientUIResponse response=PatientHelper.convertToPatientUiResponse(p);
            ReferringProvider referringProvider = referringService.getReferringProviderById(p.getNpiId());
            ReferringProviderUiResponse referringProviderUiResponse=PatientHelper.convertToReferringProviderUiResponse(referringProvider);
            response.setReferringProvider(referringProviderUiResponse);
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

		public List<ReferringProviderUiResponse> getNpdiDetails() {
			// TODO Auto-generated method stub
		//	restTemplate.get
			
			List<ReferringProviderUiResponse> readRefferingProviderJsonFile = new ArrayList<ReferringProviderUiResponse>();
			try {
				readRefferingProviderJsonFile= jsonService.readRefferingProviderJsonFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return readRefferingProviderJsonFile;
		}

		public String searchProvider(String npiNumber) {
			// TODO Auto-generated method stub
			String result=externalService.callApi(npiNumber);
			
			return null;
		}

		public String addReferringProvider(ReferringProviderUiRequest req) {
			// TODO Auto-generated method stub
			
			ReferringProvider referringProvider =PatientHelper.conertFromReferringProviderUiRequest(req);
			return referringService.addReferringProvider(referringProvider);
			
		}


    }

