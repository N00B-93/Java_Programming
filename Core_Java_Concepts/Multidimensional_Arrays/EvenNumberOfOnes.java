package Multidimensional_Arrays;

import java.util.Random;

/*
	This is a program that generates a 6-by-6 two-dimensional matrix filled with 0s and 1s, displays 
	the matrix, and checks if every row and every column have an even number of 1s.
*/

public class EvenNumberOfOnes
{
	public static void main(String... args)
	{
		// Creates a Random Object.
		Random random = new Random();

		// Creates a 2-D 6x6 matrix.
		int[][] matrix = new int[6][6];

		// Populates the matrix with 0's and 1's.
		for (int row = 0; row < matrix.length; row++)
			for (int col = 0; col < matrix.length; col++)
				matrix[row][col] = random.nextInt(2);

		// Displays the matrix.
		System.out.println("\nThe generated matrix is: ");
		printMatrix(matrix);

		// Determines if the matrix's rows and columns has even numbers of 1's.
		if (checkColumnsEvenOnes(matrix) && checkRowsEvenOnes(matrix))
			System.out.println("\nAll the rows and columns of the matrix has even number of 1's.");
		else
			System.out.println("\nNot all the rows and columns of the matrix have even number of 1's.");
	}

	/**
	 * Displays the elements of a matrix.
	 *
	 * @param matrix The matrix to be displayed.
	 */
	public static void printMatrix(int[][] matrix)
	{
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix.length; col++)
				System.out.printf("%d ", matrix[row][col]);
			System.out.println();
		}
	}

	/**
	 * Checks if all the columns in a matrix has an even number of 1's.
	 *
	 * @param matrix The matrix to be processed.
	 *
	 * @return true if all the columns in the matrix have even numbers of 1's else false.
	 */
	public static boolean checkColumnsEvenOnes(int[][] matrix)
	{
		for (int col = 0; col < matrix.length; col++)
		{
			int countOnes = 0;

			for (int row = 0; row < matrix.length; row++)
			{
				if (matrix[row][col] == 1)
					countOnes++;
			}
			if (countOnes % 2 != 0)
				return false;
		}
		return true;
	}

	/**
	 * Checks if all the rows in a matrix has an even number of 1's.
	 *
	 * @param matrix The matrix to be processed.
	 *
	 * @return true if all the rows have even numbers of ones, else false.
	 */
	public static boolean checkRowsEvenOnes(int[][] matrix)
	{
		for (int row = 0; row < matrix.length; row++)
		{
			int countOnes = 0;

			for (int col = 0; col < matrix.length; col++)
			{
				if (matrix[row][col] == 1)
					countOnes++;
			}
			if (countOnes % 2 != 0)
				return false;
		}
		return true;
	}
}
	
