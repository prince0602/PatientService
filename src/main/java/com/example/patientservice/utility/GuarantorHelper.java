package com.example.patientservice.utility;

import com.example.patientservice.entity.GuarantorEntity;
import com.example.patientservice.uiRequest.GuarantorUiRequest;
import com.example.patientservice.uiResponse.GuarantorUiResponse;

import java.util.ArrayList;
import java.util.List;

public class GuarantorHelper {
    public static GuarantorEntity convertFromGuarantorUiRequest(GuarantorUiRequest request){
        GuarantorEntity g=new GuarantorEntity();
        g.setFirstName(request.getFirstName());
        g.setGender(request.getGender());
        g.setPhone(request.getPhone());
        g.setDateOfBirth(request.getDateOfBirth());
        g.setName(request.getName());
        g.setGuarantorRecordNumber(request.getGuarantorRecordNumber());
        g.setType(request.getType());
        return g;

    }
    public static GuarantorUiResponse convertToGuarantorUiResponse(GuarantorEntity g){
        GuarantorUiResponse guarantorUiResponse=new GuarantorUiResponse();
        guarantorUiResponse.setName(g.getName());
        guarantorUiResponse.setGuarantorRecordNumber(g.getGuarantorRecordNumber());
        guarantorUiResponse.setType(g.getType());
        guarantorUiResponse.setGender(g.getGender());
        guarantorUiResponse.setFirstName(g.getFirstName());
        guarantorUiResponse.setDateOfBirth(g.getDateOfBirth());
        guarantorUiResponse.setPhone(g.getPhone());
        return guarantorUiResponse;
    }

    public static List<GuarantorUiResponse> convertToGuarantorListUiResponse(List<GuarantorEntity> guarantors) {
    List<GuarantorUiResponse> guarantorUiResponseList=new ArrayList<GuarantorUiResponse>();

    for(GuarantorEntity g:guarantors){
        GuarantorUiResponse guarantorUiResponse=convertToGuarantorUiResponse(g);
        guarantorUiResponseList.add(guarantorUiResponse);
    }
    return guarantorUiResponseList;
    }
}
