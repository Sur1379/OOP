package com.company.set.hashMap;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Student[] sortByAge(Student[] students){
        int count;
        do {
            count = 0;
            for (int i = 0; i < students.length - 1; i++) {
                if (students[i].age > students[i + 1].age) {
                    Student temp = students[i + 1];
                    students[i + 1] = students[i];
                    students[i] = temp;
                    count++;
                }
            }
        } while (count > 0);
        return students;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = " + name +
                ", age = " + age +
                "}";
    }
}
