package Core_Java_Concepts.Methods;

/*	This is a program that displays the number of days in a year from 2014 to 2034
	in tabular form using a function with the header;
			public static int numberOfDaysInAYear(int year)
*/

public class NumberOfDaysInAYear
{
	public static void main(String... args)
	{
		System.out.print("\nYear\t\tNumber Of Days\n");
		System.out.print("------------------------------\n");
		for (int year = 2014; year <= 2034; year++)
			System.out.printf("%d\t\t%14d\n", year, numberOfDaysInAYear(year));
	}
	
	/**
	 * Returns the number of days in a year based on whether the year is leap or not.
	 *
	 * @param year The year whose number of days is to be determined.
	 *
	 * @return The number of days in the year.
	 */
	public static int numberOfDaysInAYear(int year)
	{
		if (year % 4 == 0 || year % 400 == 0)
			return 366;
		return 365;
	}
}
