package com.example.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalService {
	
	@Autowired
	RestTemplate restTemplate;


public String callApi(String number) {
		String url = "https://npiregistry.cms.hhs.gov/api/?number=" + number
				+ "&enumeration_type=&taxonomy_description=&name_purpose=&first_name=&use_first_name_alias=&last_name=&organization_name=&address_purpose=&city=&state=&postal_code=&country_code=&limit=&skip=&pretty=&version=2.1";
		String response = restTemplate.getForObject(url, String.class);
		return response;
	}

}
