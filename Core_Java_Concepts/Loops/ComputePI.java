package Core_Java_Concepts.Loops;

/*
        This is a program that computes the value of PI using the formula:
        PI = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1 ^(i + 1) / 2i - 1)
        and displays the value of PI for i = 10000, 20000,  ..., 100000.
 */

public class ComputePI
{
    public static void main(String[] args)
    {
        System.out.println("\ni\t\t\tPI");

        // Initializes the variable pi with 0.
        double pi = 0;

        int LIMIT = 100_000, STEP = 10_000;

        for (int i = 1; i <= LIMIT; i++)
        {
            // Calculates the value of PI and displays the result if the current value of i is a multiple of 10,000.
            if (i % STEP == 0)
            {
                for (int j = 1; j <= i; j++)
                {
                    pi += 4 * Math.pow(-1, j + 1) / (2 * j - 1);
                }
                System.out.printf("%d\t\t%f\n", i, pi);
            }
            // Resets pi to 0.
            pi = 0;
        }
    }
}
