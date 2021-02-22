package com.example.codeclan.abductionationservice.controllers;

import com.example.codeclan.abductionationservice.models.Abductee;
import com.example.codeclan.abductionationservice.models.Abduction;
import com.example.codeclan.abductionationservice.repositories.AbducteeRepository;
import com.example.codeclan.abductionationservice.repositories.AbductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AbductionController {

    @Autowired
    AbductionRepository abductionRepository;

    @GetMapping(value="/abductions")
    public ResponseEntity<List<Abduction>> getAllAbductions(){
        return new ResponseEntity<>(abductionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/abductions/{id}")
    public ResponseEntity<Optional<Abduction>> getAbduction(@PathVariable Long id){
        return new ResponseEntity<>(abductionRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/abductions")
    public ResponseEntity<Abduction> createAbduction(@RequestBody Abduction abduction) {
        abductionRepository.save(abduction);
        return new ResponseEntity<>(abduction, HttpStatus.CREATED);
    }

}
