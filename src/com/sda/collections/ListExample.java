package com.sda.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Array
        int[] numbers = new int[]{1,2,3,4,5,6,7};

        numbers[numbers.length - 1] = 1;
        for (int i: numbers) {
            System.out.print(i);
        }
        System.out.println();


//        Student student = new Student();
//        student.sayHello();

        IPerson iPerson = new Student();
        iPerson.sayGoodbye();
        iPerson.sayHello();

        List<String> stringList = new ArrayList<>();









    }
}
