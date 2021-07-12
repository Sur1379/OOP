package com.company.tasks;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String []args){
        Scanner user = new Scanner(System.in);
        System.out.println("Input an integer");
        int x = user.nextInt();
        x = x / 100;
        switch(x) {
            case 0:
                System.out.println("number is in 0 - 100 range");
                break;
            case 1:
                System.out.println("number is in 100 - 200 range");
                break;
            case 2:
                System.out.println("number is in 200 - 300 range");
                break;
            default:
                System.out.println("number is in other range");
                break;
        }

    }
}
