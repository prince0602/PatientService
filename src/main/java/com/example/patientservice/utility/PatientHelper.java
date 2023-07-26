package com.example.patientservice.utility;

import java.util.ArrayList;
import java.util.List;

import com.example.patientservice.entity.Attorney;
import com.example.patientservice.entity.EmergencyContact;
import com.example.patientservice.entity.Patient;
import com.example.patientservice.entity.ReferringProvider;
import com.example.patientservice.uiRequest.AttorneyUiRequest;
import com.example.patientservice.uiRequest.EmergencyContactUiRequest;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiRequest.ReferringProviderUiRequest;
import com.example.patientservice.uiResponse.AttorneyUiResponse;
import com.example.patientservice.uiResponse.EmergencyContactUiResponse;

import com.example.patientservice.uiResponse.PatientUIResponse;
import com.example.patientservice.uiResponse.ReferringProviderUiResponse;



public class PatientHelper {
	public static Patient convertPatientRequest(PatientUiRequest req) {
		Patient p = new Patient();
		
		//p.setProfileImage(ImageHelper.compressImage(req.getImageData()));

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
		p.setState(req.getState());
		p.setDateOfBirth(req.getDateOfBirth());
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
		p.setProfileImage(req.getProfileImage());
		p.setNpiId(req.getNpi());
		
	/*	List<MedicalHistory> medicalHistories = new ArrayList<MedicalHistory>();
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

		}*/
		/*ReferringProviderUiRequest referringProviderUiRequest = req.getReferringProvider();
		ReferringProvider referringProvider=new ReferringProvider();
		referringProvider.setNpi(referringProviderUiRequest.getNpi());
		referringProvider.setProviderLastName(referringProviderUiRequest.getProviderLastName());
		referringProvider.setProviderFirstName(referringProviderUiRequest.getProviderFirstName());
		referringProvider.setNpiType(referringProviderUiRequest.getNpiType());
		referringProvider.setSpecialty(referringProviderUiRequest.getSpecialty());
		referringProvider.setOrganisationName(referringProviderUiRequest.getOrganisationName());

		p.setReferringProvider(referringProvider);*/
		List<EmergencyContact> emergencyContacts = new ArrayList<EmergencyContact>();
		List<EmergencyContactUiRequest> emergencyContactsUiRequests = req.getEmergencyContacts();
		if(emergencyContactsUiRequests!=null)
		{
			for(EmergencyContactUiRequest emergencyContact:emergencyContactsUiRequests)
			{
				EmergencyContact contact = new EmergencyContact();
				contact.setAddressLine1(emergencyContact.getAddressLine1());
				contact.setAddressLine2(emergencyContact.getAddressLine2());
				contact.setCity(emergencyContact.getCity());
				contact.setCountry(	emergencyContact.getCountry());
				contact.setExt(emergencyContact.getExt());
				contact.setFirstName(emergencyContact.getFirstName());
				contact.setPhoneNumber(	emergencyContact.getPhoneNumber());
				contact.setLastName(emergencyContact.getLastName());
				contact.setRelation(emergencyContact.getRelation());
				contact.setZipCode(emergencyContact.getZipCode());
				contact.setState(emergencyContact.getState());
				emergencyContacts.add(contact);
			}
		}
		p.setEmergencyContact(emergencyContacts);

		List<Attorney> attorneys=new ArrayList<Attorney>();
		List<AttorneyUiRequest> attorneyUiRequests=req.getAttorneyUiRequests();
		if(attorneyUiRequests!=null){
			for(AttorneyUiRequest attorneyUiRequest:attorneyUiRequests){
				Attorney attorney=new Attorney();
				attorney.setCity(attorneyUiRequest.getCity());
				attorney.setCountry(attorneyUiRequest.getCountry());
				attorney.setZipCode(attorneyUiRequest.getZipCode());
				attorney.setState(attorneyUiRequest.getState());
				attorney.setFirstName(attorneyUiRequest.getFirstName());
				attorney.setLastName(attorneyUiRequest.getLastName());
				attorney.setOfficeAdd(attorneyUiRequest.getOfficeAdd());
				attorney.setPhone(attorneyUiRequest.getPhone());
				attorney.setNotes(attorneyUiRequest.getNotes());
				attorneys.add(attorney);
			}
		}
		p.setAttorneys(attorneys);
		
		
		
		p.setSelfResponsibleFlag(req.isSelfResponsibleFlag());
		p.setPreferredModeOfCommunication(req.getPreferredModeOfCommunication());
		p.setTextPermission(req.getTextPermission());
		p.setVoicePermission(req.getVoicePermission());
		p.setEmailPermission(req.getEmailPermission());
		return p;
	}

