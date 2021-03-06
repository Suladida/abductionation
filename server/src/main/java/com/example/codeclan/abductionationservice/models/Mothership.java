package com.example.codeclan.abductionationservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="motherships")
public class Mothership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column
    private double cellCapacity;

    @Column
    private double pantryCapacity;

    @Column
    private double fuelCapacity;

    @JsonIgnoreProperties({"mothership"})
    @OneToMany(mappedBy= "mothership")
    private List<Spacecraft> spacecrafts;

    @Column
    private ArrayList<Abductee> cells;

    @Column
    private double pantry;

    @Column
    private double fuel;


    public Mothership(double cellCapacity, double pantryCapacity, double fuelCapacity) {
        this.cellCapacity = cellCapacity;
        this.pantryCapacity = pantryCapacity;
        this.fuelCapacity = fuelCapacity;
        this.cells = new ArrayList<Abductee>();
        this.pantry = 0.0;
        this.fuel = 0.0;
        this.spacecrafts = new ArrayList<Spacecraft>();
    }

    public Mothership(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCellCapacity() {
        return cellCapacity;
    }

    public void setCellCapacity(double cellCapacity) {
        this.cellCapacity = cellCapacity;
    }

    public double getPantryCapacity() {
        return pantryCapacity;
    }

    public void setPantryCapacity(double pantryCapacity) {
        this.pantryCapacity = pantryCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public List<Spacecraft> getSpacecrafts() {
        return spacecrafts;
    }

    public void setSpacecrafts(List<Spacecraft> spacecrafts) {
        this.spacecrafts = spacecrafts;
    }

    public ArrayList<Abductee> getCells() {
        return cells;
    }

    public void setCells(ArrayList<Abductee> cells) {
        this.cells = cells;
    }

    public double getPantry() {
        return pantry;
    }

    public void setPantry(double pantry) {
        this.pantry = pantry;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public ArrayList<Abductee> scan(Planet planet){
        ArrayList<Abductee> population = planet.getPopulation();
        return population;
    }

//    public void abduct(Spacecraft spacecraft, Planet planet, ArrayList<Abductee> abductees){
////        SCAN PLANET
//        ArrayList<Abductee> population = spacecraft.scanPlanet(planet);
////        BEAM ABDUCTEES
//        spacecraft.beamAll(abductees);
////        REMOVE FROM PLANET
//        population.removeAll(abductees);
////        ABDUCT ABDUCTEES
//        cells.addAll(abductees);
////        REMOVE FROM SPACECRAFT
//        spacecraft.removeAbductees(abductees);
//    }

/*TODO:
       1. .scan(Planet planet)
       2. .abduct(Abductee abductee)
       3. .abductAll(ArrayList<Abductee> abductees)
       4. .generate(Generator generator, Abductee abductee)
       5. .generateAll(Generator generator, ArrayList<Abductee> abductees)
       6. .snack()
       7. .feast()  */
}
