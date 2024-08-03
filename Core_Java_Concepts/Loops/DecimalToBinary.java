package Core_Java_Concepts.Loops;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter a positive decimal number and then determines
	and displays the binary equivalent of the decimal number.
*/

public class DecimalToBinary
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);

		// Prompts the user to enter a positive decimal number.
		System.out.print("\nEnter a positive decimal number: ");
		int decimal = console.nextInt();

		// Displays an error message and terminates the program if the user's input is < 0.
		if (decimal < 0)
		{
			System.out.println("\nError: Use positive numbers >= 0 only, Try again.\n");
			System.exit(0);
		}

		// Assigns the user input to a temporary variable to preserve its value.
		int tempVariable = decimal;

		// A String to hold the binary equivalent of the user's input.
		StringBuffer binaryString = new StringBuffer();

		while (decimal > 0)
		{
			int remainder = decimal % 2;  // Gets the last digit in the decimal number.
			binaryString.insert(0, remainder);
			decimal /= 2;  // Peels off the last digit.
		}
		
		// Displays the result.
		System.out.printf("\nThe binary equivalent of %d is: %s\n", tempVariable, binaryString);
	}
}

