package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter the
    minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
 */

public class YearsAndDays
{
    public static void main(String[] args)
    {
        // Constants to hold the value of the number of minutes in a year and in a day.
        final int NUMBER_OF_MINUTES_IN_YEAR = 525_600, NUMBER_OF_MINUTES_IN_DAY = 1_440;

        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the Minutes.
        System.out.print("\nEnter the number of minutes: ");
        int minutes = input.nextInt();

        // Calculates the Years
        int years = minutes / NUMBER_OF_MINUTES_IN_YEAR;

        // Calculates the Days.
        int days = minutes % NUMBER_OF_MINUTES_IN_YEAR / NUMBER_OF_MINUTES_IN_DAY;

        // Displays the result.
        System.out.printf("\n%d minutes is approximately %d years %d days\n", minutes, years, days);
    }
}
