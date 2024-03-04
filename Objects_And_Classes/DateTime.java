package Objects_And_Classes;

import java.util.Date;

public class DateTime
{
	public static void main(String args[])
	{
		// Creates a Date Object.
		Date date = new Date();

		// Set the time elapsed to 100000000.
		date.setTime(100_000_000);

		// Displays the date of the time elapsed as a String.
		System.out.println(date.toString());
	}
}
