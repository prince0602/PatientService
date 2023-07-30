package com.example.patientservice.bl;

import com.example.patientservice.entity.GuarantorEntity;
import com.example.patientservice.service.GuarantorService;
import com.example.patientservice.uiRequest.GuarantorUiRequest;
import com.example.patientservice.uiResponse.GuarantorUiResponse;
import com.example.patientservice.utility.GuarantorHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GuarantorBl {

    @Autowired
    GuarantorService guarantorService;

    public String createGuarantor(GuarantorUiRequest request){
        GuarantorEntity g= GuarantorHelper.convertFromGuarantorUiRequest(request);
        String guarantorRecordNumber=guarantorService.createGuarantor(g);
        return guarantorRecordNumber;
    }
    public GuarantorUiResponse getGuarantor(String guarantorRecordNumber){
        GuarantorEntity g=guarantorService.getGuarantorById(guarantorRecordNumber);
        GuarantorUiResponse guarantorUiResponse=GuarantorHelper.convertToGuarantorUiResponse(g);
        return guarantorUiResponse;

    }

    public List<GuarantorUiResponse> getAllGuarantor() {

        List<GuarantorEntity> guarantors= guarantorService.getAllGuarantor();
        List<GuarantorUiResponse> listOfGuarantors=GuarantorHelper.convertToGuarantorListUiResponse(guarantors);
    }
}
