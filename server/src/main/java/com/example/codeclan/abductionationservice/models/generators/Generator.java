package com.example.codeclan.abductionationservice.models.generators;

import javax.persistence.*;

@Entity
@Table(name="generators")
public abstract class Generator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    String name;

    @Column(name="output")
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
