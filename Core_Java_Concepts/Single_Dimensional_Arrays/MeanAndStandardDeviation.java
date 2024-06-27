package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that calculates the mean and standard deviation of numbers using two methods with headers;
				public static double deviation(double[] x)

				public static double mean(double[] x)
 */

public class MeanAndStandardDeviation
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates an array of 10 doubles.
		double[] number = new double[10];

		// Reads in numbers into the array.
		for (int count = 0; count < 10; count++)
		{
			System.out.printf("\nEnter number[%d]: ", count);
			number[count] = input.nextDouble();
		}

		// Determines and displays the mean.
		System.out.printf("\nThe mean is: %.2f\n", mean(number));

		// Determines and displays the standard deviation.
		System.out.printf("\nThe standard deviation is: %.4f\n", deviation(number));
	}

	/**
	 * Determines the mean of an array of numbers.
	 *
	 * @param arr The array of an array of numbers.
	 * @return The mean of the numbers.
	 */
	public static double mean(double[] arr)
	{
		double sum = 0;

		for (int count = 0; count < arr.length; count++)
			sum += arr[count];

		double average = sum / arr.length;

		return (average);
	}

	/**
	 * Determines the standard deviation of an array of numbers.
	 *
	 * @param arr The array of numbers.
	 * @return The standard deviation.
	 */
	public static double deviation(double[] arr)
	{
		double average = mean(arr), sum = 0;

		for (int count = 0; count < arr.length; count++)
			sum += Math.pow((arr[count] - average), 2);

		double variance = sum / (arr.length - 1);
		double deviation = Math.pow(variance, 0.5);

		return deviation;
	}

}
