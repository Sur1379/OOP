package com.company.coffeeMachine.util;

public class Validator {
    public static boolean checkValidation(String s) {
        return s.length() == 3 && (s.charAt(0) == 'T' || s.charAt(0) == 'C' || s.charAt(0) == 'S') &&
                s.charAt(1) == ':' && (s.charAt(2)) >= '0' && s.charAt(2) <= '5';
    }
}
