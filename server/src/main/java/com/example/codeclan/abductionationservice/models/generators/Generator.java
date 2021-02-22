package com.example.codeclan.abductionationservice.models.generators;

public abstract class Generator {

    String name;
    String outputType;

    public Generator(String name, String outputType) {
        this.name = name;
        this.outputType = outputType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutputType() {
        return outputType;
    }

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }
}
