package com.company.coffeeMachine.util;

import com.company.coffeeMachine.model.DrinkType;

public class Command {
    private static String command;
    private static int sugarCount;
    private static DrinkType drinkType;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public static int getSugarCount() {
        return sugarCount;
    }

    public static DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }
}
