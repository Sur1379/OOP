package com.company.tasks;

public class Fibonacci {
    public static void main(String[] args) {
      int[] array = new int[10];
      array[0] = 0;
      array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        for (int i = array.length - 1 ; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
