package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter a list of 10 numbers and then displays the distinct numbers in the
	list in the order in which they appear.
 */

public class DistinctNumbers
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates an array of 10 integers.
		int[] numbers = new int[10];

		// String variable  to hold distinct numbers.
		String distinctNumbers = "";

		// Prompts the user to enter the elements of the array.
		System.out.printf("\nEnter the elements of the array separated by space: ");
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = input.nextInt();
		}

		// Appends elements of the number array into a new array only once, repeated elements are ignored.
		for (int i = 0, j = 0; i < numbers.length; ++i)
		{
			if (distinctNumbers.contains(String.valueOf(numbers[i])))
				continue;
			else
				distinctNumbers += String.valueOf(numbers[i]);
		}

		// Displays the number of distinct numbers.
		System.out.printf("\nThe number of distinct numbers are: %d\n", distinctNumbers.length());

		// Displays the distinct element in the array.
		System.out.print("\nThe distinct elements are: ");
		for (int count = 0; count < distinctNumbers.length(); count++)
		{
			System.out.printf("%c ", distinctNumbers.charAt(count));
		}
		System.out.println();
	}
}
