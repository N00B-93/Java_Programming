package Inheritance_And_Polymorphism.Stack;

import java.util.ArrayList;

public class MyStack<E> extends ArrayList<E>
{
    // No-arg Constructor.
    public MyStack(){}

    /**
     * Removes and returns the element at the top of the Stack.
     *
     * @return The element at the top of the Stack.
     */
    public E pop()
    {
        E element = this.get(this.size() - 1);
        this.remove(element);
        return element ;
    }

    /**
     * Adds an element to the top of the Stack.
     *
     * @param element The element to be added to the top of the Stack.
     */
    public void push(E element)
    {
        this.add(element);
    }

    /**
     * This returns the element at the top of the Stack without removing it.
     *
     * @return The element at the top of the Stack.
     */
    public E peek()
    {
        return this.get(this.size() - 1);
    }

    /**
     * Checks whether the Stack is empty or not.
     *
     * @return true if the Stack is empty, else false.
     */
    public boolean isEmpty()
    {
        return this.size() == 0;
    }
}
