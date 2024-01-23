package Loops;

/*
	This program displays the triangular pattern:
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6
	in the console.
*/

public class TriangularPattern1
{
	public static void main(String... args)
	{
		for (int row = 1; row <= 6; row++)
		{
			// Prints a sequence of numbers from number to row.
			for (int number = 1; number <= row; number++)
			{
				System.out.printf("%d ", number);
			}

			// Prints a new line after each row.
			System.out.println();
		}
	}
}
