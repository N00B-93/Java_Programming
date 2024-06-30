package Core_Java_Concepts.Recursion;

/*
    This program uses a recursive method with the header;
                public static double recursiveSumOfSeries(int numberOfTerms)
    to return the sum of the first n terms of the series (i / (2 * i + 1)) for n = 1, 2, 3, ..., 20.
 */

public class RecursiveSumOfSeries3
{
    public static void main(String[] args)
    {
        // Displays the sum of the series for i = 1, 2, 3, ..., 20.
        System.out.println("i\t\tm(i)");
        System.out.println("---------------");
        for (int i = 1; i <= 20; i++)
            System.out.printf("%d\t\t%.4f\n", i, recursiveSumOfSeries(i));
    }

    /**
     *  This returns the sum of the first n terms of the series (i / (2 * i + 1)) for any integer n >= 1 recursively.
     * @param number The number of terms.
     * @return The sum of the first n terms.
     */
    private static double recursiveSumOfSeries(int number)
    {
        if (number == 1)
            return 1.0 / 3;
        return (number / (2 * number + 1.0)) + recursiveSumOfSeries(number - 1);
    }
}
