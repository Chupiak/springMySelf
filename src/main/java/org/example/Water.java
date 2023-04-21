package org.example;

public class Water {
    private final String name;

    public Water(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Water{" +
                   "name='" + name + '\'' +
                   '}';
    }
}
