package com.example.codeclan.abductionationservice.repositories;

import com.example.codeclan.abductionationservice.models.Abduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbductionRepository extends JpaRepository<Abduction, Long> {
}
