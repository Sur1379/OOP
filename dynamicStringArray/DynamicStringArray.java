package com.company.dynamicStringArray;

import java.util.Arrays;

public class DynamicStringArray {
    private String[] array;
    private int lastIndex;
    private int size;

    public DynamicStringArray() {
        array = new String[5];
        lastIndex = array.length - 1;
        size = 0;
    }

    @Override
    public String toString() {
        return "DynamicStringArray{" +
                "array = " + Arrays.toString(array) +
                '}';
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    int size() {
        return size;
    }

    void dsqAdd(String input) {
        if (size == array.length) {
            String[] expandedArray = new String[size + 1];
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

    int indexOf(String input) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(input)) {
                return i;
            }
        }
        return -1;
    }

    int lastIndexOf(String input) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(input)) {
                return i;
            }
        }
        return -1;
    }

    int contains(String input) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(input)) {
                count++;
            }
        }
        return count;
    }

    void sort(int start, int end) {
        for (int i = 0; i <= end; i++) {
            String min = array[i];
            while (i > 0 && array[i - 1].compareTo(array[i]) > 0) {
                array[i] = array[i - 1];
                array[i - 1] = min;
                i--;
            }
        }
    }

    void swap(int index1, int index2) {
        if (index1 >= 0 && index1 < size && index2 >= 0 && index2 < size) {
            String s = array[index1];
            array[index1] = array[index2];
            array[index2] = s;
        } else {
            System.out.println("Invalid index`s");
        }
    }

    void remove(int index) {
        String[] remover = new String[lastIndex];
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

    void remove(String input) {
        String[] remover = new String[lastIndex];
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

    void removeAll(String[] inputArray) {
        int count = 0;
        for (int i = 0; i < lastIndex; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if(array[i] == null){
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
        if (count > 0){
            String[] s = new String[size - count];
            for (int i = 0; i < s.length; i++) {
                s[i] = array[i];
            }
            size = s.length;
            lastIndex = size - 1;
            array = s;
        }
    }
}



