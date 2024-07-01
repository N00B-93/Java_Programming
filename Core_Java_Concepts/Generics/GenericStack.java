package Core_Java_Concepts.Generics;

import java.util.ArrayList;
import java.util.Scanner;

/*
    This is a program that creates a stack of generic Objects named GenericStack which extends the ArrayList class.
    The user is then prompted to enter five Strings and the Strings are then displayed in reverse.
 */

/**
 * The type Generic stack which represents stack of generic Objects.
 *
 * @param <E> the type parameter
 */
public class GenericStack<E> extends ArrayList<E>
{
    /**
     * Un-parameterized constructor that instantiates a new Generic stack.
     */
    public GenericStack(){}

    /**
     * This returns the element at the top of the stack.
     *
     * @return Element at the top of the stack.
     */
    public E peek()
    {
        return this.get(this.getSize() - 1);
    }

    /**
     *Returns the number of elements in the stack.
     *
     * @return The number of elements in the stack.
     */
    public int getSize()
    {
        return this.size();
    }

    /**
     * Add an element to the top of the stack.
     *
     * @param e The element to be added.
     */
    public void push(E e)
    {
        this.add(e);
    }

    /**
     * Removes the element at the top of the stack.
     *
     * @return The element removed.
     */
    public E pop()
    {
        return this.remove(this.getSize() - 1);
    }

    /**
     * Checks if the stack is empty or not.
     *
     * @return true if the stack is empty and false if the stack is not empty.
     */
    @Override
    public boolean isEmpty()
    {
        return super.isEmpty();
    }

    public static void main(String[] args)
    {
        // Creates a GenericStack Object.
        GenericStack<String> stack1 = new GenericStack<>();

        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in five strings.
        for (int i = 0; i < 5; i++)
        {
            System.out.printf("\nEnter Element %d: ", i + 1);
            stack1.push(input.nextLine());
        }
        // Displays the element at the top of the stack.
        System.out.printf("\nElement at the top of the stack: %s\n", stack1.peek());

        // Displays the String in reversed order.
        System.out.println("\nThe Members of the stack displayed in reversed order are: ");
        while (!stack1.isEmpty())
        {
            System.out.println(stack1.pop());
        }
    }
}
