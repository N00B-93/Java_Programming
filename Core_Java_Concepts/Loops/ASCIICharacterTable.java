package Loops;

/*
	This is a program that prints the characters in
	the ASCII character table from ! to ~. 10 characters are displayed per line
	and each character is separated by a single space.
*/

public class ASCIICharacterTable
{
	public static void main(String... args)
	{
		// Initializes the lineCounter variable used to control the number of lines printed.
		int lineCounter = 0;

		System.out.println("\n\t\tASCII CHARACTER TABLE.");
		for (int i = 33; i <= 126; i++)
		{
			System.out.printf("%c ", i);
			lineCounter++;

			if (lineCounter % 10 == 0)
				System.out.println();
		}
		System.out.println();
	}
}

