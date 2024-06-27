package Methods;

import java.util.Scanner;

/*	This is a program that uses a method with the following header;
		public static void displayPattern(int n)
	to display the pattern;
		1
		1 2
		1 2 3
		1 2 3 4
		...
		n n-1 ... 1 2 3
	in the console.
*/

public class DisplayPattern
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Reads in the number of rows.
		System.out.print("\nEnter number of rows: ");
		int rows = input.nextInt();
		
		// Displays the pattern.
		displayPattern(rows);
	}
	
	/**
	 * Displays a triangular pattern in the console.
	 *
	 * @param row The number of rows the triangular pattern has.
	 *
	 * @return void.
	 */
	public static void displayPattern(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			// Displays a sequence of numbers from j to i for each run.
			for (int j = 1; j <= i; j++)
				System.out.printf("%d ", j);
			// Displays a newline after each row.
			System.out.println();
		}
	}
}
