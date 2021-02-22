package com.example.codeclan.abductionationservice.models;

import javax.persistence.*;
import java.util.ArrayList;

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
    private int cellCapacity;

    @Column
    private ArrayList<Abductee> freshMeat;

    public Spacecraft(String name, int cellCapacity) {
        this.name = name;
        this.cellCapacity = cellCapacity;
        this.freshMeat = new ArrayList<>();
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

    public int getCellCapacity() {
        return cellCapacity;
    }

    public void setCellCapacity(int cellCapacity) {
        this.cellCapacity = cellCapacity;
    }

    public ArrayList<Abductee> getFreshMeat() {
        return freshMeat;
    }

    public void setFreshMeat(ArrayList<Abductee> freshMeat) {
        this.freshMeat = freshMeat;
    }
}
