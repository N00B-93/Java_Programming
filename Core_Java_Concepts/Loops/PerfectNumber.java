package Loops;

/*
	A positive integer is called a perfect number if it is equal to
	the sum of all of its positive divisors, excluding itself.
	This program determines and displays all the perfect numbers between 1 and 10000.
*/

public class PerfectNumber
{
	public static void main(String... args)
	{
		int count1, count2;

		for (count1 = 2; count1 <= 10000; count1++)
		{
			// Initializes a variable that holds the sum of positive factors of a number.
			int sum = 0;
			for (count2 = 1; count2 < count1; count2++)
			{
				// Adds a number to the sum variable if it's a factor of count1.
				if (count1 % count2 == 0)
					sum = sum + count2;
			}
			// Displays a number as a perfect number if the sum of all positive factors equals the number.
			if (sum == count1)
				System.out.printf("\n%d is a perfect number\n", count1);
		}
	}
}
