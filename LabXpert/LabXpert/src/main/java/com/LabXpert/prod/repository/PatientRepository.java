package com.LabXpert.prod.repository;

import com.LabXpert.prod.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // Add custom query methods if needed
}
