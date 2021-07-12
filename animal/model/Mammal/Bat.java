package com.company.animal.model.Mammal;

import com.company.animal.model.Flyable;

public class Bat extends Mammal implements Flyable {
    @Override
    public void breathe() {
    }

    @Override
    public void fly() {

    }

    @Override
    public String toString() {
        return "Bat";
    }
}
