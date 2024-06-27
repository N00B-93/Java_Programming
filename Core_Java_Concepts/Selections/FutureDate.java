package Selections;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter an integer for
    today’s day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6). It also prompts
    the user to enter the number of days after today for a future day and displays
    the future day of the week.
 */

public class FutureDate
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		// Reads in the integer values that represents the current day and the number of days elapsed.
		System.out.print("\nEnter today's day: ");
		int today = input.nextInt();
		System.out.print("\nEnter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();

		// Switch-Case block that prints out the day based on the value entered by the user.
		switch (today)
		{
			case 0:
				System.out.print("\nToday is Sunday ");
				break;
			case 1:
				System.out.print("\nToday is Monday ");
				break;
			case 2:
				System.out.print("\nToday is Tuesday ");
				break;
			case 3:
				System.out.print("\nToday is Wednesday ");
				break;
			case 4:
				System.out.print("\nToday is Thursday ");
				break;
			case 5:
				System.out.print("\nToday is Friday ");
				break;
			case 6:
				System.out.print("\nToday is Saturday ");
				break;
		}

		// Calculates the future day.
		int futureDay = daysElapsed % 7;

		// Switch-Case block that prints out the future day.
		switch (today + futureDay)
		{
			case 0:
				System.out.println("and the future day is Sunday");
				break;
			case 1:
				System.out.println("and the future day is Monday");
				break;
			case 2:
				System.out.println("and the future day is Tuesday");
				break;
			case 3:
				System.out.println("and the future day is Wednesday");
				break;
			case 4:
				System.out.println("and the future day is Thursday");
				break;
			case 5:
				System.out.println("and the future day is Friday");
				break;
			case 6:
				System.out.println("and the future day is Saturday");
		}
	}
}
