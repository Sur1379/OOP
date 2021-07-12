package com.company.tasks;

import java.util.Random;

public class AverageSum {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = {9, 5, 6, 4, 7, 8};
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
        }
        System.out.println(calculate(array) + " is average of array elements");
        System.out.println(calculate(matrix) + " is sum of matrix elements");

    }

    public static double calculate(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }

    public static double calculate(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }

}
