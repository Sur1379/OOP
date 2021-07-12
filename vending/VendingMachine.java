package com.company.vending;

import com.company.vending.model.Product;
import com.company.vending.model.chips.*;
import com.company.vending.model.chocolates.*;
import com.company.vending.model.drinks.*;
import com.company.vending.model.sandwiches.*;
import com.company.vending.util.Command;

import java.util.ArrayList;

public class VendingMachine {
    private static ArrayList<Chocolates[]> chocolates = new ArrayList<>();
    private static ArrayList<Chips[]> chips = new ArrayList<>();
    private static ArrayList<Sandwiches[]> sandwiches = new ArrayList<>();
    private static ArrayList<Drinks[]> drinks = new ArrayList<>();

    public VendingMachine() {
        addDrinks();
        addChips();
        addChocolades();
        addSendwiches();
    }

    Product[] giveProduct(Command command){
        Product[] array = (Product[]) new Object[command.getQuantity()];
        switch (command.getType()){
            case DRINKS:
                for (int i = 0; i < array.length; i++) {
                    array[i] = drinks.get(command.getColumn() - 1)[0];
                    drinks.get(command.getColumn() - 1)[0] = null;
                    Drinks temp = drinks.get(command.getColumn() - 1)[0];
                    for (int j = 0; j < 8 ; j++) {
                        drinks.get(command.getColumn() - 1)[j] = drinks.get(command.getColumn() - 1)[j + 1];
                    }
                    drinks.get(command.getColumn() - 1)[9] = temp;
                }
                changeReminderCount(command);
                break;
            case CHOCOLATE:
                for (int i = 0; i < array.length; i++) {
                    array[i] = chocolates.get(command.getColumn() - 1)[0];
                    chocolates.get(command.getColumn() - 1)[0] = null;
                    Chocolates temp = chocolates.get(command.getColumn() - 1)[0];
                    for (int j = 0; j < 8 ; j++) {
                        chocolates.get(command.getColumn() - 1)[j] = chocolates.get(command.getColumn() - 1)[j + 1];
                    }
                    chocolates.get(command.getColumn() - 1)[9] = temp;
                }
                changeReminderCount(command);
                break;
            case CHIPS:
                for (int i = 0; i < array.length; i++) {
                    array[i] = chips.get(command.getColumn() - 1)[0];
                    chips.get(command.getColumn() - 1)[0] = null;
                    Chips temp = chips.get(command.getColumn() - 1)[0];
                    for (int j = 0; j < 8 ; j++) {
                        chips.get(command.getColumn() - 1)[j] = chips.get(command.getColumn() - 1)[j + 1];
                    }
                    chips.get(command.getColumn() - 1)[9] = temp;
                }
                changeReminderCount(command);
                break;
            case SANDWICHES:
                for (int i = 0; i < array.length; i++) {
                    array[i] = sandwiches.get(command.getColumn() - 1)[0];
                    sandwiches.get(command.getColumn() - 1)[0] = null;
                    Sandwiches temp = sandwiches.get(command.getColumn() - 1)[0];
                    for (int j = 0; j < 8 ; j++) {
                        sandwiches.get(command.getColumn() - 1)[j] = sandwiches.get(command.getColumn() - 1)[j + 1];
                    }
                    sandwiches.get(command.getColumn() - 1)[9] = temp;
                }
                changeReminderCount(command);
        }
        return array;
    }

