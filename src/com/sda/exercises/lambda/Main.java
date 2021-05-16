package com.sda.exercises.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Math additionLambda = (int a, int b) -> a + b;
        System.out.println("Lambda addition " + additionLambda.calculate(2, 3));

        //fara lambda
        Math addition = new Math() {
            @Override
            public double calculate(int a, int b) {
                return a + b;
            }
        };

        System.out.println("addition without lambda" + addition.calculate(2, 3));

        Math subtraction = (a, b) -> a - b;
        System.out.println("Lambda subtraction " + subtraction.calculate(5, 3));

        Math divisionLambda = (a, b) -> a / b;
        System.out.println("Lambda division " + divisionLambda.calculate(9, 3));

        Math multiplicationLambda = (a, b) -> a * b;
        System.out.println("Lambda multiplication " + multiplicationLambda.calculate(2, 3));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(33);
        numbers.add(12);
        numbers.add(13);
        numbers.add(100);

        int sum = 0;
        for (Integer number : numbers) {
            System.out.println(number);
            //fara lambda expression
//            sum+=number;

            sum = (int) additionLambda.calculate(sum, number);
        }
        System.out.println("The sum of elements in the list is: " + sum);
    }

    //todo punctele c si d din exercitiul cu lambda
}
