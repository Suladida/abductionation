package com.example.codeclan.abductionationservice.models.generators;

import com.example.codeclan.abductionationservice.models.Abductee;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="generators")
public class Flicker extends Generator implements iGenerate {

    public Flicker(){
        super("Flicker", "Fuel");
    }

    @Override
    public double generate(Abductee abductee) {
        double result = (abductee.getWeight() * abductee.getDensity()) / 50 ;
        return result;
    }
}
