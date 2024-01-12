package com.LabXpert.prod.repository;

import com.LabXpert.prod.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Integer> {
    List<Test> findByName(String name);
}
