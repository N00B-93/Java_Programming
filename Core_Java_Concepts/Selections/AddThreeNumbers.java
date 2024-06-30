package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
    This is a program that generates three single-digit integers and prompt the user to
    enter the sum of these three integers.
 */
public class AddThreeNumbers
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Generates three random numbers.
        int number1 = (int) (10 * (Math.random()));
        int number2 = (int) (10 * (Math.random()));
        int number3 = (int) (10 * (Math.random()));

        // Determines the sum of the numbers.
        int sumOfNumbers = number1 + number2 + number3;

        // Prompts the user to enter the result.
        System.out.printf("\nWhat is %d + %d + %d? ", number1, number2, number3);
        int result = input.nextInt();

        // Verifies the user input to be true or false.
        System.out.println(result == sumOfNumbers);
    }
}
