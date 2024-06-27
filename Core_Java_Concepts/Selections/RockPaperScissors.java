package Selections;

import java.util.Scanner;
import java.util.Random;

/*
	This is a program that plays the popular scissor-rock-paper
	game. (Scissors can cut a paper, a rock can knock scissors, and a paper can
	wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
	scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
	2 and displays a message indicating whether the user or the computer wins, loses,
	or draws.
 */

public class RockPaperScissors
{
	public static void main(String[] args)
	{
		// Creates a Random Object.
		Random rand = new Random();

		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Display the name of the game.
		System.out.print("\t\tROCK, PAPER, SCISSORS\n\n");

		// Reads in the players choice.
		System.out.print("\nPlayer plays: ");
		String player = input.nextLine().toLowerCase();

		// Checks if player enters anything other than 'rock', 'paper', 'scissors' and exits the program if true.
		if (!(player.equalsIgnoreCase("rock") || player.equalsIgnoreCase("paper")
				|| player.equalsIgnoreCase("scissors")))
		{
			System.out.println("\nInvalid Input!!");
			System.exit (0);
		}

		// Closes the Scanner Object.
		input.close();

		// Initializes COM choice with an empty string.
		String COM = "";

		// Randomly generates a number and assigns a choice for COM based on the number using an advanced Switch-Case block.
		int option = rand.nextInt(3);
        COM = switch (option)
		{
            case 0 -> "rock";
            case 1 -> "paper";
            case 2 -> "scissors";
            default -> COM;
        };

		// Displays COM choice.
		System.out.printf("\nCOM plays: %s\n\n", COM);

		// Displays the winner based on the choice played.
		if (player.equals(COM))
			System.out.println("\nIt's a tie!!!\n\n");
		else if (player.equals("rock") && COM.equals("scissors"))
			System.out.println("\nPlayer Wins!!");
		else if (player.equals("scissors") && COM.equals("rock"))
			System.out.println("\nCOM wins!!");
		else if (player.equals("paper") && COM.equals("rock"))
			System.out.println("\nPlayer Wins!!");
		else if (player.equals("rock") && COM.equals("paper"))
			System.out.println("\nCOM Wins!!");
		else if (player.equals("scissors") && COM.equals("paper"))
			System.out.println("\nPlayer Wins!!");
		else
			System.out.println("\nCOM Wins!!");
	}
}
