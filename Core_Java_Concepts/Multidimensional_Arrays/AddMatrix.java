package Multidimensional_Arrays;

import java.util.Scanner;

/*
	    This is a program that uses a method with the header;
                public static double[][] addMatrix(double[][] mat1, double[][] mat2)
    	to calculate the sum of two 3x3 matrices.
 */

public class AddMatrix
{
	public static void main(String[] args)
	{
		// Creates three 2-D arrays.
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] total = new double[3][3];

		// Reads in elements of the first array(matrix).
		System.out.println("\n\t\tMatrix 1");
		matrix1 = readMatrix();

		// Reads in elements of the second array(matrix).
		System.out.println("\n\t\tMatrix 2");
		matrix2 = readMatrix();

		// determines the sum of matrix1 and matrix2.
		total = addMatrix(matrix1, matrix2);

		// Displays the result.
		System.out.println("\nThe sum of the two matrix is: ");
		for (int i = 0; i < 3; ++i)
		{
			for (int j = 0; j < 3; ++j)
				System.out.printf("%.2f\t", total[i][j]);
			System.out.println();
		}
	}

	/**
	 * returns the sum of the elements of two matrix.
	 *
	 * @param mat1 The first matrix.
	 * @param mat2 The second matrix.
	 * @return The sum of the elements of the first and second matrix.
	 */
	public static double[][] addMatrix(double mat1[][], double mat2[][])
	{
		double sum[][] = new double[3][3];

		for (int i = 0; i < mat1.length; i++)
		{
			for (int j = 0; j < mat1[0].length; j++)
			{
				sum[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		return sum;
	}

	public static double[][] readMatrix()
	{
		double[][] matrix = new double[3][3];

		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; i++)
		{
			System.out.printf("\nEnter the three elements of row %d separated by space: ", i + 1);
			for (int j = 0; j < 3; j++)
			{
				matrix[i][j] = input.nextDouble();
			}
			// Absorbs any other input apart from the required 3 elements to be entered.
			input.nextLine();
		}
		return matrix;
	}
}
