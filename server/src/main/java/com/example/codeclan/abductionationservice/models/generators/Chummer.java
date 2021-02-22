package com.example.codeclan.abductionationservice.models.generators;

import com.example.codeclan.abductionationservice.models.Abductee;

public class Chummer extends Generator implements iGenerate {

    public Chummer(){
        super("Chummer", "Food");
    }

    @Override
    public double generate(Abductee abductee) {
        double result = (abductee.getWeight() * abductee.getDensity()) / 10 ;
        return result;
    }
}
