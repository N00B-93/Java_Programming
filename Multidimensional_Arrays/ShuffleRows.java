package Multidimensional_Arrays;

import java.util.Random;

/*
	This is a program that shuffles the rows in the 2-D array(matrix) given below;
			int[][] matrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}}
	using the method;
			public static void shuffle(int[][] matrix)
	and also using the method;
			public static void printMatrix(int[][] matrix)
			to display the matrix before and after shuffling.
 */

public class ShuffleRows
{
	public static void main(String... args)
	{
		// Initializes a 5x2 matrix with integer values.
		int[][] matrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

		// Displays the matrix before Shuffling.
		System.out.println("\nThe array before shuffling is: ");
		printMatrix(matrix);

		// Shuffle the matrix.
		shuffle(matrix);

		// Displays the matrix after Shuffling.
		System.out.println("\nThe matrix after shuffling is: ");
		printMatrix(matrix);
	}
	
	/**
	 * Prints the elements of a given matrix(array) to the Console.
	 *
	 * @param matrix The matrix(array) to be displayed.
	 *
	 */
	public static void printMatrix(int[][] matrix)
	{
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[0].length; col++)
			{
				System.out.printf("%d ", matrix[row][col]);
			}
			System.out.println();
		}
	}

	/**
	 * Shuffles the rows in a given matrix(2-D array).
	 *
	 * @param matrix The matrix(array) whose rows are to be shuffled.
	 *
	 */
	public static void shuffle(int[][] matrix)
	{
		int previousIndex = 0;

		Random random = new Random();

		for (int i = 0; i < matrix.length; i++)
		{
			int currentIndex = random.nextInt(0, matrix.length);

			while (currentIndex == previousIndex)
			{
				currentIndex = random.nextInt(0, matrix.length);
			}
			int[] tempVar = matrix[i];
			matrix[i] = matrix[currentIndex];
			matrix[currentIndex] = tempVar;
			previousIndex = currentIndex;
		}
	}
}

