package Core_Java_Concepts.Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    This is a program that prompts the user to enter a decimal number and then displays the hexadecimal equivalent of the
    decimal number using a method and a recursive helper method.
 */

public class DecimalToHexadecimal
{
    public static void main(String[] args) {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                // Prompts the user to enter a decimal number.
                System.out.printf("\nEnter a decimal number: ");
                int decimal = input.nextInt();

                // Displays an error message and prompts the user to enter a positive integer if user input is < 0.
                if (decimal < 0) {
                    System.out.printf("\nInvalid input, Use positive integers only.");
                    continue;
                }

                // Displays the hexadecimal equivalent of the decimal number.
                System.out.printf("\nThe hexadecimal equivalent of %d is: %s\n", decimal, decimalToHexadecimal(decimal));
                break;
            } catch (InputMismatchException inputMismatchException) {
                System.out.printf("\nInvalid input, Try again.");
                input.nextLine();
            }
        }
    }

    /**
     * This returns the hexadecimal equivalent of a decimal number by making a call to a recursive helper method.
     *
     * @param decimal The decimal number to be converted to hexadecimal.
     * @return The reversed StringBuilder representation of the hexadecimal equivalent.
     */
    public static StringBuilder decimalToHexadecimal(int decimal)
    {
        if (decimal == 0 || decimal == 1)
            return new StringBuilder(String.valueOf(decimal));
        return decimalToHexadecimalHelper(decimal, new StringBuilder("")).reverse();

    }

    /**
     * This returns the hexadecimal equivalent of a decimal number using recursion.
     *
     * @param decimal The decimal number.
     * @param hexString The StringBuilder Object holding the hexadecimal representation of the decimal number.
     * @return The StringBuilder representation of the hexadecimal number.
     */
    public static StringBuilder decimalToHexadecimalHelper(int decimal, StringBuilder hexString)
    {
        if (decimal > 0)
        {
            int remainder = decimal % 16;
            if (remainder >= 10 && remainder <= 15)
                hexString.append(getCharacter(remainder));
            else
                hexString.append(remainder);
            return decimalToHexadecimalHelper(decimal / 16, hexString);
        }
        return hexString;
    }

    /**
     * This returns a Letter for a given number in the range 10 - 15.
     *
     * @param value The number whose letter equivalent is required.
     * @return The Letter equivalent of the number.
     */
    public static String getCharacter(int value)
    {
        switch (value)
        {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
        }
        return "";
    }
}
