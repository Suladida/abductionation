package com.example.codeclan.abductionationservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="abductions")
public class Abduction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="date")
    String date;

    @Column(name="time")
    String time;

//    @ManyToOne
//    @JoinColumn(name= "mothership", nullable = false)
//    @JsonIgnoreProperties({"abductions"})
//    Mothership mothership;

    @ManyToOne
    @JoinColumn(name= "planet_id", nullable = false)
    @JsonIgnoreProperties({"abductions"})
    Planet planet;

    @ManyToOne
    @JoinColumn(name= "spacecraft_id", nullable = false)
    @JsonIgnoreProperties({"abductions"})
    Spacecraft spacecraft;

    @Column(name="beam")
    ArrayList<Abductee> beam;

    public Abduction(String date, String time, Planet planet, Spacecraft spacecraft) {
        this.date = date;
        this.time = time;
        this.planet = planet;
        this.spacecraft = spacecraft;
        this.beam = new ArrayList<>();
    }

    public Abduction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

//    public Mothership getMothership() {
//        return mothership;
//    }
//
//    public void setMothership(Mothership mothership) {
//        this.mothership = mothership;
//    }

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
