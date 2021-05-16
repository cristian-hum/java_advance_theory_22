package com.sda.streams;

import com.sda.encapsulation.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();

        People p1 = new People(24, "Thomas");
        People p2 = new People(30, "Maria");
        People p3 = new People(51, "thomas");

        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);

        //declarare 2 variabile de acelasi tip
//        int age = 0, counter =0;
//
//        for (People people : peopleList) {
//            System.out.println(people.getAge() + " " + people.getName());
//
//            if(people.getName().equalsIgnoreCase("Thomas")){
//                age += people.getAge();
//                counter++;
//            }
//        }
//        //operatiune in interiorul sout-ului
//        System.out.println("Average age for people named \"Thomas\" is: "+(double)age/counter);


        //folosim filter pentru a cauta mai rapid in interiorul unei liste
        List<People> peopleWithNameThomas = peopleList
                .stream()
                //parcurgem fiecare element idn lista si verificam daca se indeplineste conditia pusa
                .filter((People p) -> p.getName()
                        .equalsIgnoreCase("Thomas") && p.getAge() > 23 && p.getAge() < 29)
                //rezultatele obtinut se salveaza intr-o lista
                .collect(Collectors.toList());

        for (People p : peopleWithNameThomas) {
            System.out.println(p.getName() + " " + p.getAge());
        }


    }
}
