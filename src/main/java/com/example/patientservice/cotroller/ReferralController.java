package com.example.patientservice.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.patientservice.bl.PatientBl;
import com.example.patientservice.uiRequest.ReferringProviderUiRequest;
import com.example.patientservice.uiResponse.ReferringProviderUiResponse;

@RestController
@RequestMapping("/npi")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ReferralController {
	
	@Autowired
	PatientBl bl;
	
	
	@PostMapping("/addReferringProvider")
	public String addReferringProvider(@RequestBody ReferringProviderUiRequest req)
	{
		return bl.addReferringProvider(req);
	}
	
	@GetMapping("/getAllRefferal")
	public List<ReferringProviderUiResponse> getNpdiResponse()
	{
		return bl.getNpdiDetails();
	}
	
	@PostMapping("/searchProvider/{npiNumber}")
	public String searchProvider(@PathVariable String npiNumber)
	{
		return bl.searchProvider(npiNumber);
	}

}
