package Object_Oriented_Thinking;

import java.math.BigInteger;

/*
    This is a program that displays the first five numbers greater than Long.MAX_VALUE that is divisible
    by 5 or by 6.
 */

public class DivisibleBy5Or6
{
    public static void main(String[] args)
    {
        // Creates a BigInteger Object.
        BigInteger start = new BigInteger(Long.MAX_VALUE + "");

        // Increments the value of start by BigInteger.ONE
        start = start.add(BigInteger.ONE);

        // Counter to keep track of the amount of numbers displayed.
        int counter = 0;

        System.out.println("\nThe first 5 numbers > " + Long.MAX_VALUE + " that is divisible by 5 or 6 are: ");
        while (counter != 5)
        {
            // Displays a BigInteger if it's divisible by 5 or 6 and increments the counter.
            if ((start.remainder(new BigInteger("5"))).equals(BigInteger.ZERO) ||
                    (start.remainder(new BigInteger("6")).equals(BigInteger.ZERO)))
            {
                System.out.println(start);
                counter++;
            }
            // Increments the BigInteger by one.
            start = start.add(BigInteger.ONE);
        }
    }
}
