package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class City {

    @Autowired
    private Electricity electricity;

    @Autowired
    private Water water;

    @Autowired
    private Industry industry;


    @Override
    public String toString() {
        return "City{" +
                   "electricity=" + electricity +
                   ", water=" + water +
                   ", industry=" + industry +
                   '}';
    }
}
