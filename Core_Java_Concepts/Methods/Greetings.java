package Core_Java_Concepts.Methods;

import java.util.Scanner;

/**
	This is a program that prompts the user to enter a positive integer n greater than 0 and 
	displays "Hello There!" n times.
*/

public class Greetings
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);

		// Prompts the user to enter a positive integer greater than 0.
		System.out.print("\nEnter a positive integer > 0: ");
		int numberOfTimes = console.nextInt();

		// Displays an error message and terminates the program if the user enters a number <= 0.
		if (numberOfTimes < 1)
		{
			System.out.print("\nError: Use positive integers > 0 only, Try again.\n");
			System.exit(1);
		}

		// Displays the greetings for the number of times specified by the user.
		displayGreetings(numberOfTimes);
	}
	
	/**
	 * Displays a greeting for a number of specified times.
	 *
	 * @param numberOfTimes The number of times the greeting is to be displayed.
	 */
	public static void displayGreetings(int numberOfTimes)
	{
		for (int i = 0; i < numberOfTimes; ++i)
			System.out.println("\nHello There!");
	}
}

