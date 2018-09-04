package com.durai.data_structure.stack;

import java.util.Arrays;

public class DynamicArrayBackedStack<T> implements DStack<T> {

    private T[] data;
    private int stackPointer;
    private int capacityIncrementCount;

    public DynamicArrayBackedStack() {
        this(10, 10);
    }

    public DynamicArrayBackedStack(int initialCapacity) {
        this(initialCapacity, 10);
    }

    public DynamicArrayBackedStack(int initialCapacity, int capacityIncrementCount) {
        this.data = (T[]) new Object[initialCapacity];
        this.stackPointer = -1;
        this.capacityIncrementCount = capacityIncrementCount;
    }

    @Override
    public void push(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Invalid insert operation - element is null");
        }
        if (stackPointer > data.length) {
            Arrays.copyOf(data, capacityIncrementCount);
        }
        data[++stackPointer] = element;
    }

    @Override
    public T pop() {
        if (size() == 0) {
            throw new IllegalStateException("Illegal operation - popping element from empty stack");
        }
        T element = data[stackPointer];
        data[stackPointer] = null; // Leave it to java's garbage collection
        stackPointer--;
        return element;
    }

    @Override
    public T peek() {
        if (size() == 0) {
            throw new IllegalStateException("Illegal operation - peek access on a empty stack");
        }
        return data[stackPointer];
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
        for (int i = 0; i < size(); i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) >= 0 ? true : false;
    }

    @Override
    public int size() {
        return stackPointer + 1;
    }

}