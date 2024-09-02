package Core_Java_Concepts.Single_Dimensional_Arrays;

import java.util.Scanner;

/* 
	This is a program that prompts the user to enter an integer between 
	1 and 12 and then displays the name of the month that corresponds to the integer entered by the user.
*/

public class MonthName
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates an array of Strings holding name of months.
		String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

		// Prompts the user to enter a number representing a month.
		System.out.print("\nEnter a number from 1 to 12: ");
		int monthNumber = input.nextInt();
		
		// Terminates the program if the user enters an invalid month.
		if (monthNumber < 1 || monthNumber > 12)
		{
			System.out.print("\nInvalid input, Enter a number from 1 to 12.\n");
			System.exit(1);
		}

		// Displays the month based on the user input.
		System.out.printf("\nMonth is %s\n", months[monthNumber]);
	}
}

