package Exception_Handling_And_Text_IO;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    This is a program that prompts the user to read
    two integers and displays their sum. The program prompts the user to
    read the number again if the input is incorrect.
 */

public class InputMismatchExceptionClass
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        try  // Try-Catch block that processes InvalidInputException when the user enters a non integer character.
        {
            // Reads in two integers.
            System.out.printf("\nEnter the first integer: ");
            int number1 = input.nextInt();

            System.out.printf("\nEnter the second integer: ");
            int number2 = input.nextInt();

            // Displays the result.
            System.out.printf("\nSum = %d\n", number1 + number2);
        }
        catch (InputMismatchException ex)
        {
            // Display an error message if an Exception occurs.
            System.out.println("\nInvalid input, Try again.");
        }
    }
}
