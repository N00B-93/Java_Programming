package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
 	This is a program prompts the user to enter the weight and price of each package 
	and displays the one with the better price. 
*/

public class CompareCost
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter the price and weight of package1.
		System.out.print("\nEnter the weight of Package1: ");
		double weight1 = input.nextDouble();
		System.out.print("\nEnter the price of package1: ");
		double price1 = input.nextDouble();
		
		// Prompts the user to enter the price and weight of package2.
		System.out.print("\nEnter the weight of Package2: ");
		double weight2 = input.nextDouble();
		System.out.print("\nEnter the price of package2: ");
		double price2 = input.nextDouble();
		
		// Calculates the price per kg of package1.
		double pricePerKg1 = price1 / weight1;

		// Calculates the price per kg of package2.
		double pricePerKg2 = price2 /weight2;

		// Determine the package with the better price and displays the result.
		if (pricePerKg1 > pricePerKg2)
			System.out.println("\nPackage1 has a better price.");
		else
			System.out.println("\nPackage2 has a better price.");
	}
}


