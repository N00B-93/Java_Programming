package Core_Java_Concepts.Methods;

import java.util.Scanner;

/*
	This is a program that uses a method with the header;
		public static void reverse(int number)

	to reverse an integer and display the reversed integer.
*/

public class ReverseOrder
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Reads in an integer to be reversed.
		System.out.printf("\nEnter an integer to be reversed: ");
		int number = input.nextInt();
		
		// Reverses the integer.
		reverse(number);
	}
	
	/**
	 * Reverses an integer and displays the result.
	 *
	 * @param n The integer to be reversed.
	 *
	 * @return Void.
	 */
	public static void reverse(int n)
	{
		int reverse = 0, remainder = 0, temp = n;

		while (n != 0)
		{
			remainder = n % 10;  // Extracts a digit.
			reverse = reverse * 10 + remainder;  // Calculates the reversed number.
			n /= 10;  // Peels of the extracted digit.
		}
			// Displays the reversed integer.
			System.out.printf("\nOriginal number: %d\nReversed number: %d\n", temp, reverse);
	}
}
