package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter 10 elements of an integer array and uses a method with the header;
				public static double min(double[] array)
	to return the minimum element in the array.
 */

public class MinimumValue
{
	public static void main(String args[])
	{
		// Creates a Scanner Object
		Scanner input = new Scanner(System.in);

		int count = 0;

		// Creates an array of 10 doubles.
		double[] number = new double[10];

		// Reads in 10 doubles into the array.
		while (count < 10)
		{
			System.out.printf("\nEnter number[%d]: ", count);
			number[count] = input.nextDouble();
			count++;
		}

		// Displays the result.
		System.out.printf("\nThe minimum element is: %.2f\n", min(number));
	}

	/**
	 * Returns the smallest element of an array.
	 *
	 * @param numberList The array whose minimum value is to be determined.
	 * @return The minimum element in an array of doubles.
	 */
	public static double min(double[] numberList)
	{
		double minimum = numberList[0];

		for (int count = 0; count < numberList.length; count++)
		{
			if (minimum > numberList[count])
				minimum = numberList[count];
		}
		return minimum;
	}
}