	public static PatientUIResponse convertToPatientUiResponse(Patient p) {
		PatientUIResponse uiResponse = new PatientUIResponse();

		uiResponse.setEmail(p.getEmail());
		uiResponse.setPatientId(p.getPatientId());
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
		uiResponse.setState(p.getState());
		uiResponse.setPrefix(p.getPrefix());
		uiResponse.setSuffix(p.getSuffix());
		uiResponse.setReleaseOfInfo(p.getReleaseOfInfo());
		uiResponse.setState(p.getState());
		
		uiResponse.setDateOfBirth(p.getDateOfBirth());
		uiResponse.setPrimaryPhoneNumber(p.getPrimaryPhoneNumber());
		uiResponse.setSecondaryPhoneNumber(p.getSecondaryPhoneNumber());
		uiResponse.setPcg(p.getPcg());
		uiResponse.setPcp(p.getPcp());
		uiResponse.setLanguage(p.getLanguage());
		uiResponse.setEthnicity(p.getEthnicity());
		uiResponse.setPrescriptionHistoryConsent(p.getPrescriptionHistoryConsent());
		uiResponse.setEmpStatus(p.getEmpStatus());
		uiResponse.setMaritalStatus(p.getMaritalStatus());
		uiResponse.setOutStandingBalance(p.getOutStandingBalance());
		uiResponse.setProfileImage(p.getProfileImage());
		uiResponse.setEmailPermission(p.getEmailPermission());
		uiResponse.setVoicePermission(p.getVoicePermission());
		uiResponse.setTextPermission(p.getTextPermission());
		uiResponse.setPreferredModeOfCommunication(p.getPreferredModeOfCommunication());


//		  List<MedicalHistory> listOfMedicalHistory = p.getMedicalHistory();
//		  List<MedicalHistoryUiResponse> medicalHistoryUiResponse = new
//		  ArrayList<MedicalHistoryUiResponse>(); for (MedicalHistory medicalHistory :
//		 listOfMedicalHistory) { MedicalHistoryUiResponse m = new
//		  MedicalHistoryUiResponse();
//		  m.setAppointmentDate(medicalHistory.getAppointmentDate());
//		 m.setDiagnosis(medicalHistory.getDiagnosis());
//		 m.setDiagnosis(medicalHistory.getDoctorName());
//		  m.setMedication(medicalHistory.getMedication());
//		 m.setSymptoms(medicalHistory.getSymptoms()); medicalHistoryUiResponse.add(m);
//		  } uiResponse.setListOfMedicalHistory(medicalHistoryUiResponse);

		List<EmergencyContact> emergencyContacts=p.getEmergencyContact();
		List<EmergencyContactUiResponse> emergencyContactUiResponse=new ArrayList<EmergencyContactUiResponse>();
		for(EmergencyContact emergencyContact:emergencyContacts){
			EmergencyContactUiResponse emergencyContactUiResponse1=new EmergencyContactUiResponse();
			emergencyContactUiResponse1.setCity(emergencyContact.getCity());
			emergencyContactUiResponse1.setExt(emergencyContact.getExt());
			emergencyContactUiResponse1.setCountry(emergencyContact.getCountry());
			emergencyContactUiResponse1.setState(emergencyContact.getState());
			emergencyContactUiResponse1.setRelation(emergencyContact.getRelation());
			emergencyContactUiResponse1.setAddressLine1(emergencyContact.getAddressLine1());
			emergencyContactUiResponse1.setAddressLine2(emergencyContact.getAddressLine2());
			emergencyContactUiResponse1.setFirstName(emergencyContact.getFirstName());
			emergencyContactUiResponse1.setLastName(emergencyContact.getLastName());
			emergencyContactUiResponse1.setPhoneNumber(emergencyContact.getPhoneNumber());
			emergencyContactUiResponse1.setZipCode(emergencyContact.getZipCode());
			emergencyContactUiResponse.add(emergencyContactUiResponse1);
		}
		uiResponse.setEmergencyContacts(emergencyContactUiResponse);

				List<Attorney> attorneyList=p.getAttorneys();
		List<AttorneyUiResponse> attorneyUiResponses=new ArrayList<AttorneyUiResponse>();
		for(Attorney attorney:attorneyList){
			AttorneyUiResponse attorneyUiResponse=new AttorneyUiResponse();
			attorneyUiResponse.setCity(attorney.getCity());
			attorneyUiResponse.setState(attorney.getState());
			attorneyUiResponse.setZipCode(attorney.getZipCode());
			attorneyUiResponse.setPhone(attorney.getPhone());
			attorneyUiResponse.setFirstName(attorney.getFirstName());
			attorneyUiResponse.setLastName(attorney.getLastName());
			attorneyUiResponse.setNotes(attorney.getNotes());
			attorneyUiResponse.setOfficeAdd(attorney.getOfficeAdd());
			attorneyUiResponse.setCountry(attorney.getCountry());
			attorneyUiResponses.add(attorneyUiResponse);
		}
		uiResponse.setAttorney(attorneyUiResponses);
		

		return uiResponse;
	}

	public static List<PatientUIResponse> convertToPatientListUiResponse(List<Patient> listOfPatients) {
		// TODO Auto-generated method stub
		List<PatientUIResponse> listOfPatientUiResponse= new ArrayList<PatientUIResponse>();
		for(Patient p:listOfPatients)
		{
			PatientUIResponse patientUIResponse= convertToPatientUiResponse(p);
			listOfPatientUiResponse.add(patientUIResponse);
			
		}
	
		return listOfPatientUiResponse;
	}

	public static ReferringProviderUiResponse convertToReferringProviderUiResponse(
			ReferringProvider referringProvider) {
		
		ReferringProviderUiResponse resp= new ReferringProviderUiResponse();
		resp.setNpi(referringProvider.getNpi());
		resp.setNpiType(referringProvider.getNpiType());
		resp.setOrganisationName(referringProvider.getOrganisationName());
		resp.setProviderFirstName(referringProvider.getProviderFirstName());
		resp.setProviderLastName(referringProvider.getProviderLastName());
		resp.setSpecialty(referringProvider.getSpecialty());
		return resp;
	}

	public static ReferringProvider conertFromReferringProviderUiRequest(ReferringProviderUiRequest req) {
		// TODO Auto-generated method stub
		ReferringProvider referringProvider = new ReferringProvider();
		referringProvider.setNpi(req.getNpi());
		referringProvider.setNpiType(req.getNpiType());
		referringProvider.setOrganisationName(req.getOrganisationName());
		referringProvider.setProviderFirstName(req.getProviderFirstName());
		referringProvider.setProviderLastName(req.getProviderLastName());
		referringProvider.setSpecialty(req.getSpecialty());
		
		return referringProvider;
	}
}
