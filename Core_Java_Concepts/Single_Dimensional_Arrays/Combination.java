package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter 10 integers
	and displays all combinations of picking two numbers from the 10 numbers.
 */

public class Combination
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates an Array of 10 integers.
		int[] numbers = new int[10];

		// Reads in elements into the array.
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.format("\nEnter number[%d]: ", i);
			numbers[i] = input.nextInt();
		}

		// Displays the combination of picking two numbers from 10 numbers.
		for (int count1 = 0; count1 < numbers.length; count1++)
		{
			for (int count2 = count1 + 1; count2 < numbers.length; count2++)
			{
				System.out.printf("(%d, %d) ", numbers[count1], numbers[count2]);
			}
		}
	}
}
