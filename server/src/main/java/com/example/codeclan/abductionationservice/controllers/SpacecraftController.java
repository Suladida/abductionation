package com.example.codeclan.abductionationservice.controllers;

import com.example.codeclan.abductionationservice.models.Abductee;
import com.example.codeclan.abductionationservice.models.Spacecraft;
import com.example.codeclan.abductionationservice.repositories.AbducteeRepository;
import com.example.codeclan.abductionationservice.repositories.SpacecraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SpacecraftController {

    @Autowired
    SpacecraftRepository spacecraftRepository;

    @GetMapping(value="/spacecrafts")
    public ResponseEntity<List<Spacecraft>> getAllSpacecrafts(){
        return new ResponseEntity<>(spacecraftRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/spacecrafts/{id}")
    public ResponseEntity<Optional<Spacecraft>> getSpacecraft(@PathVariable Long id){
        return new ResponseEntity<>(spacecraftRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/spacecrafts")
    public ResponseEntity<Spacecraft> createSpacecraft(@RequestBody Spacecraft spacecraft) {
        spacecraftRepository.save(spacecraft);
        return new ResponseEntity<>(spacecraft, HttpStatus.CREATED);
    }

}
