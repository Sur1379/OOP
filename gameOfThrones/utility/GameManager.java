package com.company.gameOfThrones.utility;

import com.company.gameOfThrones.Game;
import com.company.gameOfThrones.warriors.Archer;
import com.company.gameOfThrones.warriors.Mage;
import com.company.gameOfThrones.warriors.Swordsman;

import java.util.Random;
import java.util.Scanner;

public class GameManager {


    public void choosePersonage() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("       Choose your personage");
        System.out.println("           1.Swordsman \n            2.Archer \n             3.Mage");
        extractChooseWarrior(scanner.nextInt());
        extractChooseOpponent(random.nextInt(2) + 1);
        Dice dice = new Dice();
        dice.printDice(dice.makeDice());

    }

    private void extractChooseWarrior(int input) {
        switch (input) {
            case 1:
              Game.setWarrior(new Swordsman());
                break;
            case 2:
                Game.setWarrior(new Archer());
                break;
            case 3:
                Game.setWarrior(new Mage());
                break;
        }
    }
    private void extractChooseOpponent(int num) {
        switch (num) {
            case 1:
                Game.setOpponent(new Swordsman());
                break;
            case 2:
                Game.setOpponent(new Archer());
                break;
            case 3:
                Game.setOpponent(new Mage());
                break;
        }
    }

}

