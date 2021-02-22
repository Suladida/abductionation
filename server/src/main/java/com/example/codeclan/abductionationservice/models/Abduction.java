package com.example.codeclan.abductionationservice.models;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name="abductions")
public class Abduction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="date")
    Date date;

    @Column(name="time")
    Time time;

    @Column(name="planet")
    Planet planet;

    @Column(name="spacecraft")
    Spacecraft spacecraft;

    @Column(name="beam")
    ArrayList<Abductee> beam;

    public Abduction(Date date, Time time, Planet planet, Spacecraft spacecraft) {
        this.date = date;
        this.time = time;
        this.planet = planet;
        this.spacecraft = spacecraft;
        this.beam = new ArrayList<Abductee>();
    }

    public Abduction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public Spacecraft getSpacecraft() {
        return spacecraft;
    }

    public void setSpacecraft(Spacecraft spacecraft) {
        this.spacecraft = spacecraft;
    }

    public ArrayList<Abductee> getBeam() {
        return beam;
    }

    public void setBeam(ArrayList<Abductee> beam) {
        this.beam = beam;
    }
}
