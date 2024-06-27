package Recursion;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a string and then determines the number of uppercase characters
    in the String using a recursive method and a recursive helper method.
 */

public class NumberOfUppercaseLettersUsingHelperMethod
{
    // Variable to hold the number of uppercase letters in the user input.
    public static int countUppercaseLetters = 0;

    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter a String.
        System.out.printf("\nEnter a String: ");
        String string = input.nextLine();

        // Displays the number of uppercase characters in the String.
        System.out.printf("\nThe number of uppercase characters in '%s' is: %d\n", string, countUppercase(string));
    }

    /**
     * This determines the number of uppercase letters in a String by making a call to a recursive helper method.
     *
     * @param string The string to be processed.
     * @return The number of uppercase characters.
     */
    public static int countUppercase(String string)
    {
        return countUppercaseHelper(string, string.length() - 1);
    }

    /**
     * This returns the number of uppercase characters in a String by receiving a String and an index from another recursive method.
     *
     * @param string The string whose number of uppercase characters is to be determined.
     * @param high The index of the last element of the String.
     * @return The number of uppercase characters.
     */
    public static int countUppercaseHelper(String string, int high)
    {
        if (high < 0)
            return countUppercaseLetters;
        else if (string.charAt(high) >= 65 && string.charAt(high) <= 90)
            ++countUppercaseLetters;
        return countUppercaseHelper(string, --high);
    }
}
