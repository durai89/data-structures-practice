package com.durai.ds.queue;

import java.util.Arrays;

public class DQueue<T> {

    private T[] data;
    private int topIndex;
    private int bottomIndex;
    private int capacityIncrementCount;

    public DQueue() {
        this(10, 10);
    }

    public DQueue(int initialCapacity, int capacityIncrementCount) {
        this.data = (T[]) new Object[initialCapacity];
        this.topIndex = -1;
        this.bottomIndex = -1;
        this.capacityIncrementCount = capacityIncrementCount;
    }

    //Push element to the top of the queue - Big O Performance - O(1)
    public void enQueue(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Invalid insert operation - element is null");
        }
        if (bottomIndex >= data.length) {
            Arrays.copyOf(data, capacityIncrementCount);
        }
        data[++bottomIndex] = element;
        if (topIndex < 0) {
            topIndex++;
        }
    }

    //Removes element from the top of the queue - Big O Performance - O(1)
    public T deQueue() {
        if (topIndex < 0) {
            throw new IllegalStateException("Illegal dequeue operation - queue is empty");
        }
        T element = data[topIndex];
        data[topIndex] = null; //Remove object reference for Java garbage collector to pick it

        if (topIndex == bottomIndex) {
            topIndex = -1;
            bottomIndex = -1;
        } else {
            topIndex++;
        }
        return element;
    }

    public T get(T element) {
        int index = indexOf(element);
        if (index < 0) {
            throw new IllegalArgumentException("Element not exists in the queue");
        }
        for (int i = 0; i < index; i++) {
            deQueue();
        }
        return deQueue();
    }

    public int indexOf(T element) {
        int indexCounter = 0;
        for (int i = topIndex; i <= bottomIndex; i++) {
            if (data[i] == element) {
                return indexCounter;
            }
            indexCounter++;
        }
        return -1;
    }

    public int size() {
        if (topIndex == -1 && bottomIndex == -1) {
            return 0;
        } else if (topIndex == bottomIndex) {
            return bottomIndex + 1;
        } else {
            return (bottomIndex - topIndex) + 1;
        }
    }
}