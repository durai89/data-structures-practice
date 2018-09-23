package com.durai.ds.list;

public interface List<T> {

    void add(T data);

    void add(T data, int index);

    //TODO : Sorted Insert

    T remove();

    T remove(T data);

    T get(int index);

    int indexOf(T data);

    int size();

    boolean isEmpty();

    boolean contains(T data);

    void reverse();

}
