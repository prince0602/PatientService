package com.example.patientservice.repository;

import com.example.patientservice.entity.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryRepo extends JpaRepository<MedicalHistory,Integer> {
}
