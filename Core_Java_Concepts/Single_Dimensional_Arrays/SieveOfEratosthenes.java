package Single_Dimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
	The Sieve of Eratosthenes is an algorithm that finds all 
	prime numbers up to a given limit, n. It works by creating an array of Booleans, 
	flag, of size n+1, initializing the array to true (assuming every number is a 
	prime number in the beginning), and iteratively traversing the numbers from 2
	to n, setting the values of indices that are multiples of other numbers to false.
	This program uses this algorithm to find all the prime numbers from 2 to a limit
	entered by the user.
*/

public class SieveOfEratosthenes
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Reads in a limit.
		System.out.print("\nEnter a limit: ");
		int limit = input.nextInt();

		int lineCounter = 0;

		// Creates an array of boolean values with size equal to the limit the user specified.
		boolean[] sieve = new boolean[limit + 1];

		// Fills the boolean array with 'true'.
		Arrays.fill(sieve, true);

		// Filters out the non-prime numbers.
		filter(sieve);

		// Displays the prime numbers from 2 to limit.
		System.out.printf("\nThe prime numbers from 2 to %d is: ", limit);
		for (int i = 2; i < sieve.length; i++)
		{
			if (sieve[i])
			{
				System.out.printf("%d ", i);
				lineCounter++;
				if (lineCounter % 10 == 0)
					System.out.println();
			}
		}
		System.out.println();
	}
	
	/**
	 * Set the element at a particular index to false if the index is not prime.
	 *
	 * @param array The array containing an array of boolean values set to true.
	 *
	 */
	public static void filter(boolean[] array)
	{
		for (int i = 2; i < array.length; i++)
		{
			if (!isPrime(i))
				array[i] = false;
		}
	}
	
	/**
	 * Returns true if a number is prime, else returns false.
	 *
	 * @param number The number to be checked.
	 *
	 * @return true if number is prime else false.
	 */
	public static boolean isPrime(int number)
	{
		for (int i = 2; i <= Math.sqrt(number); i++)
		{
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
