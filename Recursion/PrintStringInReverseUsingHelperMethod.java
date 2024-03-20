package Recursion;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter a String and then displays the String in 
	reverse using a recursive method and a recursive helper method.
*/

public class PrintStringInReverseUsingRecursiveHelperMethod
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter a String to be displayed in reverse.
		System.out.printf("\nEnter a String to be diplayed in reverse: ");
		String string = input.nextLine();

		// Displays the String in reverse.
		System.out.printf("\n'%s' displayed in reverse is: ", string);
		reverseDisplay(string);

		System.out.println();
	}

	public static void reverseDisplay(String string)
	{
		reverseDisplayHelper(string, string.length() - 1);
	}

	public static void reverseDisplayHelper(String string, int high)
	{
		if (high < 0)
			return;
		else
		{
			System.out.printf("%c", string.charAt(high));
			reverseDisplayHelper(string, --high);
		}
	}
}

