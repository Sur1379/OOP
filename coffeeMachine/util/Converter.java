package com.company.coffeeMachine.util;

import com.company.coffeeMachine.model.DrinkType;

public class Converter {

    public static Command convertInput(String input) {
        Command command = new Command();
        String[] split = input.split(":");
        command.setSugarCount(Integer.parseInt(split[1]));
        extractDrinkType(command, split);
        return command;
    }

    private static void extractDrinkType(Command command, String[] split) {
        switch (split[0]) {
            case "T":
                command.setDrinkType(DrinkType.TEA);
                break;
            case "C":
                command.setDrinkType(DrinkType.COFFEE);
                break;
            case "S":
                command.setDrinkType(DrinkType.CHOCOLATE);
                break;
        }
    }

}
