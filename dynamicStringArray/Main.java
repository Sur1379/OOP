package com.company.dynamicStringArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DynamicStringArray dynamicStringArray = new DynamicStringArray();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            dynamicStringArray.dsqAdd(scanner.next());
        }
        dynamicStringArray.printArray();
        String[] s = {"1", "3", "5"};
        dynamicStringArray.removeAll(s);
        dynamicStringArray.printArray();

    }
}
