package Object_Oriented_Thinking;

import java.math.BigInteger;

/*
    This is a program that displays the first 5 prime numbers greater than Long.MAX_VALUE.
 */

public class LargePrimeNumbers
{
    public static void main(String[] args)
    {
        // Creates a BigInteger Object using Long.Max as the starting point.
        BigInteger bigInteger = new BigInteger(String.valueOf(Long.MAX_VALUE));
        bigInteger = bigInteger.add(BigInteger.ONE);

        // Variable to keep track of the number of prime numbers.
        int primeNumberCounter = 0;

        // Displays the result.
        System.out.printf("\nThe first 5 prime numbers greater than %d are:\n", Long.MAX_VALUE);
        while (primeNumberCounter != 5)
        {
            // Checks if a BigInteger is prime.
            if (bigInteger.isProbablePrime(100))
            {
                // Displays the number if it's prime and increments the prime counter.
                System.out.println(bigInteger);
                primeNumberCounter++;
            }
            // Increments the BigInteger number by 1.
            bigInteger = bigInteger.add(BigInteger.ONE);
        }
    }
}
