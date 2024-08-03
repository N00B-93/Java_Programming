package Core_Java_Concepts.Loops;

import java.util.Scanner;

/*
    This is a program that reads an unspecified number of integers, determines how many
    positive and negative values have been read, and computes the total and average of
    the input values (not counting zeros). The input terminates on entering 0.
 */

public class CountPositivesAndNegatives
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Declares abd initializes variables used.
        int number, sum = 0, countPositive = 0, countNegative = 0;
        double average;

        do // Do-While loop that continues to run till user enters 0.
        {
            // Prompts the user to enter an integer.
            System.out.printf("\nEnter an Integer(press 0 to end): ");
            number = input.nextInt();

            // Calculates the sum of integers entered by the user.
            sum += number;

            // Counts the number of positive and negative numbers entered by the user.
            if (number > 0)
                countPositive++;
            else if (number < 0)
                countNegative++;

        } while (number != 0);

        // calculates the average of the numbers.
        average = (double) sum / (countNegative + countPositive);

        // Displays the result.
        System.out.printf("""
                The number of Positives is: %d
                The number of Negatives is: %d
                The total is: %d
                The average is: %.2f
                """, countPositive, countNegative, sum, average);
    }
}
