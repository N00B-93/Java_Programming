package Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciWithoutRecursion
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        int index = -1;

        // Continues to run till the user enters an index greater than 0.
        while (index == -1)
        {
            try
            {
                // Prompts the user to enter the index of the Fibonacci number to be displayed.
                System.out.printf("\nEnter an index > 0 for a Fibonacci number: ");
                index = keyBoard.nextInt();
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("\nInvalid Input, Use a positive integer > 0.");
                keyBoard.nextLine();
            }
        }
        // Displays the fibonacci number at the index specified by the user.
        System.out.printf("\nThe Fibonacci number at index %d is: %d\n", index, fibonacci(index));
    }

    /**
     * This returns the Fibonacci number at a particular index.
     *
     * @param number The index of the Fibonacci number.
     * @return The Fibonacci number at the given index.
     */
    public static int fibonacci(int number)
    {
        int previous = 0, current = 1, next;

        if (number <= 1)
            return number;

        for (int i = 1; i <= number; i++)
        {
            next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }
}
