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
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the Minutes.
        System.out.print("\nEnter the number of minutes: ");
        int minutes = input.nextInt();

        // Calculates the Years
        int years = (int) (minutes / 525600);

        // Calculates the Days.
        int days = (int) (minutes % 525600 / 1440);

        // Displays the result.
        System.out.printf("\n%d minutes is approximately %d years %d days\n", minutes, years, days);
    }
}
