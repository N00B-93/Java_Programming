package Core_Java_Concepts.Selections;

import java.util.Scanner;

/**
    This is a program that prompts the user to enter
    the month and year and displays the number of days in the month.
 */

public class NumberOfDaysInAMonth
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner console = new Scanner(System.in);

        // Prompts the user to enter a month.
        System.out.printf("\nEnter a month(e.g., Jan): ");
        String month = console.nextLine();

        // Displays an error message and terminates the program if the user enters an invalid month.
        if (month.length() != 3 || (!Character.isUpperCase(month.charAt(0))))
        {
            System.out.println("\nError: Month must be 3 characters long and first letter must be capitalized, Try again.\n");
            System.exit(2);
        }

        // Prompts the user to enter the year.
        System.out.printf("\nEnter the year(e.g., 2008): ");
        int year = console.nextInt();

        // Displays an error message and terminates the program if the user enters an invalid year.
        if (year <= 0)
        {
            System.out.println("Error: Year must be > 0, Try again.");
            System.exit(1);
        }

        // Displays the number of days in a month.
        switch (month)
        {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                System.out.printf("\n%s %d has 31 days.\n", month, year);
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                System.out.printf("\n%s %d has 30 days.\n", month, year);
                break;
            case "Feb":
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                    System.out.printf("\n%s %d has 29 days.\n", month, year);
                else
                    System.out.printf("\n%s %d has 28 days.\n", month, year);
                break;
        }
    }
}
