package com.company.tasks;

public class Array {
    public static void main(String[] args) {
        int [] array = new int[1000];
        int count = 0;
        for (int i = 1; i <7000 ; i++) {
            if (i % 7 == 0){
                array[count] = i;
                System.out.print(array[count] + " ");
                count++;
            }

        }
    }
}
