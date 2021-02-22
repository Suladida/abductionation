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

    //    todo: Add methods (scan, abduct, generate, snack, feast)

}
