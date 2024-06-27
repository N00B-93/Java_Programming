package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
    This is a program that reads in an unspecified number of integers from the command line and then displays the sum
    of these integers.
 */

public class SumOfIntegers
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Variable to hold the sum of the integers.
        int sum = 0;

        // Displays a way to use the program to the user and exits the program if no command line argument is specified
        // by the user.
        if (args.length == 0)
        {
            System.out.println("\nUsage: java SumOfIntegers arg0 arg1 arg2...");
            System.exit(1);
        }

        // Calculates the sum of the integers entered in the command line.
        for (String number: args)
        {
           sum += Integer.parseInt(number);
        }

        // Displays the sum of integers.
        System.out.printf("\nThe sum of numbers is: %d\n\n", sum);
    }
}
