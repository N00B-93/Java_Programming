package Core_Java_Concepts.Loops;

import java.util.Scanner;

/*
    This is a program that reads an integer and displays
    all its smallest factors in increasing order.
 */

public class FactorsOfAnInteger
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in an integer.
        System.out.printf("\nEnter an Integer: ");
        int number = input.nextInt();

        int divisor = 2;

        System.out.printf("\nThe factors of %d are: ", number);
        while (number != 1)
        {
            // Prints the divisor and carry out a floor division if the number is a multiple of the current divisor.
            while (number % divisor == 0)
            {
                System.out.printf("%d ", divisor);
                number = Math.floorDiv(number, divisor);
            }
            // Increments divisor by 1.
            divisor++;
        }
    }
}
