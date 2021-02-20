package com.example.codeclan.abductionationservice.models;

import javax.persistence.*;

@Entity
@Table(name="abductees")
public class Abductee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="species")
    Species species;

    @Column(name="species_name")
    String species_name;

    @Column(name="weightKG")
    double weightKG;

    @Column(name="density")
    double density;

    public Abductee(Species species, double weightKG, double density) {
        this.species = species;
        this.species_name = this.species.toString();
        this.weightKG = weightKG;
        this.density = density;
    }

    public Abductee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public double getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(double weightKG) {
        this.weightKG = weightKG;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }
}
