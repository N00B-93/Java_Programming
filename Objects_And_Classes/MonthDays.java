package Objects_And_Classes;

import java.util.Scanner;

/**
 * The type MonthDays
 */
public class MonthDays
{
	// Attributes of a MonthDays Object.
	public int month, year;
	
	/**
	 * Instantiates a new MonthDays Object with a given month and year.
	 *
	 * @param month The current month.
	 * @param year The current year.
	 */
	public MonthDays(int month, int year)
	{
		this.month = month;
		this.year = year;
	}

	public int getNumberOfDays()
	{
		boolean flag;
		int numberOfDays = 0;

		if ((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0)
			flag = true;
		else
			flag = false;

		switch (this.month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numberOfDays = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numberOfDays = 30;
				break;
			case 2:
				if (flag)
					numberOfDays = 29;
				else
					numberOfDays = 28;
				break;
		}
		return numberOfDays;
	}

	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		int month, year;

		while (true)
		{
			// Prompts the user to enter a number from 1 to 12 representing a month.
			System.out.print("\nEnter a number from 1 - 12 representing a month: ");
			month = input.nextInt();

			// Prompts the user to enter a year.
			System.out.print("\nEnter a year(e.g., 2008): ");
			year = input.nextInt();

			// Continues to loop if the year is not in the range 1 - 12.
			if (month >= 1 && month <= 12)
				break;
			else
				System.out.println("\nInvalid Month!!!\nMonth must be in the range 1 - 12.");
		}
		// Creates a MonthDays Object.
		MonthDays monthDays = new MonthDays(month, year);
		System.out.printf("\nNumber of Days: %d\n", monthDays.getNumberOfDays());
	}
}


