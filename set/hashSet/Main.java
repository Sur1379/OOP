package com.company.set.hashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet();
        Set<Integer> mySet1 = new HashSet();
        mySet.add(15);
        mySet.add(16);
        mySet.add(17);
        mySet1.add(25);
        mySet1.add(26);
        mySet1.add(27);
//        mySet.add("Aa");
//        mySet1.add("BB");
        System.out.println(mySet.hashCode());
        System.out.println(mySet1.hashCode());
        System.out.println(MyHashSet.countElements(mySet));
        System.out.println(mySet.toString());
        System.out.println(mySet1.toString());

//        System.out.println(MyHashSet.cloneTo(mySet, mySet1));
//        System.out.println(MyHashSet.cloneTo(mySet1, mySet));

//        TreeSet<Integer> treeSet = MyHashSet.convertToTreeSet(mySet);
//        System.out.println(treeSet);

//        List<Integer> arraylist = MyHashSet.convertToArraylist(mySet1);
//        System.out.println(arraylist);

//        if (MyHashSet.compareSets(mySet, mySet1)) {
//            System.out.println("YES");
//        }

//        MyHashSet.clearAllElements(mySet);
//        System.out.println(mySet);

        Set<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(5);
        myTreeSet.add(2);
        myTreeSet.add(9);
        myTreeSet.add(4);
        myTreeSet.add(7);
        Set<Integer> myTreeSet1 = new TreeSet<>();
        myTreeSet1.add(12);
        myTreeSet1.add(15);
        myTreeSet1.add(17);
        myTreeSet1.add(11);
        myTreeSet1.add(10);

        MyHashSet.iterateSet(myTreeSet);

        MyHashSet.printFirstLast(myTreeSet);

        MyHashSet.cloneTo(myTreeSet1, myTreeSet);
        MyHashSet.iterateSet(myTreeSet);

        MyHashSet.findLessThan7(myTreeSet);

        MyHashSet.findGreaterThan(myTreeSet, 5);

        MyHashSet.removeElement(myTreeSet, 10);
        MyHashSet.iterateSet(myTreeSet);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(49);
        priorityQueue.add(46);
        priorityQueue.add(47);
        priorityQueue.add(48);

        MyHashSet.iteratePriorityQueue(priorityQueue);
    }

}
