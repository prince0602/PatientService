package com.example.patientservice.repository;

import com.example.patientservice.entity.GuarantorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuarantorRepository extends JpaRepository<GuarantorEntity,String> {

    Optional<GuarantorEntity> findByGuarantorRecordNumber(String guarantorRecordNumber);
}
