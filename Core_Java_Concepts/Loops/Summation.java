package Core_Java_Concepts.Loops;

/*
	This is a program that determines the sum of all terms in the series;
			1 / (1 + √2) + 1 / (√2 + √3) + 1 / (√3 + √4) +...+ 1 / (√999 + √1000)
 */

public class Summation
{
    public static void main(String[] args)
    {
        // A variable to hold the sum of all terms.
        double summation = 0.0;

        // Determines the sum of all terms in the series.
        for (int i = 1; i <= 999; ++i)
            summation += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));

        // Displays the result.
        System.out.printf("\nThe sum of all terms is: %.2f\n", summation);
    }
}

