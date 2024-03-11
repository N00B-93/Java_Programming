package Recursion;

import java.math.BigInteger;
import java.util.Scanner;

/*
    This is a program that prompts the user to enter an integer, creates a BigInteger object using the number entered
    by the user and then determines the factorial of the BigInteger Object and display the result.
 */

public class Factorial
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Creates a reference to a BigInteger.
        BigInteger integer = null;

        // try-catch block that checks user input.
        while (integer == null)
        {
            try
            {
                // Prompts the user to enter a number whose factorial is to be determined.
                System.out.printf("\nEnter an Integer whose factorial is to be determined: ");
                String number = keyBoard.next();

                // Creates a BiInteger Object.
                integer = new BigInteger(number);
            }
            catch (NumberFormatException numberFormatException)
            {
                System.out.println("\nUse Integers only!");
            }
        }

        // Determines the Factorial of the BigInteger.
        BigInteger factorial = getFactorial(integer);

        // Displays the result.
        System.out.println("\nThe Factorial of " + integer + " is: " + factorial);
    }

    /**
     * The returns the factorial of a BigInteger number using recursion.
     *
     * @param integer The integer whose factorial is to be determined.
     * @return The factorial of the BigInteger.
     */
    public static BigInteger getFactorial(BigInteger integer)
    {
        if (integer.compareTo(BigInteger.ZERO) == 0 || integer.compareTo(BigInteger.ONE) == 0)
            return BigInteger.ONE;
        else return integer.multiply(getFactorial(integer.subtract(BigInteger.ONE)));
    }
}
