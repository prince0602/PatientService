package com.example.patientservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.patientservice.entity.ReferringProvider;

@Repository
public interface ReferringProviderRepository extends JpaRepository<ReferringProvider, String> {
}