package com.sda.inheritance.animals;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Animal(String name, int age, String gender, String race, double weight) {
        this.name = name;
//        this.age = age;
        this.setAge(age);
        this.gender = gender;
        this.race = race;
//        this.weight = weight;
        this.setWeight(weight);
    }

    public Animal(String gender, String race) {
//        this(...) apeleaza constructorul clasei curente
        this("", 0, gender, race, 1);
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Varsta nu poate sa fie negativa!");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setWeight(double weight) {
        if(weight <= 0) {
            System.out.println("Greutatea trebuie sa fie mai mare ca 0!");
        } else {
            this.weight = weight;
        }
    }

    public double getWeight() {
        return this.weight;
    }

    public String getName() {
        return name;
    }

    // este abstracta pentru ca in fiecare clasa copil are
    // o alta implementare, in clasa Dog afiseaza "ham ham"
    // iar in clasa Cat afiseaza "miau miau"
    public abstract void yieldVoice();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
