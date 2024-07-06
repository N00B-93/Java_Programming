package Core_Java_Concepts.Loops;

import java.util.*;

/*
	ISBN-13 is a new standard for identifying books. It
	uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
	which is calculated from the other digits using the following formula:
		10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
	If the checksum is 10, replace it with 0. This program takes the first 12 digit if an ISBN-13 number
	as a string from the user, calculate the checksum and displays the fullISBN-13 number.
 */

public class CheckISBN13
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Reads in the first 12 digits of an ISBN_13 number.
		System.out.print("\nEnter the first 12 digits of an ISBN: ");
		String isbn = input.next();

		// Terminates the program if the length of the number entered by the user is < 12.
		if (isbn.length() != 12)
		{
			System.out.print("\nInvalid ISBN number!!\n\n");
			System.exit(0);
		}

		int sumEven = 0, sumOdd = 0, len = isbn.length(), count = 0;

		// Calculates the sum of the numbers in the even and odd positions.
		while (count < len)
		{
			int digit = Character.getNumericValue(isbn.charAt(count));
			if (count % 2 != 0)
				sumOdd += digit;
			else
				sumEven += 3 * digit;
			count++;
		}

		// Calculates the sum of odd and even digits.
		int sum = sumEven + sumOdd;

		// Computes the checksum.
		int checkSum = 10 - sum % 10;

		// Re-assigns the checksum to 0 if it is 10.
		if (checkSum == 10)
			checkSum = 0;

		// Computes the ISBN-13 number.
		isbn += checkSum;

		// Displays the ISBN-13 number.
		System.out.printf("\nThe ISBN 13 number is: %s\n\n", isbn);
	}
}
