package com.gym.gymapp.model;

import jakarta.persistence.*;

@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int weight;
    private int reps;

    public Exercise() {}

    public Exercise(String name, int weight, int reps) {
        this.name = name;
        this.weight = weight;
        this.reps = reps;
    }

    // Getters and setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }
    public int getReps() { return reps; }
    public void setReps(int reps) { this.reps = reps; }
}
