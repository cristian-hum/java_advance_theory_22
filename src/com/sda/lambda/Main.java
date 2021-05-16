package com.sda.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ex();
        ex2();

    }

    public static void ex() {
        NameFormatInterface nameFormatInterface = new NameFormatInterface() {
            @Override
            public String formatName(String name) {
                return "First name: " + name;
            }
        };

        //echivalent cu ce scrie si mai sus, din partea dreapta mai pastreaza doar argumentu si implementarea
        //nu mai trebuie sa specifici tipul parametrului
        //nu ai nevoie de paranteze daca ai un singur parametru
        NameFormatInterface nameFormatInterfaceLambda = (name) -> "First name lambda: " + name;

        //fara lambda
        System.out.println(nameFormatInterface.formatName("Catalin"));

        //cu lambda
        System.out.println(nameFormatInterfaceLambda.formatName("Catalin"));
    }

    public static void ex2() {
        List<String> carNameList = new ArrayList<>();
        carNameList.add("Fiat");
        carNameList.add("BMW");
        carNameList.add("Saab");
        carNameList.add("Audi");

        //fara lambda
        System.out.println("Without Lambda expression");
        for (String carName : carNameList) {
            System.out.println(carName);
        }
        System.out.println("-----------");

        //cu lambda, folosind o metoda din interiorul unei liste
        System.out.println("With Lambda Expression");
        carNameList.forEach((carName) -> {
            System.out.println("Putem folosi mai multe instructiuni in cadrul aceleiasi metode din lambda");
            System.out.println(carName);
        });
    }


}
