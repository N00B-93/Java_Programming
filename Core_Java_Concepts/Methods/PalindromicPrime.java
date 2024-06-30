package Core_Java_Concepts.Methods;

/*
	A palindromic prime is a prime number and also palindromic.
	This is a program that displays the first 120 palindromic prime numbers separated by exactly one space and 10 on a line.
*/

public class PalindromicPrime
{
	public static void main(String[] args)
	{
		int count = 2, lineCounter = 0;

		for (; ;)
		{

			if (isPalindrome(count) && isPrime(count))
			{
				// Displays a number if it is a palindrome and prime.
				System.out.printf("%d ", count);
				lineCounter++;
			
				// Displays a newline if lineCounter is a multiple of 10.
				if (lineCounter % 10 == 0)
					System.out.print("\n");
			}
			// Breaks out of the loop if count1 is 100.
			if (lineCounter == 100)
				break;
			count++;
		}
	}

	/**
	 * Checks if a number is a Palindrome.
	 *
	 * @param number The number to be checked.
	 *
	 * @return true if the number is a Palindrome, else false.
	 */
	public static boolean isPalindrome(int number)
	{
		int tempVar, remainder, reverse = 0;

		tempVar = number;

		while (number != 0)
		{
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
		}

		return tempVar == reverse;
	}

	/**
	 * Checks whether a number is Prime.
	 *
	 * @param number The number to be checked.
	 *
	 * @return true if the number is Prime, else false.
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

