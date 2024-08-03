package Core_Java_Concepts.Loops;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter two strings and
	displays the largest common prefix of the two strings.
*/

public class LongestCommonPrefix
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Reads in two strings.
		System.out.print("\nEnter the first string: ");
		String string1 = input.nextLine();

		System.out.print("\nEnter the second string: ");
		String string2 = input.nextLine();

		int i = 0;
		
		// Terminates the program if the two strings has no common prefix.
		if (string1.charAt(0) != string2.charAt(0))
		{
			System.out.printf("\n'%s' and '%s' has no common prefix.\n", string1, string2);
			System.exit(0);
		}

		// While loop that terminates when the two strings no longer have any character in common.
        while (i < string1.length() && i < string2.length() && string1.charAt(i) == string2.charAt(i))
            i++;
	
		// Displays the result.
		if (string1.length() > string2.length())
			System.out.printf("\nThe common prefix of '%s' and '%s' is: '%s'\n", string1, string2, string1.substring(0, i));
		else
			System.out.printf("\nThe common prefix of '%s' and '%s' is: '%s'\n", string1, string2, string2.substring(0, i));
	}
}

