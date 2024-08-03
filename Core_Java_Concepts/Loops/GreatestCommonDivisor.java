package Core_Java_Concepts.Loops;

import java.util.Scanner;

/**
	This is a program that prompts the user to enter two positive integers and then determines their
	greatest common divisor.
*/

public class GreatestCommonDivisor
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);
		// Prompts the user to enter two integers.
		System.out.print("\nEnter two positive integers: ");
		int number1 = console.nextInt();
		int number2 = console.nextInt();

		// Displays an error message and terminates the program if the user's input is invalid.
		if (number1 <= 0 || number2 <= 0)
		{
			System.err.println("\nError: Use positive integers > 0 only, Try again.\n");
			System.exit(0);
		}
		
		// Determines the smallest of the two numbers entered by the user.
		int smallest = Math.min(number1, number2);

		while (smallest > 0)
		{
			if (number1 % smallest == 0 && number2 % smallest == 0)
			{
				// Displays the greatest common divisor.
				System.out.printf("\nGreatest common divisor of %d and %d is: %d\n", number1, number2, smallest);
				break;  // Breaks out of the loop.
			}
			--smallest;  // Decrements smallest.
		}
	}
}

