package com.durai.ds.stack;

public interface DStack<T> {

    void push(T element);

    T pop();

    T peek();

    T get(T element);

    int search(T element);

    int size();

}
