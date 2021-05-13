package com.sda.coding.ex2;

public class Item {
    private String name;
    private double value;

    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName(){return this.name;}
    public double getValue(){return this.value;}

    public void setName(String name){this.name = name;}
    public void setValue(double value){this.value = value;}

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }


}
