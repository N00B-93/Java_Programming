package Core_Java_Concepts.Selections;

import java.util.Scanner;

public class DayOfTheWeek
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);
		
		// Prompts the user to enter the year.
		System.out.print("\nEnter the year(e.g., 2005): ");
		int year = console.nextInt();

		// Prompts the user to enter an integer representing the current month.
		System.out.print("\nEnter an integer(1 - 12) representing the current month: ");
		int m = console.nextInt();

		if (m == 1)
			m = 13;
		else if (m == 2)
			m = 14;

		// Prompts the user to enter an integer representing the current day of the month.
		System.out.print("\nEnter an integer(1 - 31) representing the day of the month: ");
		int q = console.nextInt();

		int j = year / 100;

		int k = year % 100;

		int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

		
		System.out.printf("\nThe day of the week is: %d\n", h);
	}
}

