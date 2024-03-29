package Elementary_Programming;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter the distance to drive, the fuel efficiency of the carin miles per gallon, and the price per gallon, 
	and displays the cost of the trip.
*/

public class CostOfDriving
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Reads in the driving distance.
		System.out.print("\nEnter the driving distance: ");
		double distance = input.nextDouble();

		// Reads in the miles per gallon.
		System.out.print("\nEnter the miles per gallon: ");
		 double milesPerGallon = input.nextDouble();

		// Reads in the cost per gallon.
		System.out.print("\nEnter the cost per gallon: ");
		double costPerGallon = input.nextDouble();

		// Calculates the total gallon of fuel used.
		double fuelConsumed = distance / milesPerGallon;

		// Calculates the cost of driving.
		double costOfDriving = fuelConsumed * costPerGallon;

		// Displays the result.
		System.out.printf("\nThe cost of driving is: $ %.2f\n", costOfDriving);
	}
}
