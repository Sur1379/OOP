package com.company.tasks;

import java.util.Random;

public class MatrixArray {
    public static void main(String[] args) {
        int matrix[][] = new int[10][15];
        Random random = new Random();
        int sum = 0;
        int randNum = random.nextInt(50);
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                matrix[i][j] = randNum + 55;
                sum = sum + matrix[i][j];
            }
        }
        System.out.println(sum);
   }
}
