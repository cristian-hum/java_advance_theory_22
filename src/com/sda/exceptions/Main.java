package com.sda.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TEORIE
        // throw - se foloseste atunci cand dorim sa aruncam o exceptie
        //  il folosesti in interiorul unei metode, deobicei dupa un if
        // throw new Exception("Mesajul vostru")

        // throws - se foloseste in semnatura metodei,
        // te informeaza ce fel de exceptie specifica poate arunca metoda
        // este indicat sa folosesti exceptia indicata in catch
//        double diffBetweenTwoNumbers(int a, int b) throws Exception {}


        // folosim try-catch pentru ca metoda "diffBetweenTwoNumbers()" poate sa arunce o exceptie
        // iar cel care a scris metoda aceasta ne avertizeaza folosid keyword-ul "throws" in semnatura metodei
        try {
            double result = diffBetweenTwoNumbers(10, 10);

            System.out.println(result);
        } catch (Exception exception) {
//            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }

        System.out.println("----------------------------------");

        try {
//            int x = 5 / 0;

//            System.out.println(x);

            String name = "Georgel";
            if(name.equals("Georgel")) {
                //thow - aruncam exceptii controlat
                // secventa de cod se va termina si va intra pe secventa de catch
                throw new NameException("Numele introdus este gresit!");
            }

            System.out.println(name.length());
        } catch (ArithmeticException | IndexOutOfBoundsException exception) {
            System.out.println("Impartirea la 0 nu are sens!");
        } catch (NullPointerException nullPointerException) {
            System.out.println("Null PointerException");
            System.out.println(nullPointerException.getMessage());
        } catch (NameException nameException) {
            System.out.println("Numele este corect!");
        } catch (Exception exception) {
            System.out.println("exception message");
            System.out.println(exception.getMessage());
        } catch (Throwable throwable) {
            System.out.println("throwable message");
            System.out.println(throwable.getMessage());
        } finally {
            System.out.println("This is finally block!");
        }

        System.out.println("Bye bye");

        System.out.println("----------------------------------");

        Car car = new Car();
        try {
            car.increaseSpeed();
            System.out.println(car.getSpeed());
            car.increaseSpeed();
            System.out.println(car.getSpeed());
            car.increaseSpeed();
            System.out.println(car.getSpeed());
        } catch (CarCrashedException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }


        // daca codul din paranteza arunca o exceptie merge in catch
        // daca nu, executa blocul de cod
        try(Scanner scanner = new Scanner(System.in)) {
            // code
            System.out.println("Executa blocul de cod!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // a = 4, b = 0;
    public static double diffBetweenTwoNumbers(int a, int b) throws Exception {
        if(a == 0 || b == 0) {
            // daca a sau b sunt 0 aruncam o exceptie cu mesaul "Numerele sunt invalide"
            throw new Exception("Numerele sunt invalide!");
        } else {
            // daca a sau b sunt diferite de 0 facem calculul.
            return a / b;
        }
    }
}
