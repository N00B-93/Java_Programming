package Objects_And_Classes;

import java.util.GregorianCalendar;

public class GregorianCal
{
	public static void main(String args[])
	{
		// Creates a GregorianCalendar Object.
		GregorianCalendar cal = new GregorianCalendar();

		// Gets the year, day and month.
		int year = cal.get(GregorianCalendar.YEAR);
		int day = cal.get(GregorianCalendar.DAY_OF_MONTH);
		int month = cal.get(GregorianCalendar.MONTH);

		// Displays the current year, month and day.
		System.out.printf("\nThe current date is: %02d:%02d:%02d\n", day, month, year);

		// Sets the time elapsed to 1234567898765ms.
		cal.setTimeInMillis(1234567898765L);

		// Displays the day, month and year for the given elapsed time.
		System.out.printf("\n%02d:%02d:%d\n", cal.get(GregorianCalendar.DAY_OF_MONTH), cal.get(GregorianCalendar.MONTH), cal.get(GregorianCalendar.YEAR));
	}
}
