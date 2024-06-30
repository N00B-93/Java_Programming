package Core_Java_Concepts.Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    This is a program that prompts the user to enter a positive integer and then determine the sum of all digits in
    the integer using a recursive function with the header;
                    public static int sumOfDigits(long integer)
 */

public class SumOfDigitsInInteger
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        while (true)
        {
            try
            {
                // Prompts the user to enter a positive integer.
                System.out.printf("\nEnter a positive integer: ");
                long integer = input.nextLong();

                // Prompts the user to enter a positive integer if the user input is > 0.
                if (0 > integer)
                {
                    System.out.printf("\nInvalid input, use positive integers only.");
                    continue;
                }

                // Display the sum of digits.
                System.out.printf("\nThe sum of digits in %d is: %d\n", integer, sumOfDigits(integer));
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("\nInvalid input, use positive integers only.");
                input.nextLine();
            }
        }
    }

    /**
     * This returns the sum of digits in a positive integer using recursion.
     * @param integer The number whose sum of digits is to be determined.
     * @return The sum of digits in the integer.
     */
    public static int sumOfDigits(long integer)
    {
        if (integer == 0)
            return 0;
        else
        {
            long remainder = integer % 10;
            return (int) remainder + sumOfDigits(Math.floorDiv(integer, 10));
        }
    }
}
