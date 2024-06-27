package Multidimensional_Arrays;

import java.util.Scanner;

/*
 	Two arrays are said to be Strictly identical if their corresponding elements are equal.
	This is a program that prompts the user to enter the elements of two 3x3 array and determines if they are strictly identical using a method with the header;
				public static boolean equals(int[][] matrix1, int[][] matrix2)
*/

public class StrictlyIdenticalArrays
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates two 3x3 array.
		int[][] array1 = new int[3][3];
		int[][] array2 = new int[3][3];

		// Reads in elements into the two arrays.
		System.out.printf("\nEnter the nine elements of array1 separated by space: ");
		for (int row = 0; row < array1.length; row++)
		{
			for (int col = 0; col < array1.length; col++)
				array1[row][col] = input.nextInt();
		}
		
		System.out.printf("\nEnter the nine elements of array2 separated by space: ");
		for (int row = 0; row < array1.length; row++)
		{
			for (int col = 0; col < array1.length; col++)
				array2[row][col] = input.nextInt();
		}
		
		// Checks if the two arrays are Strictly Identical.
		boolean check = equals(array1, array2);

		// Displays the result.
		if (check)
			System.out.println("\narray1 and array2 are Strictly Identical.");
		else
			System.out.println("\narray1 and array2 are not Strictly Identical.");
	}

	/**
	 * Checks if the elements of two arrays are equal.
	 * @param matrix1 The first array.
	 * @param matrix2 The second array.
	 *
	 * @return true if the arrays are Strictly Identical, otherwise returns false.
	 */
	public static boolean equals(int[][] matrix1, int[][] matrix2)
	{
		for (int row = 0; row < matrix1.length; row++)
		{
			for (int col = 0; col < matrix1.length; col++)
			{
				if (matrix1[row][col] != matrix2[row][col])
					return false;
			}
		}
		return true;
	}
}

