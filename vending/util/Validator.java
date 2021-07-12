package com.company.vending.util;

public class Validator {
    public static boolean checkValidation(String input){
        if(input.length() == 5 || input.length() == 6){
            if(input.charAt(1) == ':' && input.charAt(3) == ':' && (input.charAt(0) == 'D' || input.charAt(0) == 'C'
                    || input.charAt(0) == 'S' || input.charAt(0) == 'c') && input.charAt(2) > '0'
                    && input.charAt(2) < '5'){
                if(input.length() == 6){
                    int n = Integer.parseInt(input.charAt(4) + "" + input.charAt(5));
                    return n == 10;
                }
                else return input.charAt(4) > '0' && input.charAt(4) <= '9';
            }
        }
        return false;
    }
}
