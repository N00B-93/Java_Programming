package Core_Java_Concepts.Single_Dimensional_Arrays;

import java.util.*;

/*
	This is a program that uses a method with the header;
				public static int getRandom(int... numbers)
	to randomly select a number between 1 and 54 excluding the numbers passed to the method as arguments.
 */

public class RandomNumberChooser
{
	/**
	 * Chooses a number randomly between 1 and 54 excluding any number in the array passed to it.
	 *
	 * @param numbers The array of numbers.
	 * @return The random number picked.
	 */
	public static int randomChooser(int... numbers)
	{
		int counter = 0;

		Random randInt = new Random();

		int num = 1 + randInt.nextInt(54);

		for (int count = 0; count < numbers.length; count++)
		{
			if (num == numbers[count])
				counter++;
		}

		if (counter == 0)
			return num;
		else
			return 0;
	}

	public static void main(String[] args)
	{
		System.out.printf("\nNumber: %d\n", randomChooser(5, 7, 10, 52, 11, 6));
	}
}
