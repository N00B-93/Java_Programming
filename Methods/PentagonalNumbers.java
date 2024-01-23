package Methods;

/*
	A pentagonal number is defined as n(3n-1)/2 for 
	n = 1 , 2 , …, and so on. Therefore, the first few numbers are 1, 5, 12, 22, and so on.
	This program creates a function with the header;
			public static int getPentagonalNumber(int n)
	to determine the first 100 pentagonal numbers and displays them 10 each on a line.
*/

public class PentagonalNumbers
{
	public static void main(String... args)
	{
		int lineCounter = 0;

		// Displays the pentagonal equivalent of numbers from 1 to 100.
		System.out.println("\nThe first 100 pentagonal numbers are: ");
		for (int i = 1; i <= 100; i++)
		{
			System.out.printf("%7d", getPentagonalNumber(i));
			lineCounter++;

			if (lineCounter % 10 == 0)
				System.out.println();
		}
		System.out.println();
	}

	
	/**
	 *
	 * Calculates the pentagonal equivalent of a number.
	 * @param number The number whose pentagonal equivalent is to be calculated.
	 *
	 * return The number's pentagonal equivalent.
	 */
	public static int getPentagonalNumber(int number)
	{
		return number * (3 * number - 1) / 2;
	}
}
