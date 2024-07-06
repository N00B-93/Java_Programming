package Core_Java_Concepts.Loops;

import java.util.Random;
import java.util.Scanner;

/*
	A slot machine is a gambling device that the user inserts money into and then pulls a lever
	(or presses a button). The slot machine then displays a set of random images. If two or more
	of the images match, the user wins an amount of money that the slot machine dispenses
	back to the user.

	This program simulates a Slot machine by doing the following;
	• Asks the user to enter the amount of money he or she wants to enter into the slot machine.

	• Instead of displaying images, the program will randomly select a word from the
	following list:
	Cherries, Oranges, Plums, Bells, Melons, Bars
		To select a word, the program can generate a random number in the range of 0
	through 5. If the number is 0, the selected word is Cherries; if the number is 1, the
	selected word is Oranges; and so forth. The program should randomly select a word
	from this list three times and display all three of the words.

	• If none of the randomly selected words match, the program will inform the user that
	he or she has won $0. If two of the words match, the program will inform the user
	that he or she has won two times the amount entered. If three of the words match, the
	program will inform the user that he or she has won three times the amount entered.

	• The program will ask whether the user wants to play again. If so, these steps are
	repeated. If not, the program displays the total amount of money entered into the slot
	machine and the total amount won.
 */

public class SlotMachine
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates a Random Object.
		Random random = new Random();

		// Creates a list of words to be displayed instead of images as in a normal slot machine.
		String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};

		// Creates variables to hold the amount of money entered into the machine and the amount of money won by players.
		double amountOfMoneyInMachine = 0, amountWon = 0;

		// Prompts the user to enter how much he/she wants to bet.
		System.out.printf("\nPlease enter your bet: $ ");
		double bet = input.nextDouble();

		// Puts the players bet in the machine.
		amountOfMoneyInMachine += bet;

		while (true)
		{
			// Array to simulate the reel of a slot machine.
			String[] reel = new String[3];

			// Prompts the user to enter a key to simulate pulling a slot machine handle.
			System.out.printf("\nPress any key to pull machine handle: ");
			input.next();

			System.out.println("\nSpinning Reel...");

			// Simulates spinning a 3-faced reel.
			for (int i = 0; i < reel.length; ++i)
			{
				reel[i] = words[random.nextInt(0, 6)];
			}
			// Displays the words on the reel.
			System.out.printf("\n\tYou Played:\n\t%s\t%s\t%s\n", reel[0], reel[1], reel[2]);

			// Check if all faces on the reel are the same.
			if (reel[0].equals(reel[1]) && reel[1].equals(reel[2]))
			{
				// Displays a message informing the player that he/she has won the game.
				System.out.printf("\nJackpot!!!\nYou win $ %.2f\n", bet * 3);
				amountWon += bet * 3;
			}
			else if (reel[0].equals(reel[1]) || reel[1].equals(reel[2]) || reel[0].equals(reel[2]))  // Checks if two faces of the reel is the same.
			{
				// Displays a message informing the player that he/she has won the game.
				System.out.printf("\nJackpot!!!\nYou win $ %.2f\n", bet * 2);
				amountWon += bet * 2;
			}
			else
				// Informs the player that he/she lost the game.
				System.out.printf("\nSorry, No Match!\nYou won $ 0.0\n");

			// Asks the player if he/she wants to continue the game.
			System.out.printf("\nWould you like to play again('y' or 'n')? ");
			String choice = input.next();

			if (choice.equalsIgnoreCase("y"))
			{
				// Reads in a new bet and increase the money in the machine by the new bet.
				System.out.printf("\nPlease enter your bet: $ ");
				bet = input.nextDouble();
				amountOfMoneyInMachine += bet;
			}
			else
			{
				// Exits the game.
				System.out.println("\nThanks for playing!!");
				break;
			}
		}
		// Displays the money in the machine and the amount won by the player.
		System.out.printf("\nAmount of money in Machine: $ %.2f\nAmount won by player: %.2f\n", amountOfMoneyInMachine,
				amountWon);
	}
}
