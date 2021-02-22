package com.example.codeclan.abductionationservice;

import com.example.codeclan.abductionationservice.models.*;
import com.example.codeclan.abductionationservice.repositories.AbducteeRepository;
import com.example.codeclan.abductionationservice.repositories.MothershipRepository;
import com.example.codeclan.abductionationservice.repositories.PlanetRepository;
import com.example.codeclan.abductionationservice.repositories.SpacecraftRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class AbductionationserviceApplicationTests {

	@Autowired
	MothershipRepository mothershipRepository;

	@Autowired
	AbducteeRepository abducteeRepository;

	@Autowired
	PlanetRepository planetRepository;

	@Autowired
	SpacecraftRepository spacecraftRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createAbductee(){
		Abductee human001 = new Abductee(Species.HUMAN, 75.0, 0.5);
		Abductee decapodian001 = new Abductee(Species.DECAPODIAN, 100.0, 0.1);
		Abductee omecronian001 = new Abductee(Species.OMECRONIAN, 150.0, 0.9);
		abducteeRepository.save(human001);
		abducteeRepository.save(decapodian001);
		abducteeRepository.save(omecronian001);
	}

	@Test
	public void createPlanet(){
		Planet earth = new Planet("Earth", Species.HUMAN);
		Planet decapod10 = new Planet("Decapod 10", Species.DECAPODIAN);
		Planet omecronPersei8 = new Planet("Omecron Persei 8", Species.OMECRONIAN);
		planetRepository.save(earth);
		planetRepository.save(decapod10);
		planetRepository.save(omecronPersei8);
	}

	@Test
	public void createSpacecraft(){
		Spacecraft scootyPuffJr = new Spacecraft("Scooty Puff Junior", 1);
		spacecraftRepository.save(scootyPuffJr);
	}

	@Test
	public void createMothership(){
		Mothership mothership = new Mothership(10, 10, 10);
		mothershipRepository.save(mothership);
	}

}
