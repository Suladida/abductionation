package com.example.codeclan.abductionationservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="spacecrafts")
public class Spacecraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column
    private String name;

    @Column
    private double cellCapacity;

    @Column
    private ArrayList<Abductee> freshMeat;

    @OneToMany(mappedBy= "spacecraft")
    @JsonIgnoreProperties({"spacecraft"})
    private List<Abduction> abductions;

    @ManyToOne
    @JoinColumn(name= "mothership", nullable = false)
    @JsonIgnoreProperties({"spacecrafts"})
    Mothership mothership;

    public Spacecraft(String name, double cellCapacity, Mothership mothership) {
        this.name = name;
        this.cellCapacity = cellCapacity;
        this.mothership = mothership;
        this.freshMeat = new ArrayList<>();
        this.abductions = new ArrayList<>();
    }

    public Spacecraft(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCellCapacity() {
        return cellCapacity;
    }

    public void setCellCapacity(double cellCapacity) {
        this.cellCapacity = cellCapacity;
    }

    public ArrayList<Abductee> getFreshMeat() {
        return freshMeat;
    }

    public void setFreshMeat(ArrayList<Abductee> freshMeat) {
        this.freshMeat = freshMeat;
    }

    public void removeAbductee(Abductee abductee){
        freshMeat.remove(abductee);
    }

    public void removeAbductees(ArrayList<Abductee> abductees){
        freshMeat.remove(abductees);
    }

    public void clearFreshMeat(){ freshMeat.clear(); }

    public List<Abduction> getAbductions() { return abductions; }

    public void setAbductions(ArrayList<Abduction> abductions) { this.abductions = abductions; }

    public ArrayList<Abductee> scanPlanet(Planet planet){
        ArrayList<Abductee> population = planet.getPopulation();
        return population;
    }

    public void beam(Abductee abductee){
        freshMeat.add(abductee);
    }

    public void beamAll(ArrayList<Abductee> abductees){
        freshMeat.addAll(abductees);
    }








}
