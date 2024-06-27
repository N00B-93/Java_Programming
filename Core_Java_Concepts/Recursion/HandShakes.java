package Recursion;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
	This is a program that prompts the user to enter the number of person(s) in a room and the determines
	the number of handshakes exchange for that amount of person(s) using recursion.
*/

public class HandShakes
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		while (true)
		{
			try
			{
				// Prompts the user to enter the number of persons in the room.
				System.out.print("\nEnter the number of person(s) in the room: ");
				int numberOfPeople = input.nextInt();

				// Display an error message if the user input is invalid.
				if (numberOfPeople < 1)
				{
					System.out.println("\nInvalid input, Number of person(s) should be greater than or equal to 1.");
					continue;
				}
				
				// Displays the number of handshakes.
				System.out.printf("\nThe number of handshakes for %d person(s) is: %d\n", numberOfPeople, numberOfHandShakes(numberOfPeople));
				break;
			}
			catch (InputMismatchException inputMismatchException)
			{
				System.out.println("Invalid input, Try again");
				input.nextLine();
			}
		}
	}
	
	/**
	 * This return the number of hand shakes for a certain number of people in a room using recursion.
	 * @param numberOfPeople The number of person(s) in the room.
	 * @return The number of handshakes for a given number of person(s).
	 */
	public static int numberOfHandShakes(int numberOfPeople)
	{
		if (numberOfPeople == 1)
			return 0;
		return (numberOfPeople - 1) + numberOfHandShakes(numberOfPeople - 1);
	}
}
