package Methods;

/*
	A prime number is called a Mersenne prime if it can be written in the form 2 ^ p - 1 for some positive integer p.
	This is a program that finds all the Mersenne's prime numbers for p <= 127 and displays them in tabular form.
*/

public class MersennePrimes
{
	public static void main(String arg[])
	{
		long number = 0, count = 2;
		int count1 = 0;

		System.out.print("\n\t\tMersenne's Primes.\n\n");
		System.out.print("\np\t\t\t2^p - 1\n");
		System.out.print("--------------------------------------------------\n");
		for (; ;)
		{
			if (isPrime(count))
			{
				number = (long)(Math.pow(2, count)) - 1;
				System.out.printf("%d\t\t\t%d\n", count, number);
				count1++;
			}

			if (count1 == 31)
				break;
			count++;
		}
	}

	/**
	 * Checks whether a number is prime or not.
	 *
	 * @param number The number to be checked.
	 *
	 * @return true if the number is prime, else false.
	 */
	public static boolean isPrime(long number)
	{

		for (long count = 2; count <= Math.sqrt(number); count++)
		{
			if (number % count == 0)
				return false;
		}
		return true;
	}
}
