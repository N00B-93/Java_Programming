package Loops;

/*
	This is a program that computes the tuition in ten years and the
	total cost of four years’ worth of tuition after the tenth year. Suppose that the tuition for the university
	is $10,000 this year and increases 5% every year. In one year, the tuition
	will be $10,500.
 */

public class FutureTuition
{
	public static void main(String... args)
	{
		double tuition = 10000.0, sum = 0.0;
		
		for (int count = 0; count < 14; count++)
		{
			// Calculates the new tuition for each year.
			tuition = tuition * 1.05;
			if (count == 9)
				// Displays the tuition at the tenth year.
				System.out.printf("\nThe tuition in ten years is: $ %.2f\n", tuition);
			else if (count > 9)
				// Calculate the sum of tuition for four years after the tenth year.
				sum = sum + tuition;
		}
		// Displays the total tuition for fours after the tenth year.
		System.out.printf("\nCost of 4 yrs worth of tuition after the tenth year: $ %.2f\n", sum);
	}
}
