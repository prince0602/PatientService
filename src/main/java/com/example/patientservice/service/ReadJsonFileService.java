package com.example.patientservice.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.example.patientservice.uiResponse.RefferingProviderDemoData;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ReadJsonFileService {
	private final ObjectMapper objectMapper;
    private final ResourceLoader resourceLoader;
    
    @Autowired
    public ReadJsonFileService(ObjectMapper objectMapper, ResourceLoader resourceLoader) {
        this.objectMapper = objectMapper;
        this.resourceLoader = resourceLoader;
    }

    public List<RefferingProviderDemoData> readRefferingProviderJsonFile() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:data/refferingProvider.json");
        RefferingProviderDemoData[] readValue = objectMapper.readValue(resource.getInputStream(), RefferingProviderDemoData[].class);
        return Arrays.asList(readValue);
    }
}


