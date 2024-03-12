package Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    This is a program that prompts the user to enter two non-negative integers greater than 0 and determines their
    greatest common divisor(GCD) using recursion.
 */

public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Initializes two numbers.
        int number1 = 0, number2 = 0;

        // Loop keeps running till user enters two positive integers greater than 0.
        while (number1 <= 0 || number2 <= 0)
        {
            try
            {
                // Prompts the user to enter two integer whose GCD is to be determined.
                System.out.printf("\nEnter two positive integers > 0 separated by space: ");
                number1 = keyBoard.nextInt();
                number2 = keyBoard.nextInt();

                // Throws an IllegalArgumentException if either of the number entered by the user is 0.
                if (number1 == 0 || number2 == 0)
                    throw new IllegalArgumentException();
            }
            // Handles the case when a user doesn't enter an integer.
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("\nUse only positive integers > 0!!!");
                keyBoard.nextLine();
            }
            // Handles the case when either of the user input is 0.
            catch (IllegalArgumentException illegalArgumentException)
            {
                System.out.println("\nUse numbers > 0 only!!!");
            }
        }

        // Determines and displays the GCD if the second number is greater than the first.
        if (number2 > number1)
        {
            int greatestCommonDivisor = getGreatestCommonDivisor(number2, number1);
            System.out.printf("\nThe Greatest Common Divisor of %d and %d is: %d\n", number1, number2, greatestCommonDivisor);
        }
        else
        {
            // Determines and displays the GCD if the first number is greater than the second.
            int greatestCommonDivisor = getGreatestCommonDivisor(number1, number2);
            System.out.printf("\nThe Greatest Common Divisor of %d and %d is: %d\n", number1, number2, greatestCommonDivisor);
        }
    }

    /**
     * This returns the greatest common divisor of two positive integers.
     *
     * @param number1 The first integer.
     * @param number2 tThe second integer.
     * @return The greatest common divisor.
     */
    public static int getGreatestCommonDivisor(int number1, int number2)
    {
        if (number1 % number2 == 0)
            return number2;
        return getGreatestCommonDivisor(number2, number1 % number2);
    }
}
