package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
	The price of produce is marked down by 10% if you buy more than three pounds, and it is reduced
	by 20% if you buy over six pounds. This is a program that prompts the user for the price per 
	pound of fruit (double) and the desired number of pounds (double) and then displays the total price.
*/

public class MarketPrice
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter the price per pound of fruit.
		System.out.print("\nEnter the price per pound of fruit: $ ");
		double pricePerPound = input.nextDouble();

		// Prompts the user to enter the number of pounds of fruits to be purchased.
		System.out.printf("\nEnter the number of pounds of fruit to be purchased: ");
		double quantityPurchased = input.nextDouble();

		// Displays an error message and terminates the program if the user enters a quantity or price <= 0.
		if (quantityPurchased <= 0 || pricePerPound <= 0)
		{
			System.out.println("\nInvalid Input!\nThe quantity purchased and price must be greater than 0.");
			System.exit(1);
		}

		// Determines the total price of fruit purchased without discount.
		double totalPrice = quantityPurchased * pricePerPound;

		// Displays the total price of fruit depending on the quantity purchased and discount.
		if (quantityPurchased > 3 && quantityPurchased <= 6)
			System.out.printf("\nTotal price with 10%% discount is: $ %.2f\n", totalPrice - (totalPrice * 0.1));
		else if (quantityPurchased > 6)
			System.out.printf("\nTotal price with 20%% discount is: $ %.2f\n", totalPrice - (totalPrice * 0.2));
		else if (quantityPurchased < 3)
			System.out.printf("\nTotal price is: $ %.2f\n", totalPrice);
	}
}

