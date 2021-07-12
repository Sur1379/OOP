package com.company.set.hashSet;

import java.util.*;

public class MyHashSet {


    public static <T> int countElements(Set<T> mySet) {
        Iterator<T> iterator = mySet.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }
        return count;
    }

    public static <T> boolean isEmpty(Set<T> mySet) {
        return countElements(mySet) == 0;
    }

    public static <T> Set<T> cloneTo(Set<T> mySet1, Set<T> mySet2) {
        mySet2.addAll(mySet1);
        return mySet2;
    }

    public static <T> TreeSet<T> convertToTreeSet(Set<T> mySet) {
        return new TreeSet<>(mySet);
    }

    public static <T> ArrayList<T> convertToArraylist(Set<T> mySet) {
        return new ArrayList(mySet);
    }

    public static <T> boolean compareSets(Set<T> mySet1, Set<T> mySet2) {
        if (countElements(mySet1) == countElements(mySet2)) {
            Iterator<T> iterator1 = mySet1.iterator();
            Iterator<T> iterator2 = mySet2.iterator();
            while (iterator1.hasNext()) {
                if (!isEqual(iterator1.next(), iterator2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static <T> void clearAllElements(Set<T> mySet) {
        Iterator<T> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static <T> void iterateSet(Set<T> myTreeSet) {
        Iterator<T> iterator = myTreeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static <T> void printFirstLast(Set<T> myTreeSet) {
        Iterator<T> iterator = myTreeSet.iterator();
        int count = 1;
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (count == 1 || count == myTreeSet.size()) {
                System.out.print(t + " ");
            }
            count++;
        }
        System.out.println();

    }

    public static void findLessThan7(Set<Integer> myTreeSet) {
        Iterator<Integer> iterator = myTreeSet.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (t < 7) {
                System.out.print(t + " ");
            }
        }
        System.out.println();
    }

    public static <T> void findGreaterThan(Set<T> myTreeSet, T element) {
        Iterator<T> iterator = myTreeSet.iterator();
        T t = null;
        while (iterator.hasNext()) {
            t = iterator.next();
            if (isEqual(t, element)) {
                break;
            }
        }
        System.out.print(t + " ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static <T> void removeElement(Set<T> myTreeSet, T element) {
        Iterator<T> iterator = myTreeSet.iterator();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (isEqual(t, element)) {
                myTreeSet.remove(t);
                return;
            }
        }
    }

    public static <T> void iteratePriorityQueue(PriorityQueue<T> myPriorityQueue) {
        Iterator<T> iterator = myPriorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static <T> boolean comparePriorityQueues(PriorityQueue<T> myPriorityQueue1, PriorityQueue<T> myPriorityQueue2) {
        if (myPriorityQueue1.size() == myPriorityQueue2.size()) {
            Iterator<T> iterator1 = myPriorityQueue1.iterator();
            Iterator<T> iterator2 = myPriorityQueue2.iterator();
            while (iterator1.hasNext()) {
                if (!isEqual(iterator1.next(), iterator2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static <T> boolean isEqual(T obj1, T obj2) {
        if (obj1 == null && obj2 == null) {
            return true;
        }
        return obj1 != null && obj1.equals(obj2);
    }

}

