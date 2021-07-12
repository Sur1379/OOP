package com.company.animal;

import com.company.animal.model.Bird.Eagle;
import com.company.animal.model.Bird.Sparrow;
import com.company.animal.model.Flyable;
import com.company.animal.model.Insect.Bee;
import com.company.animal.model.Mammal.Bat;

public class Main {
    public static void main(String[] args) {
        Flyable[] flyables = new Flyable[4];
        Bat bat = new Bat();
        Eagle eagle = new Eagle();
        Sparrow sparrow = new Sparrow();
        Bee bee = new Bee();
        flyables[0] = bat;
        flyables[1] = eagle;
        flyables[2] = sparrow;
        flyables[3] = bee;
        for (int i = 0; i < flyables.length; i++) {
            System.out.println(flyables[i].toString() + " is flying");
        }
    }
}
