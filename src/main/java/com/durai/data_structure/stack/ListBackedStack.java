package com.durai.data_structure.stack;

import java.util.LinkedList;
import java.util.List;

/*
    Java Stack Data Structure implementation - Backed by linked list
*/
public class ListBackedStack<T> implements DStack<T> {

    private final List<T> data;

    public ListBackedStack() {
        this.data = new LinkedList<>();
    }

    @Override
    public void push(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Invalid insert operation - element is null");
        }
        data.add(element);
    }

    @Override
    public T pop() {
        if (size() == 0) {
            throw new IllegalStateException("Illegal operation - popping element from empty stack");
        }
        return data.remove(size() - 1);
    }

    @Override
    public T peek() {
        if (size() == 0) {
            throw new IllegalStateException("Illegal operation - peek access on a empty stack");
        }
        return data.get(size()-1);
    }

    @Override
    public T get(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Invalid argument-Search argument is null");
        }

        int index = indexOf(element);

        if (index < 0) {
            throw new IllegalStateException("Element is not present in the stack");
        }

        for (int i = 0; i < index; i++) {
            this.pop();
        }

        return this.pop();

    }

    @Override
    public int indexOf(T element) {
        return data.indexOf(element);
    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) >= 0 ? true : false;
    }

    @Override
    public int size() {
        return data.size();
    }

}