package com.company.tasks;

import java.util.Scanner;

public class menuCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("    -----MENU-----\n Press 1 for Perimetre \n Press 2 for Area \n " +
                "Press 3 to Exit");
        int radius = 5;
        double perimetre = 2 * Math.PI * radius;
        double area = radius * radius * Math.PI;
        int a = scanner.nextInt();
        while (a > 0 && a < 4) {
            while (a != 3 ) {

                if (a == 1) {
                    System.out.println(perimetre);
                    System.out.println("    -----MENU-----\n Press 1 for Perimetre \n Press 2 for Area \n " +
                            "Press 3 to Exit");
                    a = scanner.nextInt();
                }
                if (a == 2) {
                    System.out.println(area);
                    System.out.println("    -----MENU-----\n Press 1 for Perimetre \n Press 2 for Area \n " +
                            "Press 3 to Exit");
                    a = scanner.nextInt();

                }
            }break;
        } if (a < 0 || a > 3) {
            System.out.println("Invalid input press valid number");
            System.out.println("    -----MENU-----\n Press 1 for Perimetre \n Press 2 for Area \n " +
                    "Press 3 to Exit");
            a = scanner.nextInt();
        }



    }
}
