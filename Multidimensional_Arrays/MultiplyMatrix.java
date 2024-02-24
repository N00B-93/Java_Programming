package Multidimensional_Arrays;

import java.util.Scanner;

/*
	    This is a program that uses a function with the header;
                public static double[][] multiplyMatrix(double mat1[][], double mat2[][])
    	to calculate the product of two 3x3 matrices entered by the user.
 */

public class MultiplyMatrix
{
	public static void main(String args[])
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		int row = 3, col = 3;

		// Creates three 2-D array(3x3 matrix) Objects
		double[][] matrixA = new double[3][3];
		double[][] matrixB = new double[3][3];
		double[][] matrixC = new double[3][3];

		// Reads in the element of the first matrix.
		System.out.println("\n\t\tMatrixA");
		for (int i = 0; i < row; i++)
		{
			System.out.printf("\nEnter elements of row %d separated by space: ", i + 1);
			for (int j = 0; j < col; j++)
			{
				matrixA[i][j] = input.nextDouble();
			}
		}

		// Reads in the elements of the second matrix.
		System.out.println("\n\t\tMatrixB");
		for (int i = 0; i < row; i++)
		{
			System.out.printf("\nEnter elements of row %d separated by space: ", i + 1);
			for (int j = 0; j < col; j++)
			{
				matrixB[i][j] = input.nextDouble();
			}
		}

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
	public static double[][] multiplyMatrix(double mat1[][], double mat2[][])
	{
		double mat3[][] = new double[3][3];

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
}
