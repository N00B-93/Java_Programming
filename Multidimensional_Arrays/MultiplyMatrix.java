package Multidimensional_Arrays;

import java.util.Scanner;

/*
	    This is a program that uses a function with the header;
                public static double[][] multiplyMatrix(double mat1[][], double mat2[][])
    	to calculate the product of two 3x3 matrices entered by the user.
 */

public class MultiplyMatrix
{
	// Creates a Scanner Object.
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		// Creates three 2-D array(3x3 matrix) Objects
		double[][] matrixA = new double[3][3];
		double[][] matrixB = new double[3][3];
		double[][] matrixC;

		// Reads in the element of the first matrix.
		System.out.println("\n\t\tMatrixA");
		 fillArray(matrixA);

		// Reads in the elements of the second matrix.
		System.out.println("\n\t\tMatrixB");
		fillArray(matrixB);

		// Determines the product of the two matrix.
		matrixC = multiplyMatrix(matrixA, matrixB);

		// Displays the result.
		System.out.println("\nThe product of MatrixA and MatrixB is: ");

		for (int i = 0; i < matrixA.length; i++)
		{
			for (int j = 0; j < matrixA[0].length; j++)
			{
				System.out.printf("%.2f\t", matrixC[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * Returns a 2-D list containing the product of two 3x3 matrices.
	 *
	 * @param mat1 The first matrix
	 * @param mat2 The second matrix
	 * @return The product of the two matrices.
	 */
	public static double[][] multiplyMatrix(double[][] mat1, double[][] mat2)
	{
		double[][] mat3 = new double[3][3];

		for (int row = 0; row < mat1.length; row++)
		{
			int k = 0;

			for (int col = 0; col < mat1.length; col++)
			{
				mat3[row][col] = mat1[row][k] * mat2[k][col] + mat1[row][k + 1] * mat2[k + 1][col] +
						mat1[row][k + 2] * mat2[k + 2][col];
			}
		}
		return mat3;
	}

	/**
	 * Fills an array with values entered by the users.
	 *
	 * @param array The array to be populated with values.
	 */
	public static void fillArray(double[][] array)
	{
		for (int row = 0; row < array.length; row++)
		{
			System.out.printf("\nEnter the three elements of row %d separated by space: ", row);
			for (int col = 0; col < array.length; col++)
				array[row][col] = input.nextInt();
			input.nextLine();
		}
	}
}
