package Elementary_Programming;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter his/her first name, last name and age and then
	displays the user's maximum heart rate and target heart rate range.
*/

public class HeartRate
{
	public static void main(String args[])
	{
		// Displays message that describes the program.
		System.out.println("\nThis is a program that calculates the User's Maximum Heart rate and Target heart rate range\n");
		
		// Initializes variables used to store name and age.
		String first_name, last_name;
		int age = 0;
		
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter last name.
		System.out.printf("\nEnter your Last Name: ");
		last_name = input.nextLine();

		// Prompts the user to enter first name.
		System.out.printf("\nEnter your First Name: ");
		first_name = input.nextLine();
		
		// Prompts the user to enter age.
		System.out.printf("\nEnter your Age: ");
		age = input.nextInt();
		
		// Calculates the maximum heartrate, minimum heartrate  and the maximum target heartrate.
		double mhr = 220 - age;
		double max_thr = 0.85 * mhr;
		double min_thr = 0.50 * mhr;
		
		// Displays the result.
		System.out.printf("\n\nFull Name: %s %s\nAge: %d\nMaximum Heart Rate: %f bpm\nTarget Heart Rate Range: %f bpm to %f bpm\n", last_name, first_name, age, mhr, min_thr, max_thr);
	}
}

