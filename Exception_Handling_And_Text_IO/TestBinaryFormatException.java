package Exception_Handling_And_TextIO;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter a string and determines if it's a binary string.
	If the string is not a binary string, a custom-made exception BinaryFormatException is thrown and
	handled.
 */

/**
 * The type Binary format exception.
 */
class BinaryFormatException extends Throwable
{
	private String message;

	/**
	 * Creates a BinaryFormatException instance.
	 *
	 * @param message The error message to be displayed.
	 */
	public BinaryFormatException(String message)
	{
		this.message = message;
	}

	/**
	 * Returns an error message to the caller.
	 *
	 * @return The error message.
	 */
	public String getMessage()
	{
		return this.message;
	}
}

public class TestBinaryFormatException
{
	public static void main(String... doYourBest)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter a binary string.
		System.out.print("\nEnter a Binary String: ");

		try
		{
			String binString = input.next();
			input.close();

			// Checks if the string is a binary string. If not, a BinaryFormatException is thrown.
			checkBinaryString(binString);

			// Displays the result.
			System.out.printf("\n%s converted to decimal is: %d\n", binString, convertBinaryToDecimal(binString));
		}

		catch (BinaryFormatException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * Checks if a string is a binary string.
	 *
	 * @param binString the bin string
	 * @throws BinaryFormatException the binary format exception
	 */
	public static void checkBinaryString(String binString) throws BinaryFormatException
	{
		for (int i = 0; i < binString.length(); i++)
		{
			if (binString.charAt(i) == '0' || binString.charAt(i) == '1')
				continue;
			else
			{
				BinaryFormatException binException= new BinaryFormatException("\nNot a Binary String.");
				throw binException;
			}
		}
	}

	/**
	 * Convert binary to decimal int.
	 *
	 * @param binString The bin string to be converted to decimal.
	 * @return The converted decimal number.
	 */
	public static int convertBinaryToDecimal(String binString)
	{
		int count = binString.length() - 1, sum = 0, idx = 0;

		while (count >= 0)
		{
			sum += Character.getNumericValue(binString.charAt(idx)) * Math.pow(2, count);
			idx++;
			count--;
		}
		return sum;
	}
}
