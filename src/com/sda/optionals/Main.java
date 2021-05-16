package com.sda.optionals;

import com.sda.encapsulation.Person;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String name = null;
//        String name = "catalin old name";
        if (name == null) {
            System.out.println("Name is null");
        } else {
            System.out.println("Name is not null");
        }

        Optional<String> optionalNameString = Optional.ofNullable(name);
        //verifica daca valoarea lui name este null, iar daca este ii seteaza o noua valoare
        //daca nu este null, atunci pastreaza valoarea veche
        name = optionalNameString.orElse("Catalin");

        System.out.println("New name: " + name);
        try {
            Person p = getPerson();
            name = optionalNameString.orElseThrow();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static Person getPerson() {
        return new Person();
    }
}
