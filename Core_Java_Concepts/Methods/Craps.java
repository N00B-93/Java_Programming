package Core_Java_Concepts.Methods;

import java.util.Scanner;

/*
	This is a program that simulates a 
	popular Casino gambling game known as 'CRAPS'.
	If the user rolls 2 or 3 or 12 on the first roll, it is known CRAP and the user loses.
	If the user rolls 7 or 11 on the first roll, it is known as NATURAL and the user wins.
	If the user rolls any other number between 1 and 12, a point is established and the user will continue
	to roll the dice till a 7(loss) is rolled or the user rolls his/her point(win).
*/

public class Craps
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		// Prompts the user to roll the die.
		System.out.print("\nPress 'y' to roll die and 'n' to quit: ");
		char choice = input.next().charAt(0);
		if (choice == 'y')
		{
			// Rolls the dice
			int point = roll();

			if (point == 2 || point == 3 || point == 12)
			{
				// Inform the user that he/she loses if he/she rolls 2, 3 or 12 and exits the game.
				System.out.printf("\nCRAPS!!!\nYou rolled %d\nYOU LOSE!!!\n", point);
				System.exit(0);
			}
			else if (point == 7 || point == 11)
			{
				// Informs the user that he/she wins if he/she rolls 7 or 11 and exits the game.
				System.out.printf("\nNATURAL!!!\nYou rolled %d\nYOU WIN!!!\n", point);
				System.exit(0);
			}
			else
				// Establishes a point if the user rolled another value.
				System.out.printf("\nYou rolled %d\nYour point is: %d\n", point, point);
			// Continues to roll the dice until the user rolls his/her point(win) or rolls 7(loss).
			while (true)
			{
				// Prompts the user to roll again if he/she didn't win or lose on the first roll.
				System.out.printf("\nPress 'y' to roll die and 'n' to quit: ");
				choice = input.next().charAt(0);
				if (!(choice == 'y'))
					break;

				int newPoint = roll();

				if (point == newPoint)
				{
						System.out.printf("\nYou rolled %d, YOU WIN!!!\n", newPoint);
						break;
				}
				else if (newPoint == 7)
				{	System.out.printf("\nYou rolled %d, YOU LOSE!!!\n", newPoint);
					break;
				}
				else
					System.out.printf("\nYou rolled %d\n", newPoint);
			}
		}
		else
			System.exit(1);
	}

	/**
	 * Returns the sum of two randomly generated numbers in the range 1 to 6 that 
	 * represents the roll of two die.
	 *
	 * @return The sum of two numbers in the range 1 to 6.
	 */
	public static int roll()
	{
		int die1 = (int) (1 + Math.random() * 6);
		int die2 = (int) (1 + Math.random() * 6);
		return die1 + die2;
	}
}
