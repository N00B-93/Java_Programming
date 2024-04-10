package Multidimensional_Arrays;

import java.util.Scanner;

/*
	    This is a program that uses the method;
                public static int[] locateLargest(double[][] array)
    to determine the position of the largest element in a 2-Dimensional matrix.
 */

public class LocateLargest
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		int row, col;

		// Prompts the user to enter the number of rows and columns.
		System.out.print("\nEnter the number of rows: ");
		row = input.nextInt();
		System.out.print("\nEnter the number of columns: ");
		col = input.nextInt();

		// Creates a 2-D array to store the elements of the matrix(array).
		double[][] matrix = new double[row][col];

		// Prompts the user to enter the elements of the array.
		for (int i = 0; i < row; i++)
		{
			System.out.printf("\nEnter the elements of row %d separated by space: ", i + 1);
			for (int j = 0; j < col; j++)
			{
				matrix[i][j] = input.nextDouble();
			}
			input.nextLine();
		}

		// Determines the location of the largest element in the matrix.
		int location[] = locate(matrix);

		// Displays the result.
		System.out.printf("\nThe location of the largest element is: (%d, %d)\n", location[0], location[1]);
	}

	/**
	 * Returns the location of the largest element in a 2-D array.
	 *
	 * @param array The array whose largest element is to be located.
	 * @return A 1-D array containing the location of the largest element.
	 */
	public static int[] locate(double[][] array)
	{
		int[] result = new int[2];

		double max = array[0][0];

		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				if (array[i][j] > max)
				{
					max = array[i][j];
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}
}
