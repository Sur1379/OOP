package com.company.list.doubleList;

public interface ListMethods<T> {
    T get(int index);

    void add(T obj);

    void remove(int index);

    boolean remove(T obj);

    int size();

    boolean contains(T obj);

    void checkIndex(int index);

    boolean isEqual(T obj1, T obj2);
}
