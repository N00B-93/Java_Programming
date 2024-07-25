package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter his/her first name, last name and age and then
	displays the user's maximum heart rate and target heart rate range.
*/

public class HeartRate
{
	public static void main(String... args)
	{
		// Displays message that describes the program.
		System.out.println("\nThis is a program that calculates the User's Maximum Heart rate and Target heart rate range");
		
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter last name.
		System.out.printf("\nEnter your Last Name: ");
		String last_name = input.nextLine();

		// Prompts the user to enter first name.
		System.out.printf("\nEnter your First Name: ");
		String first_name = input.nextLine();
		
		// Prompts the user to enter age.
		System.out.printf("\nEnter your Age: ");
		int age = input.nextInt();
		
		// Calculates the maximum heart rate, minimum heart rate  and the maximum target heart rate.
		double mhr = 220 - age;
		double max_thr = 0.85 * mhr;
		double min_thr = 0.50 * mhr;
		
		// Displays the result.
		System.out.printf("\n\nFull Name: %s %s\nAge: %d\nMaximum Heart Rate: %.2f bpm\nTarget Heart Rate Range: %.2f bpm to %.2f bpm\n",
				last_name, first_name, age, mhr, min_thr, max_thr);
	}
}

