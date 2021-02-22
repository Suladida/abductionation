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

    @JsonIgnoreProperties({"spacecraft"})
    @OneToMany(mappedBy= "spacecraft")
    private List<Abduction> abductions;

    public Spacecraft(String name, double cellCapacity) {
        this.name = name;
        this.cellCapacity = cellCapacity;
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

    public List<Abduction> getAbductions() {
        return abductions;
    }

    public void setAbductions(ArrayList<Abduction> abductions) {
        this.abductions = abductions;
    }
}
