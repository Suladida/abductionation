package com.example.codeclan.abductionationservice.controllers;

import com.example.codeclan.abductionationservice.models.generators.Generator;
import com.example.codeclan.abductionationservice.repositories.GeneratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GeneratorController {

    @Autowired
    GeneratorRepository generatorRepository;

    @GetMapping(value="/generators")
    public ResponseEntity<List<Generator>> getAllGenerators(){
        return new ResponseEntity<>(generatorRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/generators/{id}")
    public ResponseEntity<Optional<Generator>> getGenerator(@PathVariable Long id){
        return new ResponseEntity<>(generatorRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/generators")
    public ResponseEntity<Generator> createGenerator(@RequestBody Generator generator) {
        generatorRepository.save(generator);
        return new ResponseEntity<>(generator, HttpStatus.CREATED);
    }

}
