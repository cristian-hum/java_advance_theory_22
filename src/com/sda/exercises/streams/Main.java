package com.sda.exercises.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numbers = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        namesList
                .stream()
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .forEach((name) -> System.out.println(name));

        System.out.println("\nFIlter by E");
        namesList
                .stream()
                .filter((name) -> name.startsWith("E"))
                .forEach((name) -> System.out.println(name));

        System.out.println();
        numbers.stream()
                .filter((number) -> number > 30 && number < 200)
                .forEach(number -> System.out.println(number));

        System.out.println("\nPrint names uppercase");
        namesList.stream().forEach(name -> System.out.println(name.toUpperCase()));

        System.out.println("\nPrint names uppercase with map");
        namesList
                .stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.println(name));

        System.out.println("\nRemove first and last letter, sort and print names.");
        namesList.stream()
                .map(name -> name.substring(1, name.length() - 1))
                .sorted((name1, name2) -> name1.compareToIgnoreCase(name2))
                .forEach(name -> System.out.println(name));

        System.out.println("Sort backwards by implementing reverse COmpaaertor and using lambda expression");
        namesList.stream()
                .map(name -> new StringBuilder(name).reverse())
                .forEach(name -> System.out.println(name));
    }
}
