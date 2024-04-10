package Multidimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that uses a function with the header;                
			def linearEquation(a, b)               to solve the 2x2 system of linear equation given below;
                	a00x + a01y = b0
			a10x + a11y = b1
*/

public class LinearEquation
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter the coefficients of the linear equation.
		System.out.printf("\nEnter the values of a00, a01, b0 separated by space: ");
		double a00 = input.nextDouble();
		double a01 = input.nextDouble();
		double b0 = input.nextDouble();

		input.nextLine();  // Input statement to consume any other entered by the user.

		System.out.printf("\nEnter the values of a10, a11, b1 separated by space: ");
		double a10 = input.nextDouble();
		double a11 = input.nextDouble();
		double b1 = input.nextDouble();
		
		// Creates 2 array objects to store the coefficients of the linear equation.
		double[][] a = {{a00, a01}, {a10, a11}};
		double b[] = {b0, b1};
		
		// Determines and displays the solution of the linear equation.
		if (linearEquation(a, b) == null)
			System.out.println("\nThe equation has no roots.");
		else
		{
			double[] result = linearEquation(a, b);
			System.out.printf("\nThe roots are: %.2f, %.2f\n", result[0], result[1]);
		}
	}
		
		/**
		 * Solves a system of linear equations of the form Ax = B.
		 *
		 * @param a Coefficient matrix A. where each inner array represent a row.
		 * @param b Constant vector B.
		 *
		 * @return null if the system is inconsistent or an array if the system has a unique solution.
		 */
		public static double[] linearEquation(double a[][], double b[])
		{
			double x, y;
			double denominator = a[0][0] * a[1][1] - a[1][0] * a[0][1];

			if (denominator == 0)
				return null;
			else
			{
				x = (b[0] * a[1][1] - b[1] * a[0][1]) / denominator;
				y = (a[0][0] * b[1] - a[1][0] * b[0]) / denominator;
			}
			double result[] = {x, y};
			return result;
		}
}

