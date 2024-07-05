package Core_Java_Concepts.Single_Dimensional_Arrays;

import java.util.Scanner;

/**
	This is a program that prompts the user to enter a list of 10 numbers, adds them to an array and 
	determines the index of the largest element in the array by using a function with the header;
			public static int indexOfLargestElement(double[] array)
*/

public class FindLargestElementIndex
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);

		// Creates an array to store 10 intwgers.
		double[] array = new double[10];

		// Prompts the user to enter the 10 elements of the array.
		System.out.print("\nEnter 10 integers: ");
		for (int i = 0; i < array.length; ++i)
			array[i] = console.nextDouble();
		// Displays the index of the largest element.
		System.out.printf("\nThe index of the largest element is: %d\n", indexOfLargestElement(array));

		// Closes the Scanner.
		console.close();
	}
	
	/**
	 * Determines the index of the largest element in an array.
	 *
	 * @param array An array of integers.
	 * @return The index of the largest element in the array, if the largest element occurs more than once, the index of it's first occurrence is returned.
	 */
	public static int indexOfLargestElement(double[] array)
	{
		double maxElement = array[0];
		int indexOfMax = 0;

		for (int i = 0; i < array.length; ++i)
		{
			if (array[i] > maxElement)
			{
				maxElement = array[i];
				indexOfMax = i;
			}
		}

		return indexOfMax;
	}
}

