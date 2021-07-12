package com.company.myQueue;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class MyQueue<T>  {
    private List<T> list = new LinkedList();

    public T push(T obj) {
        list.add(obj);
        return obj;
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.remove(0);
    }

    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.get(0);
    }
    public boolean isEmpty(){
        return list.size() == 0;
    }


}
