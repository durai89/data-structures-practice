package com.durai.ds.List;

public class DLinkedList<T> implements DList<T> {

    private Node<T> node;
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int nodeCount;

    public DLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.nodeCount = 0;
    }

    @Override
    public void add(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Invalid data - null argument can't be inserted into list");
        }
        node = new Node();
        node.setData(data);
        node.setNextNode(null);
        if (lastNode != null) {
            //Link previous node to the current node
            lastNode.setNextNode(node);
        } else {
            //Indicates it's the first node in the list
            firstNode = node;
        }
        lastNode = node;
        nodeCount++;
    }

    @Override
    public T remove() {
        if (firstNode == null) {
            throw new IllegalStateException("Invalid remove operation - Linked list is empty ");
        }
        Node<T> removedNode = firstNode;
        firstNode = firstNode.getNextNode();
        nodeCount--;
        return removedNode.getData();
    }

    @Override
    public T remove(T data) {
        if (firstNode == null) {
            throw new IllegalStateException("Invalid remove operation - Linked list is empty ");
        }
        Node<T> tempNode = firstNode;
        Node<T> prevNode = firstNode;
        while (tempNode.getData() != data) {
            prevNode = tempNode;
            tempNode = tempNode.nextNode;
        }
        prevNode.setNextNode(tempNode.getNextNode());
        nodeCount--;
        return tempNode.getData();
    }

    @Override
    public T get(int index) {
        if (index > nodeCount) {
            throw new IllegalArgumentException("Invalid operation - The index exceeds the size of the list");
        }
        Node<T> tempNode = firstNode;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.getNextNode();
        }
        return tempNode.getData();
    }

    @Override
    public int size() {
        return nodeCount;
    }

    @Override
    public boolean contains(T data) {
        Node<T> tempNode = firstNode;
        for (int i = 0; i <= size(); i++) {
            if (tempNode.getData() == data) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T data) {
        if (firstNode == node) {
            throw new IllegalStateException("Invalid remove operation - Linked list is empty ");
        }
        int index = 0;
        Node<T> tempNode = firstNode;
        while (tempNode.getData() != data) {
            index++;
        }
        return index;
    }

    private class Node<T> {
        private T data;
        private Node<T> nextNode;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<T> nextNode) {
            this.nextNode = nextNode;
        }
    }

}