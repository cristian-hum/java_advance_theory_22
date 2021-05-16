package com.sda.coding.ex1;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
        System.out.println("Person class constructor called");
    }

    public void eats(String ceva)  {
        System.out.println("Munch Munch");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Person{ " +
                "name='" + name + '\'' +
                '}';
    }
}
