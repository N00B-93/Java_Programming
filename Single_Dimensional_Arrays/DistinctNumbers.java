package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that uses a method with the header;
				public static void checkDistinct(int[] array, int number)
	to display the distinct element in an array entered by the user.
 */

public class DistinctNumbers
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates an array of 10 integers.
		int[] numbers = new int[10];

		// Prompts the user to enter the elements of the array.
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("\nEnter number[%d]: ", i);
			numbers[i] = input.nextInt();
		}

		// Displays the distinct element in the array.
		System.out.print("\nThe distinct elements are: ");
		for (int count = 0; count < 10; count++)
			checkDistinct(numbers, numbers[count]);
		System.out.println();
	}

	/**
	 * Checks if a number is a distinct element in an array of integers.
	 *
	 * @param array The array containing numbers.
	 * @param number The number to be checked.
	 *
	 */
	public static void checkDistinct(int[] array, int number)
	{
		int counter = 0;

		for (int count = 0; count < array.length; count++)
		{
			if (array[count] == number)
				counter++;
		}
		if (counter == 1)
			System.out.printf("%d ", number);
	}
}
