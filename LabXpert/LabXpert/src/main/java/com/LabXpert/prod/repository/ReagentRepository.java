package com.LabXpert.prod.repository;

import com.LabXpert.prod.entity.Reagent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReagentRepository extends JpaRepository<Reagent, Integer> {
    // Add custom query methods if needed
}
