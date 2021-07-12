package com.company.set.hashMap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("AA", 15),
                new Student("xx", 26),
                new Student("dd", 12)};
        Student.sortByAge(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }
}
