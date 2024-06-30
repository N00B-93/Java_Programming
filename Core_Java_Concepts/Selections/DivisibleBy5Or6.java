package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter
    an integer and determines whether it is divisible by 5 and 6, whether it is divisible
    by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 */

public class DivisibleBy5Or6
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter an integer.
        System.out.printf("\nEnter an integer: ");
        int number = input.nextInt();

        // Checks whether the number is divisible by 5 and 6.
        System.out.printf("\n Is %d divisible by 5 and 6? %b\n", number, (number % 5 == 0) && (number % 6 == 0));

        // Checks whether the number is divisible by 5 or 6.
        System.out.printf("\n Is %d divisible or 5 or 6? %b\n", number, (number % 5 == 0) || (number % 6 == 0));

        // Checks whether the number is divisible by 5 or 6 but not both.
        System.out.printf("\n Is %d divisible or 5 or 6 and not both? False\n", number,
                    (number % 5 == 0) || (number % 6 == 0) && ((number % 5 == 0) ^ (number % 6 == 0)));
    }
}
