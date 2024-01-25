package Loops;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter a decimal number
	and then display the octal equivalent of the decimal number.
 */

public class DecimalToOctal
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Reads in a decimal number to be converted.
		System.out.print("\nEnter a decimal number to be converted to octal: ");
		int number = input.nextInt();

		int tempVar = number, octal = 0, count = 0, rem;

		while (number != 0)
		{
			rem = number % 8;  // Extracts the last digit from the number.
			octal += (int) (rem * Math.pow(10, count));  // Determines the octal equivalent of the last digit
			count++;  // Increments the counter by 1.
			number /= 8;  // Peels off the extracted last digit.
		}
		// Displays the octal equivalent of the number.
		System.out.printf("\nThe value of %d in base 8 is: %d\n", tempVar, octal);
	}
}
