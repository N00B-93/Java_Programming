package Core_Java_Concepts.Selections;

import java.util.Random;

/*
	This is a program that randomly generates an integer between 1
	and 12 and displays the English month name January, February, …, December for
	the number 1, 2, …, 12, accordingly.
 */

public class RandomMonth
{
	public static void main(String[] args)
	{
		// Creates a Random Object.
		Random rand = new Random();

		// Generates a random number between 1 - 12.
		int month = 1 + (rand.nextInt(12 - 1 + 1));

		// Switch-case block that prints the month based on the number generated.
		switch (month)
		{
			case 1:
				System.out.println("\nJanuary");
				break;
			case 2:
				System.out.println("\nFebruary");
				break;
			case 3:
				System.out.println("\nMarch");
				break;
			case 4:
				System.out.println("\nApril");
				break;
			case 5:
				System.out.println("\nMay");
				break;
			case 6:
				System.out.println("\nJune");
				break;
			case 7:
				System.out.println("\nJuly");
				break;
			case 8:
				System.out.println("\nAugust");
				break;
			case 9:
				System.out.println("\nSeptember");
				break;
			case 10:
				System.out.println("\nOctober");
				break;
			case 11:
				System.out.println("\nNovember");
				break;
			case 12:
				System.out.println("\nDecember");
		}
	}
}
