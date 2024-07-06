package Core_Java_Concepts.Loops;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter a string and displays the characters
	at even positions. 
*/

public class ProcessString
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter a String to be processed.
		System.out.print("\nEnter a String: ");
		String string = input.nextLine();
		
		// Displays the result.
		System.out.print("\nThe characters at even positions are: ");
		for (int i = 0; i < string.length(); i++)
		{
			if (i % 2 == 0 && i >= 2)
				System.out.print(string.charAt(i));
		}
		System.out.println();
	}
}
