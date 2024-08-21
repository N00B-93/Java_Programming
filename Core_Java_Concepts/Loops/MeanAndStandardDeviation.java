package Core_Java_Concepts.Loops;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter 10 numbers and displays the mean and standard 
	deviations of these numbers using the following formula:
		mean = (x1 + x2 + ... + xn) / n

		deviation = √(∑x^2 - (∑x)^2 / n) / (n -1)
*/

public class MeanAndStandardDeviation
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner scanner = new Scanner(System.in);
		
		// Variable to hold the sum of user input and the sum of the square of each user input.
		double sum = 0;
		double sumSquared = 0;
		
		// Constant to hold the number of entries to be entered by the user.
		final int NUMBER_OF_ENTRIES = 10;
		
		// Prompts the user to enter a specified amount of numbers.
		System.out.printf("\nEnter %d numbers: ", NUMBER_OF_ENTRIES);
		for (int i = 0; i < NUMBER_OF_ENTRIES; i++)
		{
			double number = scanner.nextDouble();
			// Determines the sum of all numbers and the sum of the squares of all numbers.
			sum += number;
			sumSquared += number * number;
		}
		
		// Closes the Scanner Object.
		scanner.close();
		
		// Determines the mean and standard deviation.
		double mean = sum / NUMBER_OF_ENTRIES;
		double standardDeviation = Math.sqrt((sumSquared - (Math.pow(sum, 2) / NUMBER_OF_ENTRIES)) / (NUMBER_OF_ENTRIES - 1));
		
		// Displays the mean and standard deviation.
		System.out.printf("\nMean: %.2f\n", mean);
		System.out.printf("\nStandard Deviation: %.2f\n", standardDeviation);
	}
}

