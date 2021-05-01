package com.sda.inheritance.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("rex", 1, "M", "pitbul", 15);
        Cat cat = new Cat("tzytzy", 2, "F", "britishcat", 4);

        // array de obiecte
        Animal[] animals = new Animal[]{cat, dog};

        for (Animal animal : animals) {
            System.out.println(animal.getName());
            animal.yieldVoice();
        }

        //creare obiect din clasa abstracta, cu override metoda abstracta
        Animal a = new Animal("yogi", 10, "M", "cool", 15) {
            @Override
            public void yieldVoice() {
                System.out.println("generic animal voice");
            }
        };

        System.out.println(a);
    }



}
