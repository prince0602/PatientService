package com.example.patientservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.patientservice.entity.ReferringProviderEntity;

@Repository
public interface ReferringProviderRepository extends JpaRepository<ReferringProviderEntity, String> {
	
	Optional<ReferringProviderEntity> findByNpi(String npi);
}