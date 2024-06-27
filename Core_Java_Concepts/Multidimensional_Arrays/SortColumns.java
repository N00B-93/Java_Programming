package Multidimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter the elements of a 4x4 matrix and sorts the columns using a method with the header;
				public static double[][] sortColumns(double[][] matrix)
*/

public class SortColumns
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Creates a 4x4 matrix(2-D array).
		double[][] matrix = new double[4][4];

		// Reads in elements of the array.
		for (int row = 0; row < matrix.length; row++)
		{
			System.out.printf("\nEnter the four elements of row %d: ", row);
			for (int col = 0; col < matrix.length; col++)
			matrix[row][col] = input.nextDouble();
		}

		// Displays the matrix before sorting the columns.
		System.out.println("\nThe matrix before sorting is: ");
		printMatrix(matrix);

		// Sorts the elements in the columns of the matrix.
		sortColumns(matrix);

		// Displays the matrix after sorting.
		System.out.println("\nThe matrix after sorting is: ");
		printMatrix(matrix);

	}

	/**
	 * Displays the elements of a given array.
	 *
	 * @param matrix The array whose matrix is to be displayed.
	 */
	public static void printMatrix(double[][] matrix)
	{
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix.length; col++)
			{
				System.out.printf("%f ", matrix[row][col]);
			}
			System.out.println();
		}
	}

	/**
	 * Sorts the elements in the column of a matrix(2-D array).
	 *
	 * @param matrix The matrix(2-D array) whose column elements are to be sorted.
	 */
	public static void sortColumns(double[][] matrix)
	{
		for (int col = 0; col < matrix.length; col++)
		{
			for (int pass = 0; pass < matrix.length; pass++)
			{	
				for (int row = 1; row < matrix.length; row++)
				{
					if (matrix[row - 1][col] > matrix[row][col])
					{
						double tempVar = matrix[row - 1][col];
						matrix[row - 1][col] = matrix[row][col];
						matrix[row][col] = tempVar;
					}
				}
			}
		}
	}
}

