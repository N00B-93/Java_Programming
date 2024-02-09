package Single_Dimesional_Array;

import java.util.Scanner;

/*
	This is a program that determines if an array of integers entered by the user
	has consecutive four numbers with the same values.
 */

public class ConsecutiveFour
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter the number of elements in the array.
		System.out.print("\nEnter the number of values greater than 4: ");
		int n = input.nextInt();

		// Terminates the program if the number of elements is <= 4.
		if (n <= 4)
		{
			System.out.print("\nEnter a value greater than 4!!\n");
			System.exit(0);
		}

		// Creates an array of integers with size entered by the user.
		int numbers[] = new int[n];

		// Fills the array with values entered by the user.
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("\nEnter numbers[%d]: ", i);
			numbers[i] = input.nextInt();
		}

		boolean check = isConsecutive(numbers);

		// Displays whether the array has consecutive four integers or not.
		if (check == true)
			System.out.print("\nThe list has consecutive four.\n\n");
		else
			System.out.print("\nThe list doesn't have consecutive four.\n\n");
	}

	/**
	 * Checks whether an array of integers has consecutive four elements of the same type or not.
	 *
	 * @param array The array to be processed.
	 * @return true if the array has consecutive four, else false.
	 */
	public static boolean isConsecutive(int[] array)
	{
		for (int i = 0; i <= array.length - 4; i++)
		{
			int counter = 0;

			for (int j = i + 1; j < i + 4; j++)
			{
				if (array[i] == array[j])
					counter++;
				else
					break;
			}
			if (counter == 3)
				return true;
		}
		return false;
	}
}
