package com.durai.ds.List;

public interface DList<T> {

    void add(T data);

    T remove();

    T remove(T data);

    T get(int index);

    int indexOf(T data);

    int size();

    boolean contains(T data);

}
