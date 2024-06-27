package Object_Oriented_Thinking;

import java.math.BigInteger;

/*
    A prime number is called a Mersenne prime if it can be written in the form 2^p - 1 for some positive integer p,
    where p is a prime number. This program finds all Mersenne primes with p <= 100 and displays the output.
 */

public class MersennePrimeNumbers
{
    public static void main(String[] args)
    {
        // Creates a BigInteger Object initialized with 1.
        BigInteger mersennePrime = BigInteger.ZERO;

        // Displays all Mersenne prime numbers in the range 2 <= i <= 100.
        System.out.println("\np\t\t2 ^ p - 1\n-------------------------------");
        for (int i = 2; i <= 100; i++)
        {
            // Checks if each value of i is prime.
            if (isPrime(i))
            {
                // Determines the value of 2^p - 1 for each prime number and displays the result.
                mersennePrime = BigInteger.TWO.pow(i).subtract(BigInteger.ONE);
                System.out.println(i + "\t\t" + mersennePrime);
            }
        }
    }

    /**
     * Checks whether an integer is prime or not.
     *
     * @param number The number to be checked.
     *
     * @return true if the integer is prime, else false.
     */
    public static boolean isPrime(int number)
    {

        for (int count = 2; count <= Math.sqrt(number); count++)
        {
            if (number % count == 0)
                return false;
        }
        return true;
    }
}
