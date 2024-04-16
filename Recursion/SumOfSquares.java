package Recursion;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
	This is a program that prompts the user to enter a positive integer and then displays the sum of squares of numbers
	from 0 up to the number entered by the user using a recursive method with the header;
			public static long sumOfSquares(long number)
*/

public class SumOfSquares
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
			try
			{
				// Prompts the user to enter an integer.
				System.out.print("\nEnter a integer greater than 0: ");
				long number = input.nextLong();

				// Displays an error message if the user enters a negative integer.
				if (number < 0)
				{
					System.out.println("\nInvalid Input, Use a positive integer.");
					continue;
				}
				
				// Displays the result.
				System.out.printf("\nThe sum of squares of numbers from 0 to %d is: %d\n", number, sumOfSquares(number));
				break;
			}
			catch (InputMismatchException inputMismatchException)
			{
				System.out.printf("\nInvalid input, Use positive integers only!!!\n");
				input.nextLine();
			}
		}
	}
	
	/**
	 * This returns the sum of squares of numbers from 0 up to n recursively.
	 *
	 * @param number The number up to which the sum of squares is calculated.
	 *
	 * @return The sum of squares of numbers from 0 to number.
	 */
	public static long sumOfSquares(long number)
	{
		if (number == 0)
			return number;
		return (long) Math.pow(number, 2) + sumOfSquares(--number);
	}
}

