package Loops;

/*
	This is a program that displays

						123456
 			 			 12345
                          1234
                           123
                            12
                             1
    triangular pattern in the console.
 */

public class TriangularPattern3
{
	public static void main(String... args)
	{
		for (int count1 = 6; count1 >= 1; count1--)
		{
			// Prints count2 - count1 spaces(s).
			for (int count2 = 6; count2 > count1; count2--)
			{
				System.out.print(" ");
			}

			// Prints number from count3 to count1.
			for (int count3 = 1; count3 <= count1; count3++)
			{
				System.out.printf("%d", count3);
			}

			// Displays a new line after each row.
			System.out.println();
		}
	}
}
