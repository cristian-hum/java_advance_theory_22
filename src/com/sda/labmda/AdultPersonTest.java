package com.sda.labmda;

import java.util.function.Predicate;

public class AdultPersonTest implements InterfaceForLambda<Person> {
    @Override
    public boolean printMessage(String message) {
        System.out.println(message);

        return true;
    }
}
