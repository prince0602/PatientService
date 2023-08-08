package com.example.patientservice.bl;

import com.example.patientservice.entity.AttorneyEntity;
import com.example.patientservice.service.AttorneyService;
import com.example.patientservice.uiRequest.AttorneyUiRequest;
import com.example.patientservice.uiResponse.AttorneyUiResponse;
import com.example.patientservice.utility.AttorneyHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AttorneyBl {
    @Autowired
    AttorneyService attorneyService;
    public Long createAttorney(AttorneyUiRequest attorneyUiRequest) {
        AttorneyEntity a=AttorneyHelper.convertFromAttorneyUiRequest(attorneyUiRequest);
        Long attorneyId=attorneyService.createAttorney(a);
        return attorneyId;
    }
    public AttorneyUiResponse getAttorney(Long attorneyId){
        AttorneyEntity a=attorneyService.getAttorney(attorneyId);
        AttorneyUiResponse attorneyUiResponse= AttorneyHelper.convertToAttorneyUiResponse(a);
        return attorneyUiResponse;

    }
    public List<AttorneyUiResponse> getAllAttorney() {

        List<AttorneyEntity> attorneys= attorneyService.getAllAttorney();
        List<AttorneyUiResponse> listOfAttorneys=AttorneyHelper.convertToAttorneyListUiResponse(attorneys);
        return listOfAttorneys;
    }
}
