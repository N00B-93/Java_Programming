package Loops;

import java.util.Scanner;

/*
	This is a program that predicts the size of the population of organisms. The program prompts the 
	user to enter the starting number of organisms, their average daily population increase 
	(as a percentage), and the number of days they will multiply. The program then uses a loop to display the size of the
	population each day.
*/

public class Population
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		int startingNumberOfOrganisms, numberOfDays;
		double dailyPopulationIncrease;

		while (true)
		{
			// Prompts the user to enter the starting number of organisms
			System.out.print("\nEnter the starting number of organisms: ");
			startingNumberOfOrganisms = input.nextInt();

			// prompts the user to enter the average daily population increase.
			System.out.print("\nEnter the average daily population increase(e.g., 5%): ");
			dailyPopulationIncrease = input.nextDouble();

			// Prompts the user to enter the number of days they will be left to multiply.
			System.out.print("\nEnter number of days organisms will be left to multiply: ");
			numberOfDays = input.nextInt();

			// Breaks out of the loop if the starting number of organisms >= 2, average daily population increase is > 0
			// and the number of days the organisms are left to multiply is >= 1.
			if (startingNumberOfOrganisms >= 2 && dailyPopulationIncrease >= 0 && numberOfDays >= 1)
				break;
			else if (dailyPopulationIncrease < 0)
				System.out.println("\nInvalid input!!!\nPercentage daily population increase must be positive.");
			else if (startingNumberOfOrganisms < 2)
				System.out.println("\nInvalid input!!!\nStarting organisms must be >= 2.");
			else if (numberOfDays < 1)
				System.out.println("Invalid input!!!\number of days organisms are left to increase must be >= 1.");
		}

		int population = startingNumberOfOrganisms;

		// Displays the population on a daily basis.
		System.out.println("\nDay\t\tPopulation");
		for (int day = 1; day <= numberOfDays; day++)
		{
			System.out.printf("%d\t\t%d\n", day, population);
			population += population * dailyPopulationIncrease / 100;
		}

	}
}
