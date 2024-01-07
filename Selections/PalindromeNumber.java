package Selections;

import java.util.Scanner;
/*
    This is a program that prompts the user to enter a three-digit
    integer and determines whether it is a palindrome number. A number is palindrome
    if it reads the same from right to left and from left to right.
 */

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter a 3-digit number.
        System.out.print("\nEnter a 3-digit Number: ");
        int number = input.nextInt();

        // Assigns the user input to a temporary variable to preserve its original value.
        int tempVariable = number;

        // Displays an Invalid Input message to the user and terminates the program if the number entered isn't a 3-digit number.
        if (number < 100 || number >= 1000)
        {
            System.out.println("\nInvalid Input, 3-Digit number required.");
            System.exit(0);
        }

        // Strips off the first, second and third digit from the number entered by the user.
        int thirdDigit = number % 10;
        number = (int) Math.floor(number / 10.0);
        int secondDigit = number % 10;
        number = (int) Math.floor(number / 10.0);
        int firstDigit = number % 10;

        // Generates a reversed version of the user input using the stripped digits.
        int reversedNumber = (thirdDigit * 100) + (secondDigit * 10) + firstDigit;

        // Check whether the reversed version equals the original number and displays the result accordingly.
        if (tempVariable == reversedNumber)
            System.out.printf("\n%d is a Palindrome\n", tempVariable);
        else
            System.out.printf("\n%d is not a palindrome\n", tempVariable);
    }
}
