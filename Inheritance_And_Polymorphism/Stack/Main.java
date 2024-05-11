package Inheritance_And_Polymorphism.Stack;

import java.util.ArrayList;

/*
    This is a program that demonstrates how a Stack works using two Objects of the MyStack class.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates two MyStack Objects.
        MyStack<Integer> myStack1 = new MyStack<>();  // Stores Integers.
        MyStack<String> myStack2 = new MyStack<>();  // Stores Strings.

        // Adds 5 integers to the Integer Stack.
        myStack1.push(1);
        myStack1.push(2);
        myStack1.push(3);
        myStack1.push(4);
        myStack1.push(5);

        // Displays if the Integer Stack is empty or not.
        System.out.println("\nIs the Integer Stack empty? " + myStack1.isEmpty());

        // Adds 5 Strings to the String Stack;
        myStack2.push("Bread");
        myStack2.push("Roast Beef");
        myStack2.push("Chicken Cutlets");
        myStack2.push("Mac and Cheese");
        myStack2.push("Roasted Sausage");

        // Displays if the String Stack is empty or not.
        System.out.println("\nIs the String Stack empty? " + myStack2.isEmpty());

        // Displays the elements at the top of the Integer and the String Stack.
        System.out.println("\nElement at the top of the Integer Stack: " + myStack1.peek());
        System.out.println("\nElement at the top of the String Stack: " + myStack2.peek());

        // Pops all elements in the Integer Stack.
        System.out.println("\nPopping all Elements in the Integer Stack...");
        while (!myStack1.isEmpty())
        {
            System.out.println(myStack1.pop());
        }
        System.out.println("\nIs the Integer Stack empty? " + myStack1.isEmpty());

        // Pops all elements in the String Stack.
        System.out.println("\nPopping all Elements in the String Stack...");
        while (!myStack2.isEmpty())
        {
            System.out.println(myStack2.pop());
        }
        System.out.println("\nIs the String Stack empty? " + myStack2.isEmpty());
    }
}
