package org.example;

public class Electricity {
    private final String name;

    public Electricity(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Electricity{" +
                   "name='" + name + '\'' +
                   '}';
    }
}
