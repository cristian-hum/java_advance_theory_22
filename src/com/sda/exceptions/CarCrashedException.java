package com.sda.exceptions;

public class CarCrashedException extends Exception {
    public CarCrashedException(Car car) {
        // calling Exception(String message) constructor
        super("Car " + car.getBrand() + " has crashed!");
//        System.out.println("Speed: " + car.getSpeed());
    }

}
