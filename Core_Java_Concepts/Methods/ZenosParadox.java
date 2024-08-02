package Core_Java_Concepts.Methods;

import java.util.Scanner;

/**
	A famous paradox devised by Zeno, an Eleatic philosopher (b. 488 BCE), asserts that to run
	from point A to point B , a runner must fi rst traverse half the distance between A and B . 
	Before he can do that, he must traverse a “half of the half,” and so on ad infinitum. 
	He must, therefore, pass through an infinite number of points, and that is impossible in a finite time. Design and implement a method
			double zeno(int n)
	This is a program that prompts the user to enter an integer greater than 0 and calculates the sum of the series;
			1/2 + 1/4 + 1/8 +...
using the method zeno.
 */

public class ZenosParadox
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);

		// Prompts the user to enter a positive integer > 0.
		System.out.print("\nEnter the number of terms: ");
		int numberOfTerms = console.nextInt();
		
		// Displays an error message and terminates the program if the user input < 1.
		if (numberOfTerms < 1)
		{
			System.out.println("\nError: Use positive integers > 0 only, Try again.");
			System.exit(1);
		}

		// Displays the sum of the series upto the specified number of terms.
		System.out.printf("\nSum of %d terms: %f\n", numberOfTerms, zeno(numberOfTerms));
	}
	
	/**
	 * Calculates the sum of the series 1/2 + 1/4 + 1/8+... for a specified number of terms.
	 *
	 * @param numberOfTerms The number of terms for which the sum of the series is to be calculated.
	 * @return The sum of the series for a specified number of terms.
	 */
	public static double zeno(int numberOfTerms)
	{
		double sumOfTerms = 0.0;

		for (int i = 1; i <= numberOfTerms; ++i)
			sumOfTerms += (1.0 / Math.pow(2, i));

		return sumOfTerms;
	}
}

