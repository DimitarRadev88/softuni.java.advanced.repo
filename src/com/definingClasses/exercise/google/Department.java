package com.definingClasses.exercise.google;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
