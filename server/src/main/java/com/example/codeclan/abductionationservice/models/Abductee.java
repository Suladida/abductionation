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

    @Column(name="weight")
    double weight;

    @Column(name="density")
    double density;

    public Abductee(Species species, double weight, double density) {
        this.species = species;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

}
