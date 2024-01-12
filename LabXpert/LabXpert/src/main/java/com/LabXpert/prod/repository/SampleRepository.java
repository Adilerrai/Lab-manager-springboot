package com.LabXpert.prod.repository;

import com.LabXpert.prod.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long> {
    // Add custom query methods if needed
}
