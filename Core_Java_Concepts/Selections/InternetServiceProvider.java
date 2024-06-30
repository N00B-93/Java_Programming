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

		// Prompts the user to enter his/her type of Package subscription.
		System.out.print("\nEnter your package subscription('A', 'B', or 'C'): ");
		String packageSubscription = input.next();

		// Continues to loop till user enters a valid package subscription.
		while (!"ABC".contains(packageSubscription))
		{
			System.out.printf("\nInvalid Subscription plan!!!\nEnter a valid subscription plan('A', 'B', or 'C'): ");
			packageSubscription = input.next();
		}

		// Prompts the user to enter the number of hours used.
		System.out.print("\nEnter the number of hours used: ");
		int numberOfHours = input.nextInt();
		
		double totalCost = 0.0;

		switch (packageSubscription)
		{
			// Displays subscription package A's details.
			case "A":
				if (numberOfHours <= 10)
					totalCost = 9.95;
				else
					totalCost = 9.95 + (numberOfHours - 10) * 2;
				System.out.printf("\nSubscription Package Type: %s\nNumber of hours: %d hours\nTotal Charges: $ %.2f\n", packageSubscription, numberOfHours, totalCost);
				break;
			// Displays subscription package B's details.
			case "B":
				if (numberOfHours <= 20)
					totalCost = 13.95;
				else
					totalCost = 13.95 + (numberOfHours - 20) * 1;
				System.out.printf("\nSubscription Package Type: %s\nNumber of hours: %d hours\nTotal Charges: $ %.2f\n", packageSubscription, numberOfHours, totalCost);
				break;
			// Displays subscription package C's details.
			case "C":
				totalCost = 19.95;
				System.out.printf("\nSubscription Package Type: %s\nNumber of hours: %d hours\nTotal Charges: $ %.2f\n", packageSubscription, numberOfHours, totalCost);
				break;
		}
	}
}
