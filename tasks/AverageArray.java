package com.company.tasks;

import java.util.Arrays;
import java.util.Random;

public class AverageArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
        }
        System.out.println(Arrays.toString(calculatAve(matrix)));

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9) + 1;
        }
        System.out.println(Arrays.toString(calculateAve(array)));

    }

    public static int[] calculatAve(int[][] matrix) {
        int[] array = new int[matrix.length];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
            array[i] = sum / matrix.length;
        }
        return array;
    }

    public static int[] calculateAve(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
        return array;
    }
}
