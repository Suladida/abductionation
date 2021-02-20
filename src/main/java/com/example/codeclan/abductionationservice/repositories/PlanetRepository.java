package com.example.codeclan.abductionationservice.repositories;

import com.example.codeclan.abductionationservice.models.Abductee;
import com.example.codeclan.abductionationservice.models.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
