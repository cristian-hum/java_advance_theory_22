package com.sda.coding.ex1;

public class Person {
    private String name;

    public Person(String name, String lastName, String phoneNumber){
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

//    public String getLastName() {
//        return lastName;
//    }

//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

    @Override
    public String toString() {
        return "Person{ " +
                "name='" + name + '\'' +
                '}';
    }
}
