package Core_Java_Concepts.Loops;

/*	This is a program that displays the leap years between 101 and 2100 separated by a single space
	and 10 years each per line.
	The program also display the number of leap years between from 101 to 2100.
*/

public class LeapYears
{
	public static void main(String... args)
	{
		// Initializes the lineCount and leapYearCounter variable to  0.
		int lineCount = 1, leapYearCounter = 0, START = 101, END = 2100;

		System.out.printf("\nThe leap years from %d to %d are:\n", START, END);
		for (int year = START; year <= END; year++)
		{
			// Display a year if its leap.
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
			{
				System.out.printf("%d ", year);
				leapYearCounter++;
				// Prints a newline if lineCounter is a multiple of 10.
				if (lineCount % 10 == 0)
					System.out.print("\n");
			}
			else
				continue;

			// Increments the lineCounter variable by 1.
			lineCount++;
		}
		// Displays the number of leap years from 101 to 2100.
		System.out.printf("\n\nThe number of leap years from 101 to 2100 is: %d\n", leapYearCounter);
	}
}
