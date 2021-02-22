package com.example.codeclan.abductionationservice;

import com.example.codeclan.abductionationservice.models.*;
import com.example.codeclan.abductionationservice.models.generators.Chummer;
import com.example.codeclan.abductionationservice.models.generators.Flicker;
import com.example.codeclan.abductionationservice.models.generators.Generator;
import com.example.codeclan.abductionationservice.repositories.*;
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

	@Autowired
	AbductionRepository abductionRepository;

	@Autowired
	GeneratorRepository generatorRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAllModels(){
		Abductee human001 = new Abductee(Species.HUMAN, 75.0, 0.5);
		Abductee decapodian001 = new Abductee(Species.DECAPODIAN, 100.0, 0.1);
		Abductee omecronian001 = new Abductee(Species.OMECRONIAN, 150.0, 0.9);
		abducteeRepository.save(human001);
		abducteeRepository.save(decapodian001);
		abducteeRepository.save(omecronian001);
//		includes DataLoader
		assertEquals(6, abducteeRepository.findAll().size());

		Planet earth = new Planet("Earth", Species.HUMAN);
		Planet decapod10 = new Planet("Decapod 10", Species.DECAPODIAN);
		Planet omecronPersei8 = new Planet("Omecron Persei 8", Species.OMECRONIAN);
		planetRepository.save(earth);
		planetRepository.save(decapod10);
		planetRepository.save(omecronPersei8);
//		includes DataLoader
		assertEquals(6, planetRepository.findAll().size());

		Mothership mothership = new Mothership(10, 10, 10);
		mothershipRepository.save(mothership);
//		includes DataLoader
		assertEquals(2, mothershipRepository.findAll().size());

		Spacecraft scootyPuffJr = new Spacecraft("Scooty Puff Junior", 1, mothership);
		spacecraftRepository.save(scootyPuffJr);
//		includes DataLoader
		assertEquals(2, spacecraftRepository.findAll().size());

		Abduction abduction001 = new Abduction("2021-01-01", "12:00", earth, scootyPuffJr);
		abductionRepository.save(abduction001);

		Generator chummer = new Chummer();
		generatorRepository.save(chummer);
		Generator flicker = new Flicker();
		generatorRepository.save(flicker);
		assertEquals(2, generatorRepository.findAll());

	}

//	@Test
//	public void canAbduct() {
//		Mothership mothership = new Mothership(10, 10, 10);
//		mothershipRepository.save(mothership);
//		Spacecraft scootyPuffJr = new Spacecraft("Scooty Puff Junior", 1, mothership);
//		spacecraftRepository.save(scootyPuffJr);
//		Abductee human001 = new Abductee(Species.HUMAN, 75.0, 0.5);
//		abducteeRepository.save(human001);
//		mothership.abduct(scootyPuffJr, human001);
//		assertEquals(2, spacecraftRepository.findAll().size());
//	}


	}
