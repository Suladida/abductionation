package com.example.codeclan.abductionationservice.repositories;

import com.example.codeclan.abductionationservice.models.Abductee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbducteeRepository extends JpaRepository<Abductee, Long> {
}
