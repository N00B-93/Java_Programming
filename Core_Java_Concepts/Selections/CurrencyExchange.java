package Selections;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB.
	It Prompts the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB to U.S. dollars.
	It also Prompt the user to enter the amount in U.S. dollars 
	or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. 
*/

public class CurrencyExchange
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter exchange rate from USD to RMB.
		System.out.print("\nEnter the exchange rate from USD to RMB: ");
		double exchangeRate = input.nextDouble();
		// Displays options for the user to select.
		System.out.print("\n1. USD to RMB\n2. RMB to USD\n\nEnter a choice: ");
		String choice = input.next();

		// Switch-Case block that converts currency based on user's choice.
		switch (choice)
		{
			case "1":
				// Converts USD to RMB.
				System.out.print("\nEnter the amount in USD: ");
				double amount = input.nextDouble();
				System.out.printf("\nUSD %.2f = RMB %.2f\n", amount, (amount * exchangeRate));
				break;
			case "2":
				// Converts RMB to USD.
				System.out.print("\nEnter the amount in RMB: ");
				amount = input.nextDouble();
				System.out.printf("\nRMB %.2f = USD %.2f\n", amount, (amount / exchangeRate));
				break;
			default:
				System.out.println("\nInvalid Input, Try Again!");
				break;
		}
	}
}

