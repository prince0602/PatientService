package com.example.patientservice.repository;

import com.example.patientservice.entity.AttorneyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttorneyRepository extends JpaRepository<AttorneyEntity,Long> {
}
