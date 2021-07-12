package com.company.myQueue;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack<T> {
    private List<T> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public T push(T obj) {
        list.add(obj);
        return obj;
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T element = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return element;
    }

    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }
    public boolean isEmpty(){
            return list.size() == 0;
    }
}
