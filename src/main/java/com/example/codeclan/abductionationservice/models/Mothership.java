package com.example.codeclan.abductionationservice.models;

import com.example.codeclan.abductionationservice.models.energy.DarkMatterNugget;
import com.example.codeclan.abductionationservice.models.energy.MeatCube;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="motherships")
public class Mothership {

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
    private ArrayList<Abductee> cells;

    @Column
    private ArrayList<MeatCube> pantry;

    @Column
    private ArrayList<DarkMatterNugget> fuel;

    @Column
    private ArrayList<Spacecraft> spacecrafts;

    public Mothership(int cellCapacity, int pantryCapacity, int fuelCapacity) {
        this.cellCapacity = cellCapacity;
        this.pantryCapacity = pantryCapacity;
        this.fuelCapacity = fuelCapacity;
        this.cells = new ArrayList<Abductee>();
        this.pantry = new ArrayList<MeatCube>();
        this.fuel = new ArrayList<DarkMatterNugget>();
        this.spacecrafts = new ArrayList<Spacecraft>();

    }

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

    public ArrayList<MeatCube> getPantry() {
        return pantry;
    }

    public void setPantry(ArrayList<MeatCube> pantry) {
        this.pantry = pantry;
    }

    public ArrayList<DarkMatterNugget> getFuel() {
        return fuel;
    }

    public void setFuel(ArrayList<DarkMatterNugget> fuel) {
        this.fuel = fuel;
    }

    public ArrayList<Spacecraft> getSpacecrafts() {
        return spacecrafts;
    }

    public void setSpacecrafts(ArrayList<Spacecraft> spacecrafts) {
        this.spacecrafts = spacecrafts;
    }
}
