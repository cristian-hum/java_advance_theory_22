package com.sda.coding.ex1;

public class Developer extends Person {
    private String type;

    public Developer(String name, String type) {
        super(name);
        this.type = type;
        System.out.println("Developer class constructor called");

    }

    public void isHuman() {
        System.out.println("yes, developer is human\n");
    }

    @Override
    public String toString() {
        return "Developer{ " + super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
