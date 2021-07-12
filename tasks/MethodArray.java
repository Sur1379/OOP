package com.company.tasks;

import java.util.Random;

public class MethodArray {


    public static void main(String[] args) {

        int[] ints = inicializeArray();
        printArray(ints);
        int[] ints1 = reverseArray(ints);
        printArray(ints1);
    }

    public static int[] inicializeArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) + 1;
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -1 * array[i];
        }
        return array;
    }
}
