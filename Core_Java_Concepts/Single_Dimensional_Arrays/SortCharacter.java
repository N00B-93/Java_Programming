package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter a String and uses a method with the header;
				public static String sort(String s)
	to sort the characters in the String
 */

public class SortCharacter
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Reads in the String to be sorted.
		System.out.print("\nEnter a string to be sorted: ");
		String s = input.next();

		// Sorts the characters in the String.
		String str = sort(s);

		// Displays the result.
		System.out.printf("\nThe sorted string is: %s\n", str);

	}

	/**
	 * Sorts a characters in a String and returns the sorted string.
	 *
	 * @param str The String to be sorted.
	 * @return The sorted String.
	 */
	public static String sort(String str)
	{
		char[] arr = str.toCharArray();

		for (int pass = 0; pass < arr.length - 1; pass++) {
			for (int count = 0; count < arr.length - pass - 1; count++) {
				if (arr[count] > arr[count + 1]) {
					char temp = arr[count];
					arr[count] = arr[count + 1];
					arr[count + 1] = temp;
				}
			}
		}
		return new String(arr);
	}
}
