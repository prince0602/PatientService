package com.example.patientservice.cotroller;


import com.example.patientservice.bl.GuarantorBl;
import com.example.patientservice.bl.PatientBl;
import com.example.patientservice.uiRequest.GuarantorUiRequest;
import com.example.patientservice.uiResponse.GuarantorUiResponse;
import com.example.patientservice.uiResponse.PatientUIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guarantor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})

public class GuarantorController {
    @Autowired
    GuarantorBl bl;

    @PostMapping("/createGuarantor")
    public String createGuarantor(@RequestBody GuarantorUiRequest guarantorUiRequest){
    return bl.createGuarantor(guarantorUiRequest);
    }
    @GetMapping("/getGuarantor/{guarantorRecordNumber}")
    public GuarantorUiResponse getGuarantor(@PathVariable String guarantorRecordNumber){
        return  bl.getGuarantor(guarantorRecordNumber);
    }

    @GetMapping("/getAllGuarantor")
    public List<GuarantorUiResponse> getAllGuarantor(){
        return  bl.getAllGuarantor();

    }

}
