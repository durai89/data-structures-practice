package com.durai.ds.List;

public class SingleLinkedList<T> implements List<T> {

    private Node<T> node;
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    @Override
    public void add(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Null data can't be inserted into list");
        }
        node = new Node();
        node.setData(data);
        node.setNextNode(null);
        if (tail != null) {
            tail.setNextNode(node);
        } else {
            head = node;
        }
        tail = node;
        size++;
    }

    public void add(T data, int index) {
        if (index > size) {
            throw new IllegalArgumentException("Specified insert position exceeds the size of the list");
        }
        node = new Node<>();
        node.setData(data);
        if (size == index) {
            tail.setNextNode(node);
            node.setNextNode(null);
        } else {
            Node nodeAtIndex = getNthNode(index - 1);
            Node nextNodeFromIndex = nodeAtIndex.getNextNode();
            nodeAtIndex.setNextNode(node);
            node.setNextNode(nextNodeFromIndex);
        }
        size++;
    }

    @Override
    public T remove() {
        if (head == null) {
            throw new IllegalStateException("Invalid remove operation - Linked list is empty ");
        }
        Node<T> removedNode = head;
        head = head.getNextNode();
        size--;
        return removedNode.getData();
    }

    @Override
    public T remove(T data) {
        if (head == null) {
            throw new IllegalStateException("Invalid remove operation - Linked list is empty ");
        }
        Node<T> tempNode = head;
        Node<T> prevNode = head;
        while (tempNode.getData() != data) {
            prevNode = tempNode;
            tempNode = tempNode.getNextNode();
        }
        prevNode.setNextNode(tempNode.getNextNode());
        size--;
        return tempNode.getData();
    }

    @Override
    public T get(int index) {
        return (T) getNthNode(index).getData();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T data) {
        Node<T> tempNode = head;
        for (int i = 0; i <= size(); i++) {
            if (tempNode.getData() == data) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T data) {
        if (head == node) {
            throw new IllegalStateException("Invalid remove operation - Linked list is empty ");
        }
        int index = 0;
        Node<T> tempNode = head;
        while (tempNode.getData() != data) {
            index++;
        }
        return index;
    }

    @Override
    public void reverse() {
        Node currentNode = head;
        tail = currentNode;
        Node previousNode = null;
        while (currentNode != null) {
            Node nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode;
    }

    private Node getNthNode(int index) {
        if (index > size) {
            throw new IllegalArgumentException("Invalid operation - The index exceeds the size of the list");
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNextNode();
        }
        return node;
    }
}