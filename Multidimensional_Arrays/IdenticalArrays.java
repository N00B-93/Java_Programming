package Multidimensional_Arrays;

import java.util.Scanner;
import java.util.Arrays;

/*
	Two arrays are said to be identical if they have the same content. This program determines whether two
	2-D arrays(3x3 matrix) entered by the user are identical by using a method with the header;
			public static boolean equals(int[][] list1, int[][] list2)
*/

public class IdenticalArrays
{
	// Creates a Scanner Object.
	public static Scanner input = new Scanner(System.in);

	public static void main(String... args)
	{
		
		// Creates two 3x3 arrays to hold values.
		int[][] list1 = new int[3][3];
		int[][] list2 = new int[3][3];
		
		// Populates the arrays with values.
		fillArray(list1);
		fillArray(list2);

		// Determines if the arrays are identical.
		boolean check = equals(list1, list2);

		// Displays the result.
		if (check)
			System.out.println("\nThe arrays are identical.");
		else
			System.out.println("\nThe arrays are not identical.");
	}

	/**
	 * Fills an array with values entered by the users.
	 *
	 * @param array The array to be populated with values.
	 */
	public static void fillArray(int[][] array)
	{
		for (int row = 0; row < array.length; row++)
		{
			System.out.printf("\nEnter the three elements of row %d separated by space: ", row);
			for (int col = 0; col < array.length; col++)
				array[row][col] = input.nextInt();
		}
	}

	/**
	 * Checks if two arrays are identical.
	 *
	 * @param list1 The first array.
	 * @param list2 The second array.
	 *
	 * @return true if the arrays are identical, else false.
	 */
	public static boolean equals(int[][] list1, int[][] list2)
	{
		for (int row = 0; row < list1.length; row++)
		{
			Arrays.parallelSort(list1[row]);
			Arrays.parallelSort(list2[row]);
		}

		for (int row = 0; row < list1.length; row++)
		{
			for (int col = 0; col < list1.length; col++)
			{
				if (list1[row][col] != list2[row][col])
					return false;
			}
		}
		return true;
	}
}

