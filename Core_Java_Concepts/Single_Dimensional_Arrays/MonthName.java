package Single_Dimensional_Arrays;

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
			System.out.print("\nInvalid input, Enter a nunber from 1 to 12.\n");
			System.exit(1);
		}
		
		// Displays the month based on the user's input.
		switch (monthNumber)
		{
			case 1:
				System.out.printf("\nMonth is: %s\n", months[1]);
				break;
			case 2:
				System.out.printf("\nMonth is: %s\n", months[2]);
				break;
			case 3:
				System.out.printf("\nMonth is: %s\n", months[3]);
				break;
			case 4:
				System.out.printf("\nMonth is: %s\n", months[4]);
				break;
			case 5:
				System.out.printf("\nMonth is: %s\n", months[5]);
				break;
			case 6:
				System.out.printf("\nMonth is: %s\n", months[6]);
				break;
			case 7:
				System.out.printf("\nMonth is: %s\n", months[7]);
				break;
			case 8:
				System.out.printf("\nMonth is: %s\n", months[8]);
				break;
			case 9:
				System.out.printf("\nMonth is: %s\n", months[9]);
				break;
			case 10:
				System.out.printf("\nMonth is: %s\n", months[10]);
				break;
			case 11:
				System.out.printf("\nMonth is: %s\n", months[11]);
				break;
			case 12:
				System.out.printf("\nMonth is: %s\n", months[12]);
				break;
		}
	}
}

