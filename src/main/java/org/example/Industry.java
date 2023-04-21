package org.example;

public class Industry {
    private final String name;

    public Industry(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Industry{" +
                   "name='" + name + '\'' +
                   '}';
    }
}
