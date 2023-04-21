package org.example;

public class City {
    private Electricity electricity;
    private Water water;
    private Industry industry;

    public City(Electricity electricity, Water water, Industry industry) {
        this.electricity = electricity;
        this.water = water;
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "City{" +
                   "electricity=" + electricity +
                   ", water=" + water +
                   ", industry=" + industry +
                   '}';
    }
}
