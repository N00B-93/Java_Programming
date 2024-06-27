package Loops;

import java.util.Scanner;

/*
    This is a  program that generate ten random addition questions
    for two integers between 1 and 15. The time taken to complete the test and the number of correct
    question answered are displayed after completion of the test.
 */

public class LearnAddition
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Initializes the counter variable to 0.
        int counter = 0;

        // Calculates the start time.
        long startTime = Math.round(System.currentTimeMillis() / 1000.0);

        for (int count = 0; count < 10; count++)
        {
            // Generates two integers from 1 to 15
            int number1 = (int) (1 + (Math.random() * 15));
            int number2 = (int) (1 + (Math.random() * 15));

            // Prompts the user to enter an answer.
            System.out.printf("\nWhat is %d + %d? ", number1, number2);
            int answer = input.nextInt();

            // Increments the counter variable by 1 if the user answer's the question correctly.
            if (answer == (number1 + number2))
                counter++;
        }

        // Calculates the stop time.
        long stopTime = Math.round(System.currentTimeMillis() / 1000.0);

        // Displays the result.
        System.out.printf("\nYou answered %d questions correctly\nThe test took %d seconds.\n", counter,
                (stopTime - startTime));
    }
}
