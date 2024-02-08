package Methods;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter a phone number consisting of digits and letters(upper or lowercase)
	and then displays the number equivalent of the phone number using the
	international standard letter/number mapping for telephones.
*/

public class PhoneKeypads
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		//Reads in an Alphanumeric phone number.
		System.out.print("\nEnter Phone Number(e.g. 1-800-FLOWERS): ");
		String phoneNumber = input.nextLine();

		// Displays the result.
		for (int i = 0; i < phoneNumber.length(); i++)
		{
			if (phoneNumber.charAt(i) >= 48 && phoneNumber.charAt(i) <= 57)
				System.out.printf("%c", phoneNumber.charAt(i));
			else if (Character.isLetter(phoneNumber.charAt(i)))
				System.out.printf("%d", getNumber(phoneNumber.charAt(i)));
		}
		System.out.println();
	}

	/**
	 * Returns the number equivalent of a letter in a phone keypad.
	 *
	 * @param letter The letter whose number equivalent is to be determined.
	 *
	 * @return The number equivalent of a letter.
	 */
	public static int getNumber(char letter)
	{
		if ("abcABC".contains(letter + ""))
			return 2;
		else if ("defDEF".contains(letter + ""))
			return 3;
		else if ("ghiGHI".contains(letter + ""))
			return 4;
		else if ("jklJKL".contains(letter + ""))
			return 5;
		else if ("mnoMNO".contains(letter + ""))
			return 6;
		else if ("pqrsPQRS".contains(letter + ""))
			return 7;
		else if ("tuvTUV".contains(letter + ""))
			return 8;
		else
			return 9;
	}
}
