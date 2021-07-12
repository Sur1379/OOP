package com.company.coffeeMachine;

import com.company.coffeeMachine.model.*;
import com.company.coffeeMachine.util.Command;

public class CoffeeMachine {

    public Cup makeProduct(Command comm) {
        Cup cup = new Cup();
        if (Command.getSugarCount() > 0) {
            cup.setStick(new Stick());
            Sugar[] sugars = new Sugar[Command.getSugarCount()];
            for (int i = 0; i < Command.getSugarCount(); i++) {
                sugars[i] = new Sugar();
            }
            cup.setSugar(sugars);
        }
        extractDrink(cup);
        return cup;
    }

    private void extractDrink(Cup cup) {
        switch (Command.getDrinkType()) {
            case TEA:
                Tea tea = new Tea();
                cup.setDrink(tea);
                break;
            case COFFEE:
                Coffee coffee = new Coffee();
                cup.setDrink(coffee);
                break;
            default:
                Chocolate chocolate = new Chocolate();
                cup.setDrink(chocolate);
                break;
        }
    }
}
