package Methods;

/*
	 An emirp (prime spelled backward) is a nonpalindromic prime number whose reversal is also a prime.
	 This is program that displays the first 120 emirps,  10 numbers per line, separated by exactly one space.
*/

public class Emirp
{
	public static void main(String[] args)
	{
		int count = 13, lineCounter = 0, reversePrime = 0;

		for (; ; count++)
		{
			
			if (isPrime(count))
			{
				reversePrime = reverseNumber(count);
				if (isPrime(reversePrime))
				{
					System.out.printf("%d ", count);
					lineCounter++;
					if (lineCounter % 10 == 0)
						System.out.println();
				}
			}

			if (lineCounter == 120)
				break;
		}
	}
	
	/**
	 * Returns the reverse of a number.
	 *
	 * @param number The number to be reversed.
	 *
	 * @return The reversed number.
	 */
	public static int reverseNumber(int number)
	{
		int remainder = 0, reverse = 0;

		while (number != 0)
		{
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
		}

		return reverse;
	}
	
	/**
	 * Checks whether an integer is prime or not.
	 *
	 * @param number The number to be checked.
	 *
	 * @return true if the integer is prime, else false.
	 */
	public static boolean isPrime(int number)
	{

		for (int count = 2; count <= Math.sqrt(number); count++)
		{
			if (number % count == 0)
				return false;
		}

		return true;
	}
}

