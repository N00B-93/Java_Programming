package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
	An Internet service provider has three different subscription packages for its customers:
		Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour.
		Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour.
		Package C: For $19.95 per month unlimited access is provided.
	This program prompts the user to enter the letter of the package the customer has purchased (A, B, or C) and the
	number of hours that were used.
	It then displays the subscription package's information and the user's total charges.
*/

public class InternetServiceProvider
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Constants to hold the base price for each subscription.
		final double BASE_PRICE_FOR_SUB_A = 9.95, BASE_PRICE_FOR_SUB_B = 13.95, BASE_PRICE_FOR_SUB_C = 19.95;

		// Constants to hold the base number of hours for each subscription.
		final int BASE_HOURS_FOR_SUB_A = 10, BASE_HOURS_FOR_SUB_B = 20;

		// Prompts the user to enter his/her type of Package subscription.
		System.out.print("\nEnter your package subscription('A', 'B', or 'C'): ");
		char packageSubscription = input.next().charAt(0);

		// Continues to loop till user enters a valid package subscription.
		while (!"ABC".contains(packageSubscription + ""))
		{
			System.out.printf("\nInvalid Subscription plan!!!\nEnter a valid subscription plan('A', 'B', or 'C'): ");
			packageSubscription = input.next().charAt(0);
		}

		// Prompts the user to enter the number of hours used.
		System.out.print("\nEnter the number of hours used: ");
		int numberOfHours = input.nextInt();

		// Variable to hold the total cost of a subscription.
		double totalCost;

		switch (packageSubscription)
		{
			// Displays subscription package A's details.
			case 'A':
				if (numberOfHours <= BASE_HOURS_FOR_SUB_A)
					totalCost = BASE_PRICE_FOR_SUB_A;
				else
					totalCost = BASE_PRICE_FOR_SUB_A + (numberOfHours - BASE_HOURS_FOR_SUB_A) * 2;
				System.out.printf("\nSubscription Package Type: %s\nNumber of hours: %d hours\nTotal Charges: $ %.2f\n",
						packageSubscription, numberOfHours, totalCost);
				break;
			// Displays subscription package B's details.
			case 'B':
				if (numberOfHours <= BASE_HOURS_FOR_SUB_B)
					totalCost = BASE_PRICE_FOR_SUB_B;
				else
					totalCost = BASE_PRICE_FOR_SUB_B + (numberOfHours - BASE_HOURS_FOR_SUB_B);
				System.out.printf("\nSubscription Package Type: %s\nNumber of hours: %d hours\nTotal Charges: $ %.2f\n",
						packageSubscription, numberOfHours, totalCost);
				break;
			// Displays subscription package C's details.
			case 'C':
				totalCost = BASE_PRICE_FOR_SUB_C;
				System.out.printf("\nSubscription Package Type: %s\nNumber of hours: %d hours\nTotal Charges: $ %.2f\n",
						packageSubscription, numberOfHours, totalCost);
				break;
		}
	}
}
