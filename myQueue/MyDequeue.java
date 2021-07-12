package com.company.myQueue;

import java.util.LinkedList;
import java.util.List;

public class MyDequeue<T> extends MyQueue<T> implements Queue<T> {
    private List<T> list = new LinkedList();

    @Override
    public T push(T obj) {
        return super.push(obj);
    }

    @Override
    public T pop() {
        return super.pop();
    }

    @Override
    public T peek() {
        return super.peek();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public void addFirst(T obj) {
        list.add(0, obj );
    }

    @Override
    public void addLast(T obj) {
        list.add(obj);
    }

    @Override
    public T removeFirst() {
        return list.remove(0);
    }

    @Override
    public T removeLast() {
        return list.remove(list.size() - 1);
    }

    @Override
    public T getFirst() {
        return list.get(0);
    }

    @Override
    public T getLast() {
        return list.get(list.size() - 1);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            if(i != list.size() - 1){
                stringBuilder.append(list.get(i) + ",");
            }
            else {
                stringBuilder.append(list.get(i) + "]");
            }
        }
        return stringBuilder.toString();
    }
}
