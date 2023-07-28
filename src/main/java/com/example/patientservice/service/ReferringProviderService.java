package com.example.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.patientservice.entity.ReferringProviderEntity;
import com.example.patientservice.repository.ReferringProviderRepository;

@Service
public class ReferringProviderService {
	@Autowired
	ReferringProviderRepository repo;
	
	public ReferringProviderEntity getReferringProviderById(String npi)
	{
		return repo.findByNpi(npi).orElse(null);
	}

	public String addReferringProvider(ReferringProviderEntity referringProvider) {
		// TODO Auto-generated method stub
		
		
		 ReferringProviderEntity addedReferringProvider = repo.save(referringProvider);
		 if(addedReferringProvider!=null)
			 return "Success";
		 else
			 return "failure";
	}

}
