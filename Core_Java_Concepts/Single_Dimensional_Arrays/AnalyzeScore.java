package Core_Java_Concepts.Single_Dimensional_Arrays;

/*
	This is a program that takes in 10 scores as command line arguments and
	determines how many scores are above or equal to the average and how many
	scores are below the average.
 */

public class AnalyzeScore
{
	public static void main(String[] args)
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
        for (double number : numbers)
		{
            if (number > average)
                count1++;
            else if (number < average)
                count2++;
            else if (number == average)
                count3++;
        }

		// Displays the result.
		System.out.printf("""

                        The average Score is: %.2f

                        The number of Score above average is: %d

                        The number of \
                        Score below average is: %d

                        The number of Score equal to average is: %d

                        """,
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

        for (double v : array)
            total += v;

		return ((double)total / array.length);
	}
}
