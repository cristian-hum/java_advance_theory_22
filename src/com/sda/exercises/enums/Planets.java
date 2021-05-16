package com.sda.exercises.enums;

public enum Planets {
    JUPITER("Jupiter", "Huge"),
    PLUTO("Pluto", "Small"),
    MARS("Mars", "Medium"),
    SATURN("Saturn", "Huge");

    private String name;
    private String size;

    Planets(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return this.size + " " + this.name;
    }

    public static void distanceFromEarth(){

    }
}
