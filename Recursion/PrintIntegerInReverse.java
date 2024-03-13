package Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    This is a program that uses a method with the header;
                public static void reverseDisplay(int number)
    to display an integer entered by the user in reverse.
 */

public class PrintIntegerInReverse
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        int number = 0;

        while (true)
        {
            try
            {
                // prompts the user to enter the number to be reversed.
                System.out.printf("\nEnter the number to be reversed: ");
                number = keyBoard.nextInt();

                // Breaks out of the infinite loop if the user input is greater than or equal to 0.
                if (number >= 0)
                    break;
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("\nInvalid Input!!!\nUse positive integers only.");
                keyBoard.nextLine();
            }
        }

        // Displays '0' if the number entered by the user is '0'.
        if (number == 0)
            System.out.printf("\nThe reversed number is: 0");
        else
        {
            // Display the number entered by the user in reverse.
            System.out.printf("\nThe reversed number is: ");
            reverseDisplay(number);
            System.out.println();
        }
    }

    /**
     * Displays a number in reverse using tail recursion.
     *
     * @param number The number to be displayed in reverse.
     */
    public static void reverseDisplay(int number)
    {
        if (number > 0)
        {
            int remainder = number % 10;
            System.out.printf("%d", remainder);
            number = number / 10;
            reverseDisplay(number);
        }
    }
}
