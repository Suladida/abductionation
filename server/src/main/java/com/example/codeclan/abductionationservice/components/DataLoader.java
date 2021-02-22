package com.example.codeclan.abductionationservice.components;

import com.example.codeclan.abductionationservice.models.*;
import com.example.codeclan.abductionationservice.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MothershipRepository mothershipRepository;

    @Autowired
    AbducteeRepository abducteeRepository;

    @Autowired
    PlanetRepository planetRepository;

    @Autowired
    SpacecraftRepository spacecraftRepository;

    @Autowired
    AbductionRepository abductionRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Abductee human001 = new Abductee(Species.HUMAN, 75.0, 0.5);
        Abductee decapodian001 = new Abductee(Species.DECAPODIAN, 100.0, 0.1);
        Abductee omecronian001 = new Abductee(Species.OMECRONIAN, 150.0, 0.9);
        abducteeRepository.save(human001);
        abducteeRepository.save(decapodian001);
        abducteeRepository.save(omecronian001);

        Planet earth = new Planet("Earth", Species.HUMAN);
        Planet decapod10 = new Planet("Decapod 10", Species.DECAPODIAN);
        Planet omecronPersei8 = new Planet("Omecron Persei 8", Species.OMECRONIAN);
        planetRepository.save(earth);
        planetRepository.save(decapod10);
        planetRepository.save(omecronPersei8);

        Spacecraft scootyPuffJr = new Spacecraft("Scooty Puff Junior", 1);
        spacecraftRepository.save(scootyPuffJr);

        Mothership mothership = new Mothership(10, 10, 10);
        mothershipRepository.save(mothership);

        Abduction abduction001 = new Abduction("2021-01-01", "12:00", earth, scootyPuffJr);
        abductionRepository.save(abduction001);

    }
}
