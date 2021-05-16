package com.sda.exercises;

import com.sda.exercises.enums.Planets;

public class Main {
    public static void main(String[] args) {
        Planets jupiter = Planets.JUPITER;
        System.out.println(jupiter.toString());

        Planets saturn = Planets.SATURN;
        System.out.println(saturn.toString());

        Planets pluto = Planets.PLUTO;
        System.out.println(pluto.toString());
    }
}
