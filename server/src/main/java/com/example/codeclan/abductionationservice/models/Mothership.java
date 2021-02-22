package com.example.codeclan.abductionationservice.models;

import com.example.codeclan.abductionationservice.models.energy.DarkMatterNugget;
import com.example.codeclan.abductionationservice.models.energy.MeatCube;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="motherships")
public class Mothership {
    // todo: implement iGenerate

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column
    private int cellCapacity;

    @Column
    private int pantryCapacity;

    @Column
    private int fuelCapacity;

    @Column
    private ArrayList<Spacecraft> spacecrafts;

    @Column
    private ArrayList<Abductee> cells;

    @Column
    private int pantry;

    @Column
    private int fuel;

    public Mothership(int cellCapacity, int pantryCapacity, int fuelCapacity) {
        this.cellCapacity = cellCapacity;
        this.pantryCapacity = pantryCapacity;
        this.fuelCapacity = fuelCapacity;
        this.cells = new ArrayList<Abductee>();
        this.pantry = 0;
        this.fuel = 0;
        this.spacecrafts = new ArrayList<Spacecraft>();

    }

    public Mothership(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCellCapacity() {
        return cellCapacity;
    }

    public void setCellCapacity(int cellCapacity) {
        this.cellCapacity = cellCapacity;
    }

    public int getPantryCapacity() {
        return pantryCapacity;
    }

    public void setPantryCapacity(int pantryCapacity) {
        this.pantryCapacity = pantryCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public ArrayList<Abductee> getCells() {
        return cells;
    }

    public void setCells(ArrayList<Abductee> cells) {
        this.cells = cells;
    }

    public int getPantry() {
        return pantry;
    }

    public void setPantry(int pantry) {
        this.pantry = pantry;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public ArrayList<Spacecraft> getSpacecrafts() {
        return spacecrafts;
    }

    public void setSpacecrafts(ArrayList<Spacecraft> spacecrafts) {
        this.spacecrafts = spacecrafts;
    }

//    todo: Add methods (scan, abduct, generate, snack, feast)

}
