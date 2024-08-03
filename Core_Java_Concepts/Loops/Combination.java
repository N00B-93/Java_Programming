package Core_Java_Concepts.Loops;

/*
	This is a program that displays all possible combinations
	for picking two numbers from integers 1 to 7. Also display the total number of
	all combinations.
 */

public class Combination
{
	public static void main(String... args)
	{
		int count1, count2, numberOfCombination = 0;

		for (count1 = 1; count1 < 7; count1++)
		{
			for (count2 = count1 + 1; count2 <= 7; count2++)
			{
				System.out.printf("%d %d\n", count1, count2);
				numberOfCombination++;
			}
		}
		System.out.printf("\nThe number of combinations is: %d\n", numberOfCombination);
	}
}
