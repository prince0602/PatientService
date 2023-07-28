package com.example.patientservice.utility;

import java.util.ArrayList;
import java.util.List;

import com.example.patientservice.entity.AttorneyEntity;
import com.example.patientservice.entity.EmergencyContactEntity;
import com.example.patientservice.entity.PatientEntity;
import com.example.patientservice.entity.ReferringProviderEntity;
import com.example.patientservice.uiRequest.AttorneyUiRequest;
import com.example.patientservice.uiRequest.EmergencyContactUiRequest;
import com.example.patientservice.uiRequest.PatientUiRequest;
import com.example.patientservice.uiRequest.ReferringProviderUiRequest;
import com.example.patientservice.uiResponse.AttorneyUiResponse;
import com.example.patientservice.uiResponse.EmergencyContactUiResponse;

import com.example.patientservice.uiResponse.PatientUIResponse;
import com.example.patientservice.uiResponse.ReferringProviderUiResponse;



public class PatientHelper {
	public static PatientEntity convertPatientRequest(PatientUiRequest req) {
		PatientEntity p = new PatientEntity();
		
		p.setPatientId(req.getPatientId());
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
		


		List<EmergencyContactEntity> emergencyContacts = new ArrayList<>();
		List<EmergencyContactUiRequest> emergencyContactsUiRequests = req.getEmergencyContacts();

		if (emergencyContactsUiRequests != null) {
			for (EmergencyContactUiRequest emergencyContact : emergencyContactsUiRequests) {
				EmergencyContactEntity contact = EmergencyContactEntity.builder()
						.addressLine1(emergencyContact.getAddressLine1())
						.addressLine2(emergencyContact.getAddressLine2())
						.city(emergencyContact.getCity())
						.country(emergencyContact.getCountry())
						.ext(emergencyContact.getExt())
						.firstName(emergencyContact.getFirstName())
						.phoneNumber(emergencyContact.getPhoneNumber())
						.lastName(emergencyContact.getLastName())
						.relation(emergencyContact.getRelation())
						.zipCode(emergencyContact.getZipCode())
						.state(emergencyContact.getState())
						.build();

				emergencyContacts.add(contact);
			}
		}

		p.setEmergencyContact(emergencyContacts);


		List<AttorneyEntity> attorneys=new ArrayList<AttorneyEntity>();
		List<AttorneyUiRequest> attorneyUiRequests=req.getAttorneyUiRequests();
		if(attorneyUiRequests!=null){
			for(AttorneyUiRequest attorneyUiRequest:attorneyUiRequests){
				AttorneyEntity attorney=new AttorneyEntity();
				attorney.setAttorneyId(attorneyUiRequest.getAttorneyId());
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

	public static PatientUIResponse convertToPatientUiResponse(PatientEntity p) {
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




		List<EmergencyContactEntity> emergencyContacts=p.getEmergencyContact();
		List<EmergencyContactUiResponse> emergencyContactUiResponse=new ArrayList<EmergencyContactUiResponse>();
		for(EmergencyContactEntity emergencyContact:emergencyContacts){
			EmergencyContactUiResponse response = new EmergencyContactUiResponse();
			response.setAddressLine1(emergencyContact.getAddressLine1());			        
			response.setCity(emergencyContact.getCity());
			response.setExt(emergencyContact.getExt());
			response.setCountry(emergencyContact.getCountry());
			response.setState(emergencyContact.getState());
			response.setRelation(emergencyContact.getRelation());
			response.setAddressLine2(emergencyContact.getAddressLine2());
			response.setFirstName(emergencyContact.getFirstName());
			response.setLastName(emergencyContact.getLastName());
			response.setPhoneNumber(emergencyContact.getPhoneNumber());
			response.setZipCode(emergencyContact.getZipCode());
			emergencyContactUiResponse.add(response);
			
			

		}
		uiResponse.setEmergencyContacts(emergencyContactUiResponse);

				List<AttorneyEntity> attorneyList=p.getAttorneys();
		List<AttorneyUiResponse> attorneyUiResponses=new ArrayList<AttorneyUiResponse>();
		for(AttorneyEntity attorney:attorneyList){
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

	public static List<PatientUIResponse> convertToPatientListUiResponse(List<PatientEntity> listOfPatients) {
		// TODO Auto-generated method stub
		List<PatientUIResponse> listOfPatientUiResponse= new ArrayList<PatientUIResponse>();
		for(PatientEntity p:listOfPatients)
		{
			PatientUIResponse patientUIResponse= convertToPatientUiResponse(p);
			listOfPatientUiResponse.add(patientUIResponse);
			
		}
	
		return listOfPatientUiResponse;
	}

	public static ReferringProviderUiResponse convertToReferringProviderUiResponse(
			ReferringProviderEntity referringProvider) {
		
		if(referringProvider!=null){
			ReferringProviderUiResponse resp= new ReferringProviderUiResponse();
			resp.setNpi(referringProvider.getNpi());
			resp.setNpiType(referringProvider.getNpiType());
			resp.setOrganisationName(referringProvider.getOrganisationName());
			resp.setProviderFirstName(referringProvider.getProviderFirstName());
			resp.setProviderLastName(referringProvider.getProviderLastName());
			resp.setSpecialty(referringProvider.getSpecialty());
			return resp;
		}
		return null;
	}

	public static ReferringProviderEntity conertFromReferringProviderUiRequest(ReferringProviderUiRequest req) {
		// TODO Auto-generated method stub
		ReferringProviderEntity referringProvider = new ReferringProviderEntity();
		referringProvider.setNpi(req.getNpi());
		referringProvider.setNpiType(req.getNpiType());
		referringProvider.setOrganisationName(req.getOrganisationName());
		referringProvider.setProviderFirstName(req.getProviderFirstName());
		referringProvider.setProviderLastName(req.getProviderLastName());
		referringProvider.setSpecialty(req.getSpecialty());
		
		return referringProvider;
	}
	
	public static PatientEntity convertPatientRequestForUpdate(PatientEntity existingPatient, PatientUiRequest req) {
        
        existingPatient.setAccountNo(req.getAccountNo());
        existingPatient.setPrefix(req.getPrefix());
        existingPatient.setLastName(req.getLastName());
        existingPatient.setSuffix(req.getSuffix());
        existingPatient.setFirstName(req.getFirstName());
        existingPatient.setMiddleName(req.getMiddleName());
        existingPatient.setPreferredName(req.getPreferredName());
        existingPatient.setAddressLine1(req.getAddressLine1());
        existingPatient.setAddressLine2(req.getAddressLine2());
        existingPatient.setCity(req.getCity());
        existingPatient.setState(req.getState());
        existingPatient.setCounty(req.getCounty());
        existingPatient.setZip(req.getZip());
        existingPatient.setCountry(req.getCountry());
        existingPatient.setEmail(req.getEmail());
        existingPatient.setDateOfBirth(req.getDateOfBirth());
        existingPatient.setSsn(req.getSsn());
        existingPatient.setGender(req.getGender());
        existingPatient.setPrimaryPhoneNumber(req.getPrimaryPhoneNumber());
        existingPatient.setSecondaryPhoneNumber(req.getSecondaryPhoneNumber());
        existingPatient.setReleaseOfInfo(req.getReleaseOfInfo());
        existingPatient.setEmpStatus(req.getEmpStatus());
        existingPatient.setEthnicity(req.getEthnicity());
        existingPatient.setLanguage(req.getLanguage());
        existingPatient.setPcp(req.getPcp());
        existingPatient.setPcg(req.getPcg());
        existingPatient.setPrescriptionHistoryConsent(req.getPrescriptionHistoryConsent());
        existingPatient.setMaritalStatus(req.getMaritalStatus());
        existingPatient.setOutStandingBalance(req.getOutStandingBalance());
        existingPatient.setProfileImage(req.getProfileImage());
        existingPatient.setSelfResponsibleFlag(req.isSelfResponsibleFlag());
        existingPatient.setEmailPermission(req.getEmailPermission());
        existingPatient.setTextPermission(req.getTextPermission());
        existingPatient.setVoicePermission(req.getVoicePermission());
        existingPatient.setPreferredModeOfCommunication(req.getPreferredModeOfCommunication());

        // Update emergency contacts
        List<EmergencyContactEntity> existingEmergencyContacts = existingPatient.getEmergencyContact();
        List<EmergencyContactUiRequest> emergencyContactsUiRequests = req.getEmergencyContacts();
        if (emergencyContactsUiRequests != null) {
            existingEmergencyContacts.clear(); // Remove existing emergency contacts
            for (EmergencyContactUiRequest emergencyContact : emergencyContactsUiRequests) {
                EmergencyContactEntity contact = new EmergencyContactEntity();
                contact.setAddressLine1(emergencyContact.getAddressLine1());
                contact.setAddressLine2(emergencyContact.getAddressLine2());
                contact.setCity(emergencyContact.getCity());
                contact.setCountry(emergencyContact.getCountry());
                contact.setExt(emergencyContact.getExt());
                contact.setFirstName(emergencyContact.getFirstName());
                contact.setPhoneNumber(emergencyContact.getPhoneNumber());
                contact.setLastName(emergencyContact.getLastName());
                contact.setRelation(emergencyContact.getRelation());
                contact.setZipCode(emergencyContact.getZipCode());
                existingEmergencyContacts.add(contact);
            }
        }

        return existingPatient;
    }

}
