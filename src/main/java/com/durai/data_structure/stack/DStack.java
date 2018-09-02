package com.durai.data_structure.stack;

public interface DStack<T> {

    /*
        Pushes element to top of the stack
    */
    public void push(T element);

    /*
        Removes element from top of the stack
    */
    public T pop();

    /*
        Gets an element from the top of the stack without removing it
    */
    public T peek();

    /*
        Retrieves an element from the stack - Will remove any other elements that exists above this element in the stack(LIFO)
    */
    public T get(T element);

    /*
        Returns the index of an given element , otherwise returns -1
    */
    public int indexOf(T element);

    /*
        Checks if element exists in the stack
    */
    public boolean contains(T element);

    /*
        Returns the size of the stack
    */
    public int size();

}
