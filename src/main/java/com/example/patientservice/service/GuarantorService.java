package com.example.patientservice.service;

import com.example.patientservice.entity.GuarantorEntity;
import com.example.patientservice.repository.GuarantorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuarantorService {

    @Autowired
    GuarantorRepository guarantorRepo;

    public String createGuarantor(GuarantorEntity guarantor){
        GuarantorEntity g=guarantorRepo.save(guarantor);
        if(g!=null){
            return g.getGuarantorRecordNumber();
        }
        return null;
    }
    public GuarantorEntity getGuarantorById(String guarantorRecordNumber){
        return guarantorRepo.findByGuarantorRecordNumber(guarantorRecordNumber).orElse(null);
    }

    public List<GuarantorEntity> getAllGuarantor(){
        return guarantorRepo.findAll();
    }



}
