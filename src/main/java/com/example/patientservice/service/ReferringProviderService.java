package com.example.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.patientservice.entity.ReferringProvider;
import com.example.patientservice.repository.ReferringProviderRepository;

@Service
public class ReferringProviderService {
	@Autowired
	ReferringProviderRepository repo;
	
	public ReferringProvider getReferringProviderById(String referringProviderId)
	{
		return repo.findById(referringProviderId).orElse(null);
	}

}
