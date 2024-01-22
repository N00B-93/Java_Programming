package Loops;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter a string and displays it in reverse order.
*/

public class ReverseString
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter the string to be reversed.
		System.out.print("\nEnter a String: ");
		String string = input.nextLine();
		
		// Displays the string in reverse.
		System.out.print("\nThe string in reverse is: ");
		for (int i = string.length() - 1; i >= 0; i--)
			System.out.print(string.charAt(i));
		System.out.println();
	}
}

