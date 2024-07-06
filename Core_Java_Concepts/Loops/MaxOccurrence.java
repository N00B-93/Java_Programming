package Core_Java_Concepts.Loops;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter a series of numbers and then determines
	the largest number entered and its frequency. The input stops when the user enters 0.
 */

public class MaxOccurrence
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Declares and initializes the number, count and max variables.
		int number = -2, count = 0, max = 0;

		while (number != 0)
		{
			// Reads in a number.
			System.out.print("\nEnter a number(press 0 to exit): ");
			number = input.nextInt();

			// Updates the max variable if the number entered is >= it, resets counter to 0 and increments it.
			if (number > max)
			{
				count = 0;
				max = number;
				count++;
			}
			else if (number == max)  // Increments counter if the number is the same as max.
				count++;
		}
		// Displays the result.
		System.out.format("\nThe Largest number is: %d\nFrequency: %d\n\n", max, count);
	}
}
