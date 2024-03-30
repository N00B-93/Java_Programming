package Loops;

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
		int number, count = 0, max = 0;

		System.out.print("\nEnter a number(press 0 to exit): ");
		number = input.nextInt();

		while (number != 0)
		{
			// Reads in a number.
			System.out.print("\nEnter a number(press 0 to exit): ");
			number = input.nextInt();

			// Updates the max variable if the number entered is >= it.
			if (number > max || number == max)
			{
				max = number;
				count++;
			}
		}
		// Displays the result.
		System.out.format("\nThe Largest number is: %d\nFrequency: %d\n", max, count);
	}
}
