package com.sda.labmda;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // varianta fara lambda
        Person person = new Person(39, "Popescu", "Marian");
        InterfaceForLambda<Person> personPredicate = new AdultPersonTest();
        personPredicate.printMessage(person.getName());

        Person person2 = new Person(20, "Gigel", "Cantaretul");

        // lambda expression se foloseste atunci cand in cadrul intefetei avem
        // o singura metoda

        // with lambda expression version
//        Predicate<Person> personPredicate1 = p -> p.getAge() >= 18;

        // without lambda expression version
        Predicate<Person> personPredicate2 = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 18;
            }
        };


        // message -> este acelasi lucru cu parametrul metodei printMessage(String message) din interfata
        InterfaceForLambda<Person> personInterfaceForLambda = message -> message.toLowerCase().equals("popescu") ;
        System.out.println(personInterfaceForLambda.printMessage("popescu"));


        // () - semnifica ca metoda run in cazul asta, nu are parametrii
        Runnable myRunnable = () -> System.out.println("Running a runnable");
        myRunnable.run();

        // suprascrie metoda test() din interfata predicate, cu aceasta linie: s -> s.startsWith("ABC")
        Predicate<String> startsWithABCTest = s -> s.startsWith("ABC");
        System.out.println(startsWithABCTest.test("ABCDEF"));

    }
}
