package Multidimensional_Arrays;

import java.util.Scanner;

/*
		A nxn matrix is called a positive Markov matrix if each element
    	is positive and the sum of the elements in each column is 1.
    	This is a program that prompts the user to enter the rows of a 3x3 matrix and checks if the
    	matrix is a valid Markov matrix or not.
 */

public class MarkovMatrix
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates a 3x3 matrix(2-D array).
		double[][] matrix = new double[3][3];
		int row = 3, col = 3;

		// Reads in elements of the matrix.
		for (int i = 0; i < row; i++)
		{
			System.out.printf("\nEnter the elements of row %d separated by space: ", i + 1);
			for (int j = 0; j < col; j++)
			{
				matrix[i][j] = input.nextDouble();
			}
			input.nextLine();
		}

		// Checks if the matrix is a Markov matrix.
		boolean check = isMarkovMatrix(matrix);

		// Displays the result.
		if (check == true)
			System.out.printf("\nThis is a Markov matrix.\n\n");
		else
			System.out.print("\nThis isn't a Markov matrix.\n\n");
	}

	/**
	 * Returns true if a matrix is a Markov matrix, else returns false.
	 *
	 * @param matrix The matrix to be checked.
	 * @return true if the matrix is a Markov matrix, else returns false.
	 */
	public static boolean isMarkovMatrix(double[][] matrix)
	{
		for (int i = 0; i < matrix[0].length; i++)
		{
			double sum = 0;

			for (int j = 0; j < matrix.length; j++)
			{
				if (matrix[j][i] > 0)
					sum += matrix[j][i];
				else
					return false;
			}

			if (sum != 1.0)
				return false;
		}
		return true;
	}
}
