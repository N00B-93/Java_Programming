package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter distance in miles and then determines and 
	displays the equivalent in kilometers.
*/

public class MilesToKilometers
{
	public static void main(String... args)
	{
		// Constant representing miles to kilometers conversion factor.
		final double MILES_TO_KILOMETERS = 1.609;

		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);

		// Prompts the user to enter distance in Miles.
		System.out.print("\nEnter distance in Miles: ");
		double miles = console.nextDouble();

		// Determines the kilometers equivalent of the user's input.
		double kilometers = miles * MILES_TO_KILOMETERS;

		// Displays the result.
		System.out.printf("\n%.2f miles is %.2f kilometers.\n", miles, kilometers);

		// Closes the Scanner.
		console.close();
	}
}

