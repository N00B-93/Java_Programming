package Core_Java_Concepts.Methods;

/*
	This program calculates the sum of the series;
			m(i) = 1/3 + 2/4 + ... + i/i+2
	for i = 1, 2, 3, ..., 20
	and displays the result in a tabular form.
*/

public class SumOfSeries
{
	public static void main(String... args)
	{
		System.out.println("i\t\tm(i)");

		for (int i = 1; i <= 20; i++)
			System.out.printf("%d\t\t%.4f\n", i, sumOfSeries(i));
	}

	/**
	 * Return the sum of a series for a given range.
	 *
	 * @param numberOfTerms The number of terms to be calculated.
	 *
	 * @return The sum of a series up to the given limit.
	 */
	public static double sumOfSeries(int numberOfTerms)
	{
		double series = 0;

		for (int i = 1; i <= numberOfTerms; i++)
			series += i / (double)(i + 2);
		return series;
	}
}
