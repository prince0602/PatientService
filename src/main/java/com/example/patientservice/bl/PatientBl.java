package com.example.patientservice.bl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.patientservice.entity.PatientEntity;
import com.example.patientservice.entity.ReferringProviderEntity;
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

	public Long createPatient(PatientUiRequest req) {

		PatientEntity p = PatientHelper.convertPatientRequest(req);

		Long patId = service.createPatient(p);
		return patId;
		}

	public PatientUIResponse getPatientDetails(int patientId) {

		PatientEntity p = service.getPatientDetails(patientId);

		PatientUIResponse response = PatientHelper.convertToPatientUiResponse(p);
		ReferringProviderEntity referringProvider = referringService.getReferringProviderById(p.getNpiId());
		ReferringProviderUiResponse referringProviderUiResponse = PatientHelper
				.convertToReferringProviderUiResponse(referringProvider);
		response.setReferringProvider(referringProviderUiResponse);
		return response;
	}

	public List<PatientUIResponse> getAllPatients() {

		List<PatientEntity> patients = service.getAllPatients();
		List<PatientUIResponse> listOfPatients = PatientHelper.convertToPatientListUiResponse(patients);
		return listOfPatients;
	}
	public boolean updatePatient(int patientId, PatientUiRequest req) {
		PatientEntity existingPatient = service.getPatientDetails(patientId);
		if (existingPatient != null) {
			PatientEntity updatedPatient = PatientHelper.convertPatientRequestForUpdate(existingPatient, req);
			return service.updatePatient(updatedPatient);
		}
		return false;
	}

	public List<ReferringProviderUiResponse> getNpdiDetails() {

		List<ReferringProviderUiResponse> readRefferingProviderJsonFile = new ArrayList<ReferringProviderUiResponse>();
		try {
			readRefferingProviderJsonFile = jsonService.readRefferingProviderJsonFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return readRefferingProviderJsonFile;
	}

	public String searchProvider(String npiNumber) {
		String result = externalService.callApi(npiNumber);

		return null;
	}

	public String addReferringProvider(ReferringProviderUiRequest req) {

		ReferringProviderEntity referringProvider = PatientHelper.convertFromReferringProviderUiRequest(req);
		return referringService.addReferringProvider(referringProvider);

	}



}
