package com.example.patientservice.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.patientservice.bl.PatientBl;
import com.example.patientservice.uiRequest.ReferringProviderUiRequest;
import com.example.patientservice.uiResponse.ReferringProviderUiResponse;

@RestController
@RequestMapping("/npi")
public class RefferalController {
	
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
