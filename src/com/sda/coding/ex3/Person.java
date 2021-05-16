package com.sda.coding.ex3;

public class Person {
    private String name;
    private String lastName;
    private String phoneNumber;

    public Person(String name, String lastName, String phoneNumber){
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        System.out.println("Person class constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
