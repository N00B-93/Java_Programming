package Selections;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter an integer and determines whether the 
	integer entered is an even or an odd number.
*/

public class EvenOrOdd
{
	public static void main(String... args)
	{
		// Creates a Scanner Object
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter an integer.
		System.out.printf("\nEnter an integer: ");
		int number = input.nextInt();

		// Displays an error message and exits the program if the user input < 1.
		if (number < 1)
		{
			System.out.println("\nInvalid input, Use a number >= 1.");
			System.exit(1);
		}

		// Determines if a number is even or odd and displays the result.
		String evenOrOdd = number % 2 == 0 ? number + " is even" : number + " is odd";
		System.out.println("\n" + evenOrOdd);
	}
}
		
