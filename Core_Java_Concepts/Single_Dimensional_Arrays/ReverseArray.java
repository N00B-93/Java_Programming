package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter 10 integer elements for an array and then
	reverses the array.
 */

public class ReverseArray
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates an array of 10 integers.
		int[] numbers = new int[10];

		// Reads in 10 integers into the array.
		System.out.printf("\nEnter the elements of the array separated by space: ");
		for (int count = 0; count < numbers.length; count++)
		{
			numbers[count] = input.nextInt();
		}

		// Displays the array before reversing.
		System.out.print("\nArray before: ");
		for (int count = 0; count < numbers.length; count++)
			System.out.printf("%d ", numbers[count]);

		// Reverses the array.
		for (int i = 0, j = numbers.length - 1; j >= (numbers.length / 2); i++, j--)
		{
			int temp = numbers[j];
			numbers[j] = numbers[i];
			numbers[i] = temp;
		}

		// Displays the array after reversing.
		System.out.print("\nArray After: ");
		for (int count = 0; count < numbers.length; count++)
			System.out.printf("%d ", numbers[count]);
		
		System.out.print("\n\n");
	}
}
