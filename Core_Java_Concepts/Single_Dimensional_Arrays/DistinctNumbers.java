package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter a list of 10 numbers and then displays the distinct numbers in the
	list in the order in which they appear.
 */

public class DistinctNumbers
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner scanner = new Scanner(System.in);

		// Creates an array of 10 integers.
		int[] numbers = new int[10];
		int size = 0;

		// Prompts the user to enter 10 numbers separated by space.
		System.out.println("Enter 10 numbers separated by space: ");
		for (int i = 0; i < 10; i++)
		{
			// Reads in a number.
			int number = scanner.nextInt();

			boolean exists = false;

			for (int j = 0; j < size; j++)
			{
				// Checks if the number already exists in the array.
				if (numbers[j] == number)
				{
					exists = true;
					break;
				}
			}
			// Add the number to the array if it's not in the array.
			if (!exists)
			{
				numbers[size] = number;
				size++;
			}
		}

		// Displays the number of distinct elements.
		System.out.println("\nNumber of distinct numbers: " + size);

		// Displays the distinct elements.
		System.out.println("Distinct numbers in input order:");
		for (int i = 0; i < size; i++)
		{
			System.out.print(numbers[i] + " ");
		}
	}
}