    private void changeReminderCount(Command command){
        switch (command.getColumn()){
            case 1:
                switch (command.getType()) {
                    case DRINKS:
                        Cola.setReminderCount(Cola.getReminderCount() - command.getQuantity());
                        break;
                    case CHOCOLATE:
                        Snickers.setReminderCount(Snickers.getReminderCount() - command.getQuantity());
                        break;
                    case SANDWICHES:
                        Burger.setReminderCount(Burger.getReminderCount() - command.getQuantity());
                        break;
                    default:
                        Lays.setReminderCount(Lays.getReminderCount() - command.getQuantity());
                        break;
                }
                break;
            case 2:
                switch (command.getType()) {
                    case DRINKS:
                        Fanta.setReminderCount(Fanta.getReminderCount() - command.getQuantity());
                        break;
                    case CHOCOLATE:
                        Mars.setReminderCount(Mars.getReminderCount() - command.getQuantity());
                        break;
                    case SANDWICHES:
                        Cheeseburger.setReminderCount(Cheeseburger.getReminderCount() - command.getQuantity());
                        break;
                    default:
                        Pringles.setReminderCount(Pringles.getReminderCount() - command.getQuantity());
                        break;
                }
                break;
            case 3:
                switch (command.getType()) {
                    case DRINKS:
                        Pepsi.setReminderCount(Pepsi.getReminderCount() - command.getQuantity());
                        break;
                    case CHOCOLATE:
                        KitKat.setReminderCount(KitKat.getReminderCount() - command.getQuantity());
                        break;
                    case SANDWICHES:
                        HotDog.setReminderCount(HotDog.getReminderCount() - command.getQuantity());
                        break;
                    default:
                        Doritos.setReminderCount(Doritos.getReminderCount() - command.getQuantity());
                        break;
                }
                break;
            case 4:
                switch (command.getType()) {
                    case DRINKS:
                        Sprite.setReminderCount(Sprite.getReminderCount() - command.getQuantity());
                        break;
                    case CHOCOLATE:
                        Bounty.setReminderCount(Bounty.getReminderCount() - command.getQuantity());
                        break;
                    case SANDWICHES:
                        Sandwich.setReminderCount(Sandwich.getReminderCount() - command.getQuantity());
                        break;
                    default:
                        Cheetos.setReminderCount(Cheetos.getReminderCount() - command.getQuantity());
                        break;
                }
                break;
        }
    }

    private void addSendwiches() {
        Sandwiches[] burger = new Burger[10];
        for (int i = 0; i < 10; i++) {
            burger[i] = Burger.burger;
        }
        sandwiches.add(burger);

        Sandwiches[] cheeseburger = new Cheeseburger[10];
        for (int i = 0; i < 10; i++) {
            cheeseburger[i] = Cheeseburger.cheeseburger;
        }
        sandwiches.add(cheeseburger);

        Sandwiches[] hotDog = new HotDog[10];
        for (int i = 0; i < 10; i++) {
            hotDog[i] = HotDog.hotDog;
        }
        sandwiches.add(hotDog);

        Sandwiches[] sandwich = new Sandwich[10];
        for (int i = 0; i < 10; i++) {
            sandwich[i] = Sandwich.sandwich;
        }
        sandwiches.add(sandwich);
    }

    private void addChips() {
        Chips[] lays = new Lays[10];
        for (int i = 0; i < 10; i++) {
            lays[i] = Lays.lays;
        }
        chips.add(lays);

        Chips[] pringles = new Pringles[10];
        for (int i = 0; i < 10; i++) {
            pringles[i] = Pringles.pringles;
        }
        chips.add(pringles);

        Chips[] doritos = new Doritos[10];
        for (int i = 0; i < 10; i++) {
            doritos[i] = Doritos.doritos;
        }
        chips.add(doritos);

        Chips[] cheetos = new Cheetos[10];
        for (int i = 0; i < 10; i++) {
            cheetos[i] = Cheetos.cheetos;
        }
        chips.add(cheetos);
    }

    private void addChocolades() {
        Chocolates[] snickers = new Snickers[10];
        for (int i = 0; i < 10; i++) {
            snickers[i] = Snickers.snickers;
        }
        chocolates.add(snickers);

        Chocolates[] mars = new Snickers[10];
        for (int i = 0; i < 10; i++) {
            mars[i] = Mars.mars;
        }
        chocolates.add(mars);

        Chocolates[] kitkat = new KitKat[10];
        for (int i = 0; i < 10; i++) {
            kitkat[i] = KitKat.kitKat;
        }
        chocolates.add(kitkat);

        Chocolates[] bounty = new Bounty[10];
        for (int i = 0; i < 10; i++) {
            bounty[i] = Bounty.bounty;
        }
        chocolates.add(bounty);
    }

    private void addDrinks() {
        Cola cola1 = new Cola();
        Drinks[] cola = new Cola[10];
        for (int i = 0; i < 10; i++) {
            cola[i] = cola1;
        }
        drinks.add(cola);
        Fanta fanta1 = new Fanta();
        Drinks[] fanta = new Fanta[10];
        for (int i = 0; i < 10; i++) {
            fanta[i] = fanta1;
        }
        drinks.add(fanta);
        Pepsi pepsi1 = new Pepsi();
        Drinks[] pepsi = new Pepsi[10];
        for (int i = 0; i < 10; i++) {
            pepsi[i] = pepsi1;
        }
        drinks.add(pepsi);
        Sprite sprite1 = new Sprite();
        Drinks[] sprite = new Sprite[10];
        for (int i = 0; i < 10; i++) {
            sprite[i] = sprite1;
        }
        drinks.add(sprite);
    }

}
