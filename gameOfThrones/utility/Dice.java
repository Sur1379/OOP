package com.company.gameOfThrones.utility;

import java.util.Random;

public class Dice {
    public static int player1Dice;
    public static int player2Dice;

    int makeDice() {
        int max = 0;
        Random random = new Random();
        do {
            player1Dice = random.nextInt(6) + 1;
            player2Dice = random.nextInt(6) + 1;
            if (player1Dice > player2Dice) {
                max = player1Dice;
            } else if (player1Dice < player2Dice) {
                max = player2Dice;
            }
        }
        while (player1Dice == player2Dice);
        return (max);
    }

    void printDice(int N) {
        if(player1Dice > player2Dice){
            System.out.println("You are first\n");
        }
        else {
            System.out.println("Opponent is first\n");
        }
        char[][][] matrix = {
                {{' ', ' ', ' '},{' ', '*', ' '},{' ', ' ', ' '}},
                {{'*', ' ', ' '},{' ', ' ', ' '},{' ', ' ', '*'}},
                {{'*', ' ', ' '},{' ', '*', ' '},{' ', ' ', '*'}},
                {{'*', ' ', '*'},{' ', ' ', ' '},{'*', ' ', '*'}},
                {{'*', ' ', '*'},{' ', '*', ' '},{'*', ' ', '*'}},
                {{'*', ' ', '*'},{'*', ' ', '*'},{'*', ' ', '*'}},
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[player1Dice - 1][i][j] + "  ");
                if (j == 2) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[player2Dice - 1][i][j] + "  ");
                if (j == 2) {
                    System.out.println();
                }
            }
        }
    }
}
