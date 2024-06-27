package Methods;

import java.util.Scanner;

/*
	This is a program that uses the method;
		public static int sumDigits(long n)
	to calculate the sum of digits in an integer.
*/

public class SumOfDigits
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter an Integer.
		System.out.printf("\nEnter an Integer: ");
		long number = input.nextLong();

		// Calculates the sum of digits by calling the sumDigit method and displaying the result.
		System.out.printf("\nThe sum of digits in %d is: %d\n", number, SumDigits(number));
	}
	
	/**
	 * Calculates the sum of numbers in an integer.
	 *
	 * @param number The number whose sum of its digit is to be determined.
	 *
	 * @return The sum of digits in an Integer.
	 */
	public static int SumDigits(long number)
	{
		long sum = 0, rem;

		while (number > 0)
		{
			rem = number % 10;  // Extracts the last digit.
			sum += rem;  // Sum up all the extracted digits.
			number /= 10;  // Peels off the extracted digit.
		}
		// Casts the sum from long to int.
		return (int) (sum);
	}
}
