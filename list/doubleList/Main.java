package com.company.list.doubleList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> myDouble = new DoubleLinkedList<>();
        myDouble.add(15);
        myDouble.add(16);
        myDouble.add(17);
        myDouble.add(18);
        myDouble.add(19);
        myDouble.remove(3);
        myDouble.remove(Integer.valueOf(16));
        if(myDouble.contains(19)){
            System.out.println(myDouble);
        }

    }
}
