package com.company.dynamicArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DynamicArray<String> dynamicArray = new DynamicArray();
        for (int i = 0; i < 6; i++) {
            System.out.println("Input array element");
            dynamicArray.dsqAdd(scanner.next());
        }
        dynamicArray.printArray();
        System.out.println(dynamicArray.size());
        dynamicArray.remove("a");
        dynamicArray.printArray();
        String[] s = {"a", "s", "d"};
        dynamicArray.removeAll(s);
        dynamicArray.printArray();
    }
}
