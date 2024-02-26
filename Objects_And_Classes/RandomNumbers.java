import java.util.Random;

/*
	This is a program that generates 50 random numbers from 1 to 99
	using the Random class from the java.util Package.
 */

public class RandomNumbers
{
	public static void main(String[] args)
	{
		// Creates a Random Object.
		Random rand = new Random(1000);

		// Displays the random numbers.
		for (int count = 0; count < 50; count++)
		{
			int num = 1 + rand.nextInt(99);
			System.out.format("%d ", num);
		}
		System.out.println();
	}
}
