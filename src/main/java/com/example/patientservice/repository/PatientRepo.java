package com.example.patientservice.repository;

import com.example.patientservice.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<PatientEntity,Integer> {



}
