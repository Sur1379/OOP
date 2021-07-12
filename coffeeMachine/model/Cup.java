package com.company.coffeeMachine.model;

import com.company.coffeeMachine.util.Command;

import java.util.Arrays;

public class Cup {

    private Drink drink;
    private Stick stick;
    private Sugar[] sugar;

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Stick getStick() {
        return stick;
    }

    public void setStick(Stick stick) {
        this.stick = stick;
    }

    public Sugar[] getSugar() {
        return sugar;
    }

    public void setSugar(Sugar[] sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        if(Command.getSugarCount() > 0){
            return "Cup{" +
                    "drink = " + drink +
                    ", stick = " + stick +
                    ", sugar = " + Arrays.toString(sugar) +
                    '}';
        }
       return "Cup { " +
               "drink = " + drink + " }";
    }
}
