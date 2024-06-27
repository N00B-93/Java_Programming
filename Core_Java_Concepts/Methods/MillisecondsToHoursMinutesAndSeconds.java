package Methods;

import java.util.Scanner;

/*
	This is a program that uses a method with the header;
			public static String convertMillis(long millis)
	to convert the millisecond entered by the user into hours, minutes and seconds in the form hh:mm:ss.
*/

public class MillisecondsToHoursMinutesAndSeconds
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Reads in time in milliseconds.
		System.out.print("\nEnter Milliseconds elapsed: ");
		long milliSeconds = input.nextLong();

		// Converts the milliseconds to hours, minutes and seconds.
		String time = convertMillis(milliSeconds);

		// Displays the result.
		System.out.printf("\n%d converted to Hours, Minutes and Seconds is: %s\n", milliSeconds, time);
	}

	/**
	 * Converts milliseconds to hh:mm:ss format
	 * 
	 * @param milliSeconds The millisecond to convert.
	 *
	 * @return The String representation of the time in hh:mm:ss format.
	 */
	public static String convertMillis(long milliSeconds)
	{
		long totalSeconds = milliSeconds / 1000;
		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;

		long totalHours =  Math.floorDiv(totalMinutes, 60);

		return "" + totalHours + ":" + currentMinute + ":" + currentSecond;
	}
}
