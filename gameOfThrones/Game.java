package com.company.gameOfThrones;

import com.company.gameOfThrones.utility.Dice;
import com.company.gameOfThrones.warriors.Warrior;

public class Game {

    private static Warrior warrior;

    private static Warrior opponent;

    public static Warrior getWarrior() {
        return warrior;
    }

    public static void setWarrior(Warrior warrior) {
        Game.warrior = warrior;
    }

    public static Warrior getOpponent() {
        return opponent;
    }

    public static void setOpponent(Warrior opponent) {
        Game.opponent = opponent;
    }

    static void startGame() {
        while (warrior.getHealth() > 0 && opponent.getHealth() > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (Dice.player1Dice > Dice.player2Dice) {
                System.out.print("You attack. ");
                warrior.attack(opponent, warrior);
                System.out.println(opponent.getName() + "'s health " + opponent.getHealth());
                if (opponent.getHealth() > 0) {
                    System.out.print(opponent.getName() + " is attack. ");
                    opponent.attack(warrior, opponent);
                    System.out.println("your health " + warrior.getHealth());
                }
            } else {
                System.out.print(opponent.getName() + " is attack. ");
                opponent.attack(warrior, opponent);
                System.out.println("Your health " + warrior.getHealth());
                if (warrior.getHealth() > 0) {
                    System.out.print("You attack. ");
                    warrior.attack(opponent, warrior);
                    System.out.println(opponent.getName() + "'s health " + opponent.getHealth());
                }
            }
        }

        if (warrior.getHealth() > opponent.getHealth()) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }
    }
}
