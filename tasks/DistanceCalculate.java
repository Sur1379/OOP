package com.company.tasks;

public class DistanceCalculate {
    public static void main(String[] args) {
        System.out.println(calculateDistance(3,4));
        System.out.println(calculateDistance(3,4, 8, 7));
    }
    public static double calculateDistance( int x, int y){
        double distance = Math.sqrt(x * x + y * y);
        return distance;
    }
    public static double calculateDistance( int x1, int y1, int x2, int y2){
              double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
              return distance;
    }

}
