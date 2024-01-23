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
			for ( int number = 1; number <= row; number++)
			{
				System.out.printf("%d ", number);

public class TrianglePattern1
{
	public static void main(String... args)
	{
		int a = 0, b = 0;

		for (a = 1; a <= 6; a++)
		{
			for (b = 1; b <= a; b++)
			{
				System.out.printf("%d ", b);
			}
			System.out.print("\n");
		}
	}
}

