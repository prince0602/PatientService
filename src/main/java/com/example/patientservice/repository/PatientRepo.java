package com.example.patientservice.repository;

import com.example.patientservice.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRepo extends JpaRepository<Patient,Integer> {
    @Query("UPDATE Patient p SET p.email = :email, p.phone = :phone WHERE p.id = :patientId")
    String updatePatientDetails(@Param("email") String email, @Param("phone") String phone, @Param("patientId") Long patientId);


}
