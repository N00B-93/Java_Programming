package Single_Dimensional_Arrays;

/*
	This is a program that takes in 10 scores as command line arguments and
	determines how many scores are above or equal to the average and how many
	scores are below the average.
 */

public class AnalyzeScore
{
	public static void main(String args[])
	{
		// Creates an array that can store 10 floating point numbers.
		double[] numbers = new double[args.length];

		// Counter variables used to count scores below, equal to and above the average.
		int count1 = 0, count2 = 0, count3 = 0;

		// displays a usage message and terminates the program if no command line argument is used.
		if (args.length == 0 || args.length == 1)
		{
			System.out.printf("\nUsage: java AnalyseScore arg1 arg2 arg3...\n\n");
			System.exit(0);
		}

		// Converts the command line arguments to doubles and assigns them to the number array.
		for (int i = 0; i < args.length; i++)
			numbers[i] = Double.parseDouble(args[i]);

		// Determines the average.
		double average = average(numbers);

		// Determines the number of scores below, equal to and above the average.
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] > average)
				count1++;
			else if (numbers[i] < average)
				count2++;
			else if (numbers[i] == average)
				count3++;
		}

		// Displays the result.
		System.out.printf("\nThe average Score is: %.2f\n\nThe number of Score above average is: %d\n\nThe number of " +
				"Score below average is: %d\n\nThe number of Score equal to average is: %d\n\n",
				average, count1, count2, count3);
	}

	/**
	 * Returns the average of an array of floating point numbers.
	 *
	 * @param array The array containing the numbers.
	 * @return The average of the numbers.
	 */
	public static double average(double... array)
	{
		int total = 0;

		for (int i = 0; i < array.length; i++)
		{
			total += array[i];
		}
		return ((double)total / array.length);
	}
}
