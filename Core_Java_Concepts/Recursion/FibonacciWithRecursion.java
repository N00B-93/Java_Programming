package Core_Java_Concepts.Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    This is a program that prompts the user to enter an index and then displays the fibonacci number that corresponds
    to that index and also displays the number of recursive calls it took to calculate the fibonacci number at the index
    entered by the user.
 */

public class FibonacciWithRecursion
{
    // Initializes a static variable used to hold the number of recursive calls made.
    public static int numberOfCalls = 0;
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);
        long index = 0;

        while (true)
        {
            try
            {
                // Prompts the user to enter a positive integer.
                System.out.printf("\nEnter a positive index: ");
                index = keyBoard.nextLong();

                // Breaks out of the loop if the index is positive.
                if (index >= 0)
                    break;
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("\nInvalid input\nEnter a positive integer.");
                keyBoard.nextLine();
            }
        }

        // Displays the Fibonacci number and the number of recursive calls.
        System.out.printf("\nThe Fibonacci number at index %d is: %d\n", index, fibonacci(index));
        System.out.printf("\nNumber or recursive calls: %d\n", numberOfCalls);
    }

    /**
     * This returns the Fibonacci number at a particular index using recursion.
     *
     * @param number The index of the Fibonacci number.
     * @return The Fibonacci number at the given index.
     */
    private static long fibonacci(long index)
    {
        numberOfCalls++;

        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}
