package Core_Java_Concepts.Loops;

import java.util.Random;

/* 	This is a program that simulates rolling a die a million times
	and determines the total occurrence of heads and tails.
*/

public class HeadAndTail
{
	public static void main(String... args)
	{
		// Creates a Random Object.
		Random rand = new Random();

		// Initialize head and tail variable to 0.
		int head = 0, tail = 0, LIMIT = 1_000_000;
		
		for (int count = 0; count < LIMIT; count++)
		{
			// Generates a random number from 0 t0 1.
			int randomNumber = rand.nextInt(0, 2);

			// Increments tail by 1 if randomNumber is 0 and head by 1 if randomNumber is 1.
			if (randomNumber == 0)
				tail++;
			else
				head++;
		}

		// Displays number of heads and tails.
		System.out.printf("\nThe number of head is: %d\n\nThe number of tail is: %d\n", head, tail);
	}
}

