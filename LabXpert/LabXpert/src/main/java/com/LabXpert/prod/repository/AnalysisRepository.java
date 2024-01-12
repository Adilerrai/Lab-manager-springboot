package com.LabXpert.prod.repository;

import com.LabXpert.prod.entity.Analysis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnalysisRepository extends JpaRepository<Analysis, Long> {
    // Add custom query methods if needed
}
