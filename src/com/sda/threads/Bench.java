package com.sda.threads;

public class Bench {
    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // synchronized - sincronizeaza accesul in metoda
    public synchronized void takeASeat() {
        System.out.println("Welcome to java course!");

        if (availableSeats > 0) {
            System.out.println("Taking a seat.");
            availableSeats--;

            System.out.println("Free seats left " + availableSeats);
        } else {
            System.out.println("There are no available seats. :(");
        }

        System.out.println("Bye!");
    }
//    sincronizarea unui block de cod in cadrul metodei
//    public void takeASeat() {
//        System.out.println("Welcome to java course!");
//
//        synchronized (this) {
//            if (availableSeats > 0) {
//                System.out.println("Taking a seat.");
//                availableSeats--;
//
//                System.out.println("Free seats left " + availableSeats);
//            } else {
//                System.out.println("There are no available seats. :(");
//            }
//        }
//
//        System.out.println("Bye!");
//    }

}
