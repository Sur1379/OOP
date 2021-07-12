package com.company.list.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class MyArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        ArrayList arrayList1 = (ArrayList) arrayList.clone();
        System.out.println(arrayList);

        reverse(arrayList);
        System.out.println(arrayList);

        System.out.println(joinArrays(arrayList1, arrayList));

        swap(arrayList, 1, 0);
        System.out.println(arrayList);

        compareTo(arrayList, arrayList);

        ArrayList<Integer> cloneArray = cloneList(arrayList);

        trimCapacity(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>(arrayList1);
        LinkedList<Integer> linkedList1 = new LinkedList<>(linkedList);
        System.out.println("Linked list - " + linkedList);
        System.out.println("First - " + linkedList.getFirst() + " Last - " + linkedList.getLast());
        System.out.println(getFirstAndLast(linkedList));

//        removeAllElements(linkedList);
//        System.out.println(linkedList);

        swapLinkedElements(linkedList, 1, 4);
        System.out.println(linkedList);

        System.out.println("join linked lists - " + joinLinkedLists(linkedList, linkedList1));

        System.out.println("Converted to array - " + convertToArraylist(linkedList));

        System.out.println(compareLinkedLists(linkedList, linkedList1));

//        replace(linkedList, 0, 5);
//        System.out.println("replaced list - "+ linkedList);

        System.out.println(calculateSum(1, 10000));

        int[] array = {2, 3, 2, 2, 3, 4, 1, 4};
        duplicates(array);

        int[] arr = { 2, 3, 4, -2, 6, 8, 9, 11 };
        Arrays.sort(arr);
        pairedElements(arr, 6);
    }

    private static <T> void reverse(ArrayList<T> arrayList) {
        int j = arrayList.size() - 1;
        for (int i = 0; i < arrayList.size() / 2; i++) {
            swap(arrayList, i, j);
            j--;
        }
    }

    private static <T> boolean compareTo(ArrayList<T> arrayList, ArrayList<T> arrayList1) {
        return arrayList.equals(arrayList1);
    }

    private static <T> void swap(ArrayList<T> arrayList, int i, int j) {
        T temp = arrayList.get(i);
        arrayList.set(i, arrayList.get(j));
        arrayList.set(j, temp);
    }

    private static <T> ArrayList<T> joinArrays(ArrayList<T> arrayList1, ArrayList<T> arrayList2) {
        ArrayList<T> arrayList = new ArrayList<>(arrayList2);
        arrayList.addAll(arrayList1);
        return arrayList;
    }

    private static <T> ArrayList<T> cloneList(ArrayList<T> arrayList) {
        return (ArrayList<T>) arrayList.clone();
    }

    private static <T> void trimCapacity(ArrayList<T> arrayList) {
        arrayList.trimToSize();
    }

    private static <T> ArrayList<T> getFirstAndLast(LinkedList<T> list) {
        ArrayList<T> arrayList = new ArrayList<>();
        Iterator<T> iterator = list.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            T temp = iterator.next();
            if (count == 0 || count == list.size() - 1) {
                arrayList.add(temp);
            }
            count++;
        }
        return arrayList;
    }

    private static <T> void removeAllElements(LinkedList<T> list) {
        LinkedList<T> clone = (LinkedList<T>) list.clone();
        for (T t : clone) {
            list.remove();
        }
    }

    private static <T> void swapLinkedElements(LinkedList<T> list, T element1, T element2) {
        int i1 = list.indexOf(element1);
        int i2 = list.indexOf(element2);
        list.remove(i1);
        list.add(i1, element2);
        list.remove(i2);
        list.add(i2, element1);
    }

    private static <T> LinkedList<T> joinLinkedLists(LinkedList<T> list1, LinkedList<T> list2) {
        LinkedList<T> list = new LinkedList<>(list2);
        list.addAll(list1);
        return list;
    }

    private static <T> LinkedList<T> cloneLinkedList(LinkedList<T> list) {
        return (LinkedList<T>) list.clone();
    }

    private static <T> ArrayList<T> convertToArraylist(LinkedList<T> list) {
        Iterator<T> iterator = list.iterator();
        ArrayList<T> arrayList = new ArrayList<>();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        return arrayList;
    }

    private static <T> boolean compareLinkedLists(LinkedList<T> linkedList1, LinkedList<T> linkedList2) {
        Iterator<T> iterator1 = linkedList1.iterator();
        Iterator<T> iterator2 = linkedList2.iterator();
        if (linkedList1.size() == linkedList2.size()) {
            while (iterator1.hasNext()) {
                if (!iterator1.next().equals(iterator2.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static <T> void replace(LinkedList<T> list, int index, T element) {
        list.remove(index);
        list.add(index, element);
    }

    private static int calculateSum(int first, int last) {
        int count = Math.abs(last - first) + 1;
        return (count * (first + last)) / 2;
    }

    private static void hasDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = Math.abs(array[i]);
            if (array[index] < 0) {
                System.out.println("Array has duplicates : " + index);
            } else {
                array[index] = -array[index];
            }
        }
    }

    private static void pairedElements(int arr[], int sum)
    {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            if (arr[low] + arr[high] == sum) {
                System.out.println("The pair is : ("
                        + arr[low] + ", " + arr[high] + ")");
            }
            if (arr[low] + arr[high] > sum) {
                high--;
            }
            else {
                low++;
            }
        }
    }

    private static void duplicates(int[] array) {
        int size = array.length;
        int[] other = new int[size];
        for (int i = 0; i < size; i++) {
            other[i] = -1;
        }
        int count = 1;
        for (int i = 0; i < size; i++) {
            if (other[i] != 0) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        other[j] = 0;
                    }
                }
                other[i] = count;
                if (other[i] > 1) {
                    System.out.print(array[i] + " ");
                }
            }
            count = 1;
        }
        System.out.println();
    }

}
