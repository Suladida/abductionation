package com.example.codeclan.abductionationservice.controllers;

import com.example.codeclan.abductionationservice.models.Mothership;
import com.example.codeclan.abductionationservice.repositories.MothershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MothershipController {

    @Autowired
    MothershipRepository mothershipRepository;

    @GetMapping(value="/motherships")
    public ResponseEntity<List<Mothership>> getAllMotherships(){
        return new ResponseEntity<>(mothershipRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/motherships/{id}")
    public ResponseEntity<Optional<Mothership>> getMothership(@PathVariable Long id){
        return new ResponseEntity<>(mothershipRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/motherships")
    public ResponseEntity<Mothership> createMothership(@RequestBody Mothership mothership) {
        mothershipRepository.save(mothership);
        return new ResponseEntity<>(mothership, HttpStatus.CREATED);
    }

}
