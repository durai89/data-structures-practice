package com.durai.data_structure.stack;

public interface DStack<T> {

    void push(T element);

    T pop();

    T peek();

    T get(T element);

    int indexOf(T element);

    boolean contains(T element);

    int size();

}
