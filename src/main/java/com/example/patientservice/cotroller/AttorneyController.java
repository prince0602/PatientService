package com.example.patientservice.cotroller;

import com.example.patientservice.bl.AttorneyBl;
import com.example.patientservice.uiRequest.AttorneyUiRequest;
import com.example.patientservice.uiResponse.AttorneyUiResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attorney")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class AttorneyController {
    @Autowired
    AttorneyBl bl;

    @Operation(summary = "This endpoint is used to create attorney")
    @PostMapping("/createAttorney")
    public Long createAttorney(@RequestBody AttorneyUiRequest attorneyUiRequest) {
        return bl.createAttorney(attorneyUiRequest);
    }
    @GetMapping("/getAttorney/{attorneyId}")
    public AttorneyUiResponse getAttorney(@PathVariable Long attorneyId){
        return bl.getAttorney(attorneyId);
    }
    public List<AttorneyUiResponse> getAllAttorney(){
        return bl.getAllAttorney();
    }
}
