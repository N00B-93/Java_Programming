package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
	(Science: day of the week) Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of
	the week. The formula is:
						h = (q + (26(m + 1) / 10) + k + (k / 4) + (j / 4) + (5j)) % 7
	where
		■■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, and 6: Friday).
		■■ q is the day of the month.
		■■ m is the month (3: March, 4: April, . . ., 12: December). January and February are counted as months 13 and 14 of the previous year.
		■■ j is year / 100 .
		■■ k is the year of the century (i.e., year % 100).

	 (Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the user input 1 to 13 and 2
	 to 14 for the month and change the year to the previous year. For example, if the user enters 1 for m and 2015 for year, m will
	be 13 and year will be 2014 used in the formula.)
 */

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

		// Validates the day of the month entered by the user.
		if (m < 1 || m > 12)
		{
			System.out.println("\nError: Use a value from 1 - 12 to represent the month, Try again");
			System.exit(1);
		}

		// Reset the value for the month to 13 and 14 respectively if the user enters 1 or 2 for the month and
		// also change the year to the previous year.
		if (m == 1)
		{
			m = 13;
			year -= 1;
		}
		else if (m == 2)
		{
			year -= 1;
			m = 14;
		}

		// Prompts the user to enter an integer representing the current day of the month.
		System.out.print("\nEnter an integer(1 - 31) representing the day of the month: ");
		int q = console.nextInt();

		// Closes the Scanner.
		console.close();

		// Validates the day of the month entered by the user.
		if (q < 1 || q > 31)
		{
			System.out.println("\nError: Use a value from 1 - 31 to represent the day in a month, Try again");
			System.exit(2);
		}

		int j = year / 100;

		// Determines the year of the century.
		int k = year % 100;

		// Calculates the day of the week.
		int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

		// Displays the day of the week based on the calculated value of 'h'.
		switch (h)
		{
			case 0:
				System.out.println("\nThe day of the week is: Saturday");
				break;
			case 1:
				System.out.println("\nThe day of the week is: Sunday");
				break;
			case 2:
				System.out.println("\nThe day of the week is: Monday");
				break;
			case 3:
				System.out.println("\nThe day of the week is: Tuesday");
				break;
			case 4:
				System.out.println("\nThe day of the week is: Wednesday");
				break;
			case 5:
				System.out.println("\nThe day of the week is: Thursday");
				break;
			case 6:
				System.out.println("\nThe day of the week is: Friday");
				break;
		}
	}
}

