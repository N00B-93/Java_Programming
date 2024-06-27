package Methods;

import java.util.Scanner;

/*
	This is a program that uses two methods;
		public static int reverse(int number)
		public static boolean isPalindrome(int number)
	to determine whether an integer entered by the user is a palindrome or not.
*/

public class Palindrome
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter an integer to be checked.
		System.out.printf("\nEnter an Integer: ");
		int number = input.nextInt();
		
		// Reverses the integer
		int reversedNumber = reverse(number);
		
		// Checks if the reversed number is the same as the original number or not.
		boolean checkPalindrome = isPalindrome(number, reversedNumber);
		// Displays the result.
		if (checkPalindrome)
			System.out.printf("\n\n%d is a Palindrome.\n", number);
		else
			System.out.printf("\n\n%d is not a Palindrome.\n", number);
	}

	/**
	 * Reverses an integer.
	 *
	 * @param number The number to be reversed.
	 *
	 * @return The reversed number.
	 */
	public static int reverse(int number)
	{
		int  reversedNumber = 0, rem = 0;

		while (number != 0)
		{
			rem = number % 10;  // Extract a digit from number.
			reversedNumber = reversedNumber * 10 + rem;  // Determines the reversed number.
			number /= 10;  // Peels off the extracted digit.
		}
		// Returns the reversed number.
		return reversedNumber;
	}

	/**
	 * Checks if an integer is a palindrome.
	 *
	 * @param number The original number.
	 * @param reversedNumber The reversed number.
	 *
	 * @return true or false to indicate whether the number is a palindrome or not.
	 */
	public static boolean isPalindrome(int number, int reversedNumber)
	{
		if (number == reversedNumber)
			return true;
		return false;
	}
}
