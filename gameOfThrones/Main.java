package com.company.gameOfThrones;

import com.company.gameOfThrones.utility.GameManager;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        gameManager.choosePersonage();
        Game.startGame();
    }
}
