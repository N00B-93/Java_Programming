package Multidimensional_Arrays;

import java.util.Scanner;
import java.util.Arrays;

/*
	This is a program that prompts the user to enter the elements of a 4x4 matrix and sorts the rows of the matrix using a method with the header;
	public static double[][] sortRows(double[][] matrix)
*/

public class SortRows
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Creates a 4x4 matrix(2-D array).
		double[][] matrix = new double[4][4];
		
		// Reads in elements into the matrix.
		for (int row = 0; row < matrix.length; row++)
		{
			System.out.printf("\nEnter the four elements of row %d: ", row);
			for (int col = 0; col < matrix.length; col++)
				matrix[row][col] = input.nextDouble();
		}

		// Displays the matrix before sorting the rows.
		System.out.println("\nThe matrix before sorting is: ");
		printMatrix(matrix);

		// Sorts the rows of the matrix.
		sortRows(matrix);

		// Displays the matrix after the rows has been sorted.
		System.out.println("\nThe row sorted matrix is: ");
		printMatrix(matrix);
	}

	/**
	 * Displays the elements of a given matrix.
	 *
	 * @param matrix The matrix whose elements is to be displayed.
	 *
	 */
	public static void printMatrix(double[][] matrix)
	{
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix.length; col++)
				System.out.printf("%f ", matrix[row][col]);
			System.out.println();
		}
	}

	/**
	 * Sorts the rows of a given matrix(2-D array).
	 *
	 * @param matrix The matrix whose row is to be sorted.
	 *
	 */
	public static void sortRows(double[][] matrix)
	{
		for (int row = 0; row < matrix.length; row++)
		{
			Arrays.parallelSort(matrix[row]);
		}
	}
}

