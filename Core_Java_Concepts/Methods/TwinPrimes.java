package Core_Java_Concepts.Methods;

/*
	Twin primes are a pair of prime numbers that differ by 2.
	This is a program that prints all the twin primes less than 1200.
*/

public class TwinPrimes
{
	public static void main(String[] args)
	{
		int count1 = 2, count2 = 2;

		for (; ;)
		{
			if (isPrime(count1) && (count1 - count2 == 2))
				System.out.printf("(%d, %d) ", count2, count1);

			if (isPrime(count1))
				count2 = count1;

			if (count1 == 1200)
				break;

			count1++;
		}

		System.out.println();

	}
	
	/**
	 * Checks whether a number is prime or not.
	 *
	 * @param number The number to be checked.
	 *
	 * @return true if the number is prime, else false.
	 */
	public static boolean isPrime(int number)
	{
		int count = 2;

		for (; count <= Math.sqrt(number); count++)
		{
			if (number % count == 0)
				return false;
		}
		return true;
	}
}
