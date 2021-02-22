package com.example.codeclan.abductionationservice.controllers;

import com.example.codeclan.abductionationservice.models.Planet;
import com.example.codeclan.abductionationservice.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PlanetController {

    @Autowired
    PlanetRepository planetRepository;

    @GetMapping(value="/planets")
    public ResponseEntity<List<Planet>> getAllPlanets(){
        return new ResponseEntity<>(planetRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/planets/{id}")
    public ResponseEntity<Optional<Planet>> getPlanet(@PathVariable Long id){
        return new ResponseEntity<>(planetRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/planets")
    public ResponseEntity<Planet> createPlanet(@RequestBody Planet planet) {
        planetRepository.save(planet);
        return new ResponseEntity<>(planet, HttpStatus.CREATED);
    }

}
