package com.company.tasks;

import java.util.Random;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int matrix[][] = new int[10][10];
        Random random = new Random();
        int n = 1;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i >= matrix.length - 1 - j) {
                    sum = matrix[i][j] + sum;
                    n++;
//                    while (j != matrix.length - 1){
//                        j++;
//                        sum = sum + matrix[i][j];
//                    }
                }
            }
        }
        System.out.println(sum);
    }
}
