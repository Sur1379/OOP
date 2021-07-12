package com.company.list.doubleList;

public class DoubleLinkedList<T> implements ListMethods<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> current;
        if (index < size / 2) {
            current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = last;
            for (int i = 0; i < size - 1 - index; i++) {
                current = current.previous;
            }
        }
        return current.value;
    }

    @Override
    public void add(T obj) {
        Node<T> node = new Node<T>(obj);
        if (size == 0) {
            first = node;
            last = node;
            size++;
            return;
        }
        last.next = node;
        last.next.previous = last;
        last = last.next;
        size++;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            first = first.next;
            first.previous = null;
            size--;
            return;
        }
        if (index == size - 1) {
            last = last.previous;
            last.next = null;
            size--;
            return;
        }
        Node<T> current;
        if (index < size / 2) {
            current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            current.next.previous = current;
        } else {
            current = last;
            for (int i = 0; i < size - 2 - index; i++) {
                current = current.previous;
            }
            current.previous = current.previous.previous;
            current.previous.next = current;
        }
        size--;
    }

    @Override
    public boolean remove(T obj) {
        if (isEqual(first.value, obj)) {
            first = first.next;
            first.previous = null;
            size--;
            return true;
        }
        Node<T> current = first;
        for (int i = 0; i < size - 1; i++) {
            if (isEqual(current.next.value, obj)) {
                if (i == size - 2) {
                    current.next = null;
                    last = current;
                } else {
                    current.next = current.next.next;
                    current.next.previous = current;
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T obj) {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            if(isEqual(current.value, obj)){
                return true;
            }
            current = current.next;
        }
        return false;
    }


    @Override
    public void checkIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("index must be >= 0");
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean isEqual(Object obj1, Object obj2) {
        if(obj1 == null && obj2 == null){
            return true;
        }
        return obj1 != null && obj1.equals(obj2);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            if(i == size - 1){
                stringBuilder.append(current.value);
            }
            else {
                stringBuilder.append(current.value + ",");
            }
            current = current.next;
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
