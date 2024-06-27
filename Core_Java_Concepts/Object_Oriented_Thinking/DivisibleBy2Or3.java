package Object_Oriented_Thinking;

import java.math.BigInteger;

// This is a program that displays the first 10 BigIntegers that are divisible by 2 or 3.

public class DivisibleBy2Or3
{
    public static void main(String[] args)
    {
        // Creates a BigInteger Object with 50 digits.
        BigInteger bigInteger = new BigInteger("100000000000000000000000000000000000000000000000000");

        int counter = 0;

        // Displays the first 10 BinIntegers divisible by 2 or 3.
        System.out.println("\nThe first 10 numbers with digits > 50 that are divisible by 2 or 3 are: ");
        while (counter != 10)
        {
            if (bigInteger.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
                    bigInteger.remainder(new BigInteger("3")).equals(BigInteger.ZERO))
            {
                System.out.println(bigInteger + "\n");
                counter++;
            }
            bigInteger = bigInteger.add(BigInteger.ONE);
        }
    }
}
