package Core_Java_Concepts.Methods;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter an integer greater than 0, then checks
	whether the integer is an ArmStrong number or not by using a method with the header;
			public static boolean isArmStrongNumber(int number)
*/

public class ArmStrongNumber
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter an integer.
		System.out.printf("\nEnter a positive integer > 0: ");
		var number = input.nextInt();

		while (number <= 0)
		{
			// Continues to prompt the user to enter a number greater than 0.
			System.out.printf("\nInvalid input\nEnter a positive number greater than 0: ");
			number = input.nextInt();
		}
		
		// Checks whether the number entered by the user is an ArmStrong number.
		System.out.printf("\nIs %d an ArmStrong number? %b\n", number, isArmStrongNumber(number));
	}

	/**
	 * Checks whether a number is an ArmStrong number or not.
	 *
	 * @param number The number to be checked.
	 * @return true if the number is an ArmStrong, else false.
	 */
	public static boolean isArmStrongNumber(int number)
	{
		int tempVar = number, sumOfCubes = 0;

		while (number != 0)
		{
			int remainder = number % 10;
			sumOfCubes += Math.pow(remainder, 3);
			number /= 10;
		}
		return sumOfCubes == tempVar;
	}
}

