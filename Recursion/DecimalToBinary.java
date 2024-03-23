package Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    This is a program that prompts the user to enter a positive integer and then displays the binary equivalent of
    the integer using a method and a recursive helper method.
 */

public class DecimalToBinary
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        while (true)
        {
            try
            {
                // Prompts the user to enter a decimal number.
                System.out.printf("\nEnter a decimal number: ");
                int decimal = input.nextInt();

                // Displays an error message and prompts the user to enter a positive integer if user input is < 0.
                if (decimal < 0) {
                    System.out.printf("\nInvalid input, Use positive integers only.");
                    continue;
                }

                // Displays the binary equivalent of the decimal number.
                System.out.printf("\nThe binary equivalent of %d is: %s\n", decimal, decimalToBinary(decimal));
                break;
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.printf("\nInvalid input, Try again.");
                input.nextLine();
            }
        }
    }

    /**
     * This returns the binary equivalent of a decimal number by making a call to a recursive helper method.
     *
     * @param decimal The decimal number to be converted to binary.
     * @return The reversed StringBuilder representation of the binary number.
     */
    public static StringBuilder decimalToBinary(int decimal)
    {
        StringBuilder binString = new StringBuilder();

        if (decimal == 0 || decimal == 1)
            return new StringBuilder(String.valueOf(decimal));
        return decimalToBinaryHelper(decimal, binString).reverse();
    }

    /**
     * Decimal to binary helper string builder.
     *
     * @param decimal The decimal number to be converted to binary.
     * @param binString StringBuilder Object holding the binary representation of  the decimal number.
     * @return The StringBuilder representation of the binary number.
     */
    public static StringBuilder decimalToBinaryHelper(int decimal, StringBuilder binString)
    {
        if (decimal > 0)
        {
            int remainder = decimal % 2;
            binString.append(remainder);
            decimal = decimal / 2;
            return decimalToBinaryHelper(decimal, binString);
        }
        else
            return binString;
    }
}
