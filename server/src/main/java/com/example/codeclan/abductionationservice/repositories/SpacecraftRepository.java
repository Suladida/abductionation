package com.example.codeclan.abductionationservice.repositories;

import com.example.codeclan.abductionationservice.models.Spacecraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpacecraftRepository extends JpaRepository<Spacecraft, Long> {
}
