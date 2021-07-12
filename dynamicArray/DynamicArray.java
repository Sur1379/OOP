package com.company.dynamicArray;

public class DynamicArray<T> {
    private T[] array;
    private int size;
    private int lastIndex;

    public DynamicArray() {
        array = (T[]) new Object[5];
        size = 0;
        lastIndex = array.length - 1;
    }

    void dsqAdd(T input) {
        if (size == array.length) {
            T[] expandedArray = (T[]) new Object[size + 1];
            System.arraycopy(array, 0, expandedArray, 0, size);
            array = expandedArray;
            lastIndex++;
        }
        array[size] = input;
        size++;
    }

    void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    int size() {
        return size;
    }

    int indexOf(T input) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(input)) {
                return i;
            }
        }
        return -1;
    }

    int lastIndexOf(T input) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(input)) {
                return i;
            }
        }
        return -1;
    }

    int contains(T input) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(input)) {
                count++;
            }
        }
        return count;
    }

    void swap(int index1, int index2) {
        if (index1 >= 0 && index1 < size && index2 >= 0 && index2 < size) {
            T s = array[index1];
            array[index1] = array[index2];
            array[index2] = s;
        } else {
            System.out.println("Invalid index`s");
        }
    }

    void remove(int index) {
        T[] remover = (T[]) new String[lastIndex];
        int count = 0;
        for (int i = 0; i < lastIndex; i++) {
            if (i == index) {
                count++;
            }
            if (count == 1) {
                remover[i] = array[i + 1];
            } else {
                remover[i] = array[i];
            }
        }
        if (count > 0) {
            size--;
            lastIndex--;
        }
        array = remover;
    }

    void remove(T input) {
        T[] remover = (T[]) new String[lastIndex];
        int count = 0;
        for (int i = 0; i < lastIndex; i++) {
            if (array[i].equals(input)) {
                count++;
            }
            if (count > 0) {
                remover[i] = array[i + 1];
            } else {
                remover[i] = array[i];
            }
        }
        if (count > 0) {
            size--;
            lastIndex--;
        }
        array = remover;
    }

    void removeAll(T[] inputArray) {
        int count = 0;
        for (int i = 0; i < lastIndex; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (array[i] == null) {
                    i = lastIndex;
                    break;
                }
                if (array[i].equals(inputArray[j])) {
                    int k = i;
                    while (i < lastIndex) {
                        array[i] = array[i + 1];
                        i++;
                    }
                    array[lastIndex] = null;
                    i = k - 1;
                    count++;
                    break;
                }
            }
        }
        if (count > 0) {
            T[] s = (T[])new String[size - count];
            for (int i = 0; i < s.length; i++) {
                s[i] = array[i];
            }
            size = s.length;
            lastIndex = size - 1;
            array = s;
        }
    }
}
