package Elementary_Programming;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter the amount of rice is a bag in pounds and displays the number of bags of rice that will be
	needed to store a ton of rice.
*/

public class BagsOfRice
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);

		// Prompts the user to enter the amount of rice in a bag in pounds.
		System.out.print("\nEnter the amount of rice in a bag in pounds: ");
		double amountOfRice = console.nextDouble();

		// Closes the Scanner.
		console.close();

		// A constant used to convert pounds to kg.
		double POUNDS_TO_KILOGRAMS = 0.4545;

		// Converts the quantity of rice from pounds to kilogram.
		double amountOfRiceInKg = amountOfRice * POUNDS_TO_KILOGRAMS;

		// Determines the numberbof bags needed to store a ton of rice.
		long numberOfBags = Math.round(1000 / amountOfRiceInKg);

		// Displays the number of bags needed.
		System.out.printf("\nThe number of bags needed to store a ton of rice is: %d\n", numberOfBags);
	}
}
		
