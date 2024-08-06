package Core_Java_Concepts.Loops;

/*
	This is a program that displays the triangular pattern;
			1 2 3 4 5 6
			1 2 3 4 5
			1 2 3 4
			1 2 3
			1 2
			1
	in the console.
 */

public class TriangularPattern2
{
	public static void main(String... args)
	{
		int a, b;

		for (a = 6; a >= 1; a--)
		{
			// Prints a sequence of numbers from b to a.
			for (b = 1; b <= a; b++)
				System.out.printf("%d ", b);

			// Prints a new line after each row.
			System.out.print("\n");
		}
	}
}
