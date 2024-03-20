package Recursion;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a String and a character and then determines
    the number of occurrence of that character in the String.
 */

public class CountOccurrenceOfCharacter
{
    public static void main(String[] args) {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the suer to enter a String.
        System.out.printf("\nEnter a String: ");
        String string = input.nextLine();

        // Prompts the user to enter a Character.
        System.out.printf("\nEnter the character to be counted: ");
        char character = input.nextLine().charAt(0);
	
	// Displays the number of occurrence of the character in the String.
	System.out.printf("\nThe number of occurrence of '%c' in '%s' is: %d\n\n", character, string, count(string, character));
    }

    /**
     * This returns the number of occurrence of a specific character in a String.
     * @param string The string to be processed.
     * @param character The character to be counted.
     *
     * @return The number of occurrence of a specific character in a String.
     */
    public static int count(String string, char character)
    {
	if (string.equals(""))
		return 0;
	else if (character == string.charAt(string.length() - 1))
		return 1 + count(string.substring(0, string.length() - 1), character);
	else
		return count(string.substring(0, string.length() - 1), character);
    }
}

