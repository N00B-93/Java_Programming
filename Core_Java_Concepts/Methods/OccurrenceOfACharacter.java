package Core_Java_Concepts.Methods;

import java.util.Scanner;

/*
    This is a program that uses a function with the header;
                public static int count(String str, char a)
    to calculate the number of occurrence of a character in a string.
 */

public class OccurrenceOfACharacter
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in a String.
        System.out.printf("\nEnter a String: ");
        String string = input.nextLine();

        // Reads in a character whose occurrence in a string is to be counted.
        System.out.printf("\nEnter the character whose occurrence is to be counted: ");
        char character = input.next().charAt(0);

        // Counts the occurrence of the character in the String.
        int occurrence = count(string, character);

        // Displays the result.
        System.out.printf("\nThe number of occurrence of '%c' in '%s' is: %d\n", character, string, occurrence);
    }

    /**
     * Counts the number of occurrence of a character in a String.
     *
     * @param str The String to be processed.
     * @param a   The character to be counted.
     * @return The number of occurrence of the character.
     */
    public static int count(String str, char a)
    {
        int counter = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == a)
                counter++;
        }
        return counter;
    }
}
