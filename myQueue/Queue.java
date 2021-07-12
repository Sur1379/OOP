package com.company.myQueue;

public interface Queue<T> {
    void addFirst(T obj);

    void addLast(T obj);

    T removeFirst();

    T removeLast();

    T getFirst();

    T getLast();
}
