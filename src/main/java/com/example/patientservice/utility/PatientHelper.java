package com.example.patientservice.utility;

import java.util.ArrayList;
import java.util.List;

import com.example.patientservice.entity.MedicalHistory;
import com.example.patientservice.entity.Patient;
import com.example.patientservice.uiRequest.MedicalHistoryUiRequest;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiResponse.MedicalHistoryUiResponse;
import com.example.patientservice.uiResponse.PatientUIResponse;

public class PatientHelper {
	public static Patient convertPatientRequest(PatientUiRequest req) {
		Patient p = new Patient();

		p.setAccountNo(req.getAccountNo());
		p.setPrefix(req.getPrefix());
		p.setAddressLine1(req.getAddressLine1());
		p.setAddressLine2(req.getAddressLine2());
		p.setCity(req.getCity());
		p.setCountry(req.getCountry());
		p.setDateOfBirth(req.getDateOfBirth());
		p.setCounty(req.getCounty());
		p.setEmail(req.getEmail());
		p.setFirstName(req.getFirstName());
		p.setLastName(req.getLastName());
		p.setMiddleName(req.getMiddleName());
		p.setPreferredName(req.getPreferredName());
		p.setGender(req.getGender());
		p.setSsn(req.getSsn());
		p.setState(req.getState());
		p.setZip(req.getZip());
		p.setSuffix(req.getSuffix());

		p.setReleaseOfInfo(req.getReleaseOfInfo());
		p.setPrimaryPhoneNumber(req.getPrimaryPhoneNumber());
		p.setSecondaryPhoneNumber(req.getSecondaryPhoneNumber());
		p.setPcg(req.getPcg());
		p.setPcp(req.getPcp());
		p.setLanguage(req.getLanguage());
		p.setEthnicity(req.getEthnicity());
		p.setPrescriptionHistoryConsent(req.getPrescriptionHistoryConsent());
		p.setEmpStatus(req.getEmpStatus());
		p.setMaritalStatus(req.getMaritalStatus());
		p.setOutStandingBalance(req.getOutStandingBalance());

		List<MedicalHistory> medicalHistories = new ArrayList<MedicalHistory>();
		List<MedicalHistoryUiRequest> medicalHistoryUiRequests = req.getMedicalHistory();
		if (medicalHistoryUiRequests != null) {
			for (MedicalHistoryUiRequest mReq : medicalHistoryUiRequests) {
				MedicalHistory mh = new MedicalHistory();
				mh.setDiagnosis(mReq.getDiagnosis());
				mh.setSymptoms(mReq.getSymptoms());
				mh.setMedication(mReq.getMedication());
				mh.setAppointmentDate(mReq.getAppointmentDate());
				mh.setDoctorName(mReq.getDoctorName());
				medicalHistories.add(mh);
			}
			p.setMedicalHistory(medicalHistories);

		}

		return p;
	}

	public static PatientUIResponse convertToPatientUiRequest(Patient p) {
		PatientUIResponse uiResponse = new PatientUIResponse();

		uiResponse.setEmail(p.getEmail());
		uiResponse.setId(p.getId());
		uiResponse.setCity(p.getCity());
		uiResponse.setZip(p.getZip());
		uiResponse.setGender(p.getGender());
		uiResponse.setSsn(p.getSsn());
		uiResponse.setAccountNo(p.getAccountNo());
		uiResponse.setAddressLine1(p.getAddressLine1());
		uiResponse.setAddressLine2(p.getAddressLine2());
		uiResponse.setCounty(p.getCounty());
		uiResponse.setCountry(p.getCountry());
		uiResponse.setPrefix(p.getPrefix());
		uiResponse.setFirstName(p.getFirstName());
		uiResponse.setMiddleName(p.getMiddleName());
		uiResponse.setLastName(p.getLastName());
		uiResponse.setPreferredName(p.getPreferredName());

		uiResponse.setPrefix(p.getPrefix());
		uiResponse.setSuffix(p.getSuffix());
		uiResponse.setReleaseOfInfo(p.getReleaseOfInfo());

		uiResponse.setPrimaryPhoneNumber(p.getPrimaryPhoneNumber());
		uiResponse.setSecondaryPhoneNumber(p.getSecondaryPhoneNumber());
		uiResponse.setPcg(p.getPcg());
		uiResponse.setPcp(p.getPcp());
		uiResponse.setLanguage(p.getGender());
		uiResponse.setEthnicity(p.getGender());
		uiResponse.setPrescriptionHistoryConsent(p.getPrescriptionHistoryConsent());
		uiResponse.setEmpStatus(p.getEmpStatus());
		uiResponse.setMaritalStatus(p.getMaritalStatus());
		uiResponse.setOutStandingBalance(p.getOutStandingBalance());
		List<MedicalHistory> listOfMedicalHistory = p.getMedicalHistory();
		List<MedicalHistoryUiResponse> medicalHistoryUiResponse = new ArrayList<MedicalHistoryUiResponse>();
		for (MedicalHistory medicalHistory : listOfMedicalHistory) {
			MedicalHistoryUiResponse m = new MedicalHistoryUiResponse();
			m.setAppointmentDate(medicalHistory.getAppointmentDate());
			m.setDiagnosis(medicalHistory.getDiagnosis());
			m.setDiagnosis(medicalHistory.getDoctorName());
			m.setMedication(medicalHistory.getMedication());
			m.setSymptoms(medicalHistory.getSymptoms());
			medicalHistoryUiResponse.add(m);
		}
		uiResponse.setListOfMedicalHistory(medicalHistoryUiResponse);
		return uiResponse;
	}

	public static List<PatientUIResponse> convertToPatientListUiResponse(List<Patient> listOfPatients) {
		// TODO Auto-generated method stub
		List<PatientUIResponse> listOfPatientUiResponse= new ArrayList<PatientUIResponse>();
		for(Patient p:listOfPatients)
		{
			PatientUIResponse patientUIResponse=convertToPatientUiRequest(p);
			listOfPatientUiResponse.add(patientUIResponse);
			
		}
	
		return listOfPatientUiResponse;
	}
}
