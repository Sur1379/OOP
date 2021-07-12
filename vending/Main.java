package com.company.vending;

import com.company.vending.util.Command;
import com.company.vending.util.Converter;
import com.company.vending.util.Validator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (Validator.checkValidation(input)) {
            Command command = new Command();
            command.setCommand(input);
            VendingMachine vendingMachine = new VendingMachine();
            vendingMachine.giveProduct(Converter.convertInput(command));


        }
        else {
            System.out.println("Invalid input");
        }
    }
}
