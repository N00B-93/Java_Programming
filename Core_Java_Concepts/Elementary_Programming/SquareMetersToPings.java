package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter area in square meters and then determines and 
	displays the equivalent in pings.
*/

public class SquareMetersToPings
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);
		// Constant representing square meters to pings conversion factor.
		double SQUARE_METERS_TO_PINGS = 0.3025;

		// Prompts the user to enter an area in square meters.
		System.out.print("\nEnter area in square meters: ");
		double squareMeters = console.nextDouble();

		// Determines the area in pings.
		double pings = SQUARE_METERS_TO_PINGS * squareMeters;

		// Displays the result.
		System.out.printf("\n%.2f square meters is %.2f pings.\n", squareMeters, pings);

		// Closes the Scanner.
		console.close();
	}
}

