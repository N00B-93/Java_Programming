package Selection;

import java.util.Scanner;

/*
	A five-digit integer is said to be friendly if the leftmost digit is divisible by 1, the 
	leftmost two digits are divisible by 2, the leftmost three digits are divisible by 3, 
	the leftmost four digits are divisible by 4, and the leftmost five digits (the five-digit number itself) is divisible by 5.
*/

public class FriendlyNumber
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter a five-digit number.
		System.out.print("\nEnter a 5-digit number: ");
		int number = input.nextInt();

		// Closes the Scanner.
		input.close();

		// Displays an error message and terminates the program if the user doesn't enter a 5-digit number.
		if (number < 10_000 || number > 99_999)
		{
			System.out.println("\nInvalid input, Use a 5-digit number only.");
			System.exit(1);
		}
		
		// Determines if the leftmost digit, the leftmost two digit, the leftmost three digit and  the leftmost four digit.
		// are divisible by 1, 2, 3 and 4 respectively.
		boolean leftmostDigit = (number / 10000) % 1 == 0;
		boolean leftmost2Digit = (number / 1000) % 2 == 0;
		boolean leftmost3Digit = (number / 100) % 3 == 0;
		boolean leftmost4Digit = (number / 10) % 4 == 0;
		boolean leftmost5Digit = number % 5 == 0;
		
		// Displays the result.
		if (leftmostDigit && leftmost2Digit && leftmost3Digit && leftmost4Digit && leftmost5Digit)
			System.out.printf("\n%d is a friendly number.\n", number);
		else
			System.out.printf("\n%d is not a friendly number.\n", number);
	
	}
}

