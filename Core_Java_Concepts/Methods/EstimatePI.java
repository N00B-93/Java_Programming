package Core_Java_Concepts.Methods;

/*
	π can be computed using the following summation;
		m(i) = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1)^i + 1 / 2 * i - 1
	This is a program that uses a method to returns m(i) for a given i, for i in 101, 201, ..., 901.
*/

public class EstimatePI
{
	public static void main(String... args)
	{
		System.out.print("\ni\t\tm(i)\n");
		for (int i = 101; i <= 901; i += 100)
			System.out.printf("%d\t\t%.4f\n", i, computePI(i));
	}

	/**
	 * Computes the value of π for a given range.
	 * @param range The range of value for which the value of π is to be calculated.
	 *
	 * @return The value of π for the given range.
	 */
	public static double computePI(int range)
	{
		double pi = 0;

		for (int i = 1; i <= range; i++)
			pi += 4 * Math.pow(-1, i + 1) / (2 * i - 1);
		return pi;
	}
}
