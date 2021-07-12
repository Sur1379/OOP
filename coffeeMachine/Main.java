package com.company.coffeeMachine;

import com.company.coffeeMachine.model.Cup;
import com.company.coffeeMachine.util.Command;
import com.company.coffeeMachine.util.Converter;
import com.company.coffeeMachine.util.Validator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Command input = new Command();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Cup cup;
        String s = scanner.next();
        if (Validator.checkValidation(s)) {
            input.setCommand(s);
            input = Converter.convertInput(input.getCommand());
            cup = coffeeMachine.makeProduct(input);
            System.out.println(cup);
        } else {
            System.out.println("Incorrect choice");
        }

    }
}
