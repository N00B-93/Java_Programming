package Core_Java_Concepts.Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that allows a user to enter the last name of a candidate and the number of votes received by that candidate and then displays
	the % of votes obtained by each candidate and the winner of the election.
*/

public class VoteCount
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);

		// Creates an array of Strings to store candidates names.
		String[] lastNames = new String[5];

		// Creates an array of integers to store candidates votes.
		int[] votes = new int[5];

		// Variable to hold the total votes.
		int totalVotes = 0;

		// Reads in each candidate's last name and vote scored.
		for (int i = 0; i < 5; i++)
		{
			System.out.print("\nEnter candidate's last name: ");
			lastNames[i] = console.nextLine();

			System.out.printf("\nEnter vote scored by %s: ", lastNames[i]);
			votes[i] = console.nextInt();
			
			// Checks if the user entered a valid vote.
			if (votes[i] < 0)
			{
				System.out.println("\nError: Votes must be non-negative, Try again.");
				i--;
				console.nextLine();
				continue;
			}

			totalVotes += votes[i];

			console.nextLine();
		}
		
		// Displays the candidate's last name, vote obtained and % of total votes.
		System.out.println("\nCandidate\t\tVoted Scored\t\t% of total cotes");
		for (int i = 0; i < lastNames.length; i++)
		{
			double percentOfVoteScored = ((double) votes[i] / totalVotes) * 100.0;
			System.out.printf("%-30s%-30d%-20.2f\n", lastNames[i], votes[i], percentOfVoteScored);
		}
		
		// Displays the total votes.
		System.out.printf("\nTotal votes: %d\n", totalVotes);

		// Displays the winner of the election.
		System.out.printf("\nThe winner of the election is: %s\n", lastNames[getMaxIndex(votes)]);
	}
	
	/**
	 * This returns the index of the largest element in an array of integers.
	 *
	 * @param array The array to be processed.
	 *
	 * @return Index of the largest element.
	 */
	public static int getMaxIndex(int[] array)
	{
		int maxIndex = 0, max = array[0];

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > max)
				maxIndex = i;
		}
		return maxIndex;
	}
}

