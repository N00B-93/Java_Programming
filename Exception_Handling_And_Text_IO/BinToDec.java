package Exception_Handling_And_Text_IO;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter a binary string, checks if the string is a valid binary string
	and converts it to a binary number. If the string is not a valid binary string, an exception
	is thrown and an error message is displayed.
 */

public class BinToDec
{
	public static void main(String... doYourBest)
	{
		Scanner input = new Scanner(System.in);

		System.out.printf("\nEnter a Binary String: ");
		try  // Try-Catch block that catches and handles NumberFormatException exception.
		{
			// Reads in a binary String.
			String binString = input.next();
			input.close();

			// Checks if the binary string is valid and displays the result.
			checkBinaryString(binString);
			System.out.printf("\n%s converted to decimal is: %d\n", binString, convertBinaryToDecimal(binString));
		}
		catch (NumberFormatException ex)
		{
			// Catches the Exception and displays an error message.
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * Check binary string.
	 *
	 * @param binString the bin string
	 */
	public static void checkBinaryString(String binString)
	{
		for (int i = 0; i < binString.length(); i++)
		{
			if (binString.charAt(i) == '0' || binString.charAt(i) == '1')
				continue;
			else
				throw new NumberFormatException("\nNot a Binary Number.");
		}
	}

	/**
	 * Convert binary to decimal int.
	 *
	 * @param binString the bin string
	 * @return the decimal integer.
	 */
	public static int convertBinaryToDecimal(String binString)
	{
		int count = binString.length() - 1, binaryDigit = 0, idx = 0;

		while (count >= 0)
		{
			binaryDigit += Character.getNumericValue(binString.charAt(idx)) * Math.pow(2, count);
			count--;
			idx++;
		}
		return binaryDigit;
	}	
}
