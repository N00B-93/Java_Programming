package Core_Java_Concepts.Loops;

/*
	This is a program that displays the multiplication table from 1 to 10.
*/

public class MultiplicationTable
{
	public static void main(String...args)
	{
		System.out.println("\n\tMultiplication Table from 1 - 10\n");
		for (int i = 1; i <= 10; ++i)
		{
			for (int j = 1; j <= 10; ++j)
				System.out.printf("%4d", i * j);
			System.out.println();
		}
		System.out.println();
	}
}

