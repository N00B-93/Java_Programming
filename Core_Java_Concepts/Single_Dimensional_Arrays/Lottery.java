package Core_Java_Concepts.Single_Dimensional_Arrays;

import java.util.Scanner;
import java.util.Random;

/*
	This is a program that prompts the user to enter a list of five integers in the range 0 to 9 and then randomly
	generates five integers from 0 to 9 to represent lottery numbers. The program then checks the number of the user
	input that matches the lottery number. If all the user's number matches the lottery numbers, a message is displayed
	indicating that the user has won the lottery.
 */

public class Lottery
{
	// Attribute of the Lottery class.
	protected int[] lotteryNumbers = new int[5];

	/**
	 * Instantiates a new Lottery object with an array of randomly generated numbers.
	 */
	public Lottery()
	{
		Random random = new Random();

		for (int i = 0; i < 5; i++)
			lotteryNumbers[i] = random.nextInt(0, 10);
	}

	/**
	 * This returns the amount of the players numbers that matches the generated lottery numbers.
	 *
	 * @param playerNumbers The player's numbers.
	 * @return The amount of the players numbers that matches the generated lottery numbers.
	 */
	public int checkLotteryNumbers(int[] playerNumbers)
	{
		int countNumberThatMatch = 0;

		for (int count = 0; count < playerNumbers.length; count++)
		{
			if (this.lotteryNumbers[count] == playerNumbers[count])
				countNumberThatMatch++;
		}
		return countNumberThatMatch;
	}

	/**
	 * This returns the generated lottery numbers.
	 *
	 * @return The generated lottery numbers.
	 */
	public int[] getLotteryNumbers()
	{
		return this.lotteryNumbers;
	}

	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner keyBoard = new Scanner(System.in);

		// Creates a Lottery Object.
		Lottery lottery  = new Lottery();

		// Variable to store the lottery numbers entered by the user.
		int[] playerNumbers = new int[5];

		// Prompts the user to enter his/her lottery numbers separated by space.
		System.out.printf("\nEnter your 5 lottery numbers(0 - 9) separated by space: ");
		for (int count = 0; count < playerNumbers.length; count++)
			playerNumbers[count] = keyBoard.nextInt();

		// Determines how many of the player's numbers match the lottery number.
		int numberOfMatch = lottery.checkLotteryNumbers(playerNumbers);

		// Displays the Lottery number and the user's numbers.
		System.out.printf("\n\t\tLottery Numbers: ");
		displayArray(lottery.getLotteryNumbers());

		System.out.printf("\n\n\t\tYou Played: ");
		displayArray(playerNumbers);

		// Displays whether the user wins the lottery or not.
		if (numberOfMatch == 5)
			System.out.println("\n\nAll Numbers Match!!!\nYou win the Lottery ):.\n");
		else
			System.out.printf("\n\n%d Number(s) Match\nSorry, you lose (:.\n", numberOfMatch);
	}

	/**
	 * Display an integer array.
	 *
	 * @param array The array to be displayed.
	 */
	public static void displayArray(int[] array)
	{
        for (int j : array) System.out.printf("%d ", j);
	}
}
