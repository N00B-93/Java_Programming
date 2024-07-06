package Core_Java_Concepts.Loops;

/*
    This is a program that determines the sum of the series;
                1/3 + 3/5 + 5/7 + ...+ 97/99
 */

public class SumOfArithmeticSeries
{
    public static void main(String[] args)
    {
        // Variable to hold the sum of the series.
        double sumOfSeries = 0.0;

        // Determines the sum of the series.
        for (int i = 1, j = 3; i <= 97 && j <= 99; i += 2, j += 2)
            sumOfSeries += (i / (double) j);

        // Displays the result.
        System.out.printf("\nThe sum of the series is: %.2f\n", sumOfSeries);
    }
}
