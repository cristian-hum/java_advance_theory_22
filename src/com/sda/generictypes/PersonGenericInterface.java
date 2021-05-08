package com.sda.generictypes;

public class PersonGenericInterface implements Comparable<PersonGenericInterface> {
    private String name;
    private double height;

    public PersonGenericInterface(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(PersonGenericInterface personGenericInterface) {
        // 1 -> superioritate
        // 0 -> egalitate
        // -1 -> inferioritate

        if((this.height - personGenericInterface.getHeight()) > 0) {
            // pentru ca inaltimea primului e mai mare
            return 1;
        } else if(this.height - personGenericInterface.getHeight() < 0) {
            // pentru ca inaltimea primului este mai mica
            return -1;
        } else {
            // pentru ca inaltimile sunt egale
            return 0;
        }
    }
}
