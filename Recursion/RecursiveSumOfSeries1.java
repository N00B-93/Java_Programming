package Recursion;

/*
    This program uses a recursive method with the header;
                public static double recursiveSumOfSeries(int numberOfTerms)
    to return the sum of the first n terms of the series i / (i + 1) for n = 1, 2, 3, ..., 20.
 */

public class RecursiveSumOfSeries1
{
    public static void main(String[] args)
    {
        // Displays the sum of the series for i = 1, 2, 3, ..., 20.
        System.out.println("i\t\tm(i)");
        System.out.println("----------------");
        for (int i = 1; i <= 20; i++)
            System.out.printf("%d\t\t%.4f\n", i, recursiveSumOfSeries(i));
    }

    /**
     * This returns the sum of the first n terms of the series i / (i + 1) for any integer n >= 1 recursively.
     *
     * @param numberOfTerms The number of terms.
     * @return The sum of the first n terms.
     */
    private static double recursiveSumOfSeries(int numberOfTerms)
    {
        if (numberOfTerms == 1)
            return 0.5;
        return (numberOfTerms / (numberOfTerms + 1.0)) + recursiveSumOfSeries(numberOfTerms - 1);
    }
}
