package Core_Java_Concepts.Single_Dimensional_Arrays;

import java.util.Scanner;

/**
	This is a program that prompts the user to enter a list of 10 numbers, adds them to an array and
	then displays the number of even and odd numbers in the array.
*/

public class EvenAndOddNumbers
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);

		// Creates an array to store 10 intwgers.
		int[] array = new int[10];

		// Prompts the user to enter the 10 elements of the array.
		System.out.print("\nEnter 10 integers: ");
		for (int i = 0; i < array.length; ++i)
			array[i] = console.nextInt();
		// Displays the number of even and odd elements in the array.
		displayNumberOfEvenAndOddElements(array);
	}

	/**
	 * Displays the number of even and odd elements in an array.
	 *
	 * @param array An hold holding integers.
	 */
	public static void displayNumberOfEvenAndOddElements(int... array)
	{
		int numberOfEvenElements = 0, numberOfOddElements = 0;

		for (int i = 0; i < array.length; ++i)
		{
			if (array[i] % 2 == 0)
				++numberOfEvenElements;
			else
				++numberOfOddElements;
		}

		System.out.printf("\nNumber of even elements: %d\nNumber of odd elements: %d\n", numberOfEvenElements, numberOfOddElements);
	}
}

