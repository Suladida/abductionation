package com.example.codeclan.abductionationservice.controllers;

import com.example.codeclan.abductionationservice.models.Abductee;
import com.example.codeclan.abductionationservice.repositories.AbducteeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AbducteeController {

    @Autowired
    AbducteeRepository abducteeRepository;

    @GetMapping(value="/abductees")
    public ResponseEntity<List<Abductee>> getAllAbductees(){
        return new ResponseEntity<>(abducteeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/abductees/{id}")
    public Optional<Abductee> getAbductee(@PathVariable Long id){
        return abducteeRepository.findById(id);
    }

}
