package Core_Java_Concepts.Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that receives an ASCII code
    (an integer between 0 and 127) and displays its character
 */

public class ASCIICode
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter an ASCII value from 0 to 127.
        System.out.printf("\nEnter an ASCII code(from 0 to 127): ");
        int asciiValue = input.nextInt();

        // Checks whether the user input is valid. If not, the program is terminated.
        if (asciiValue < 0 || asciiValue > 127)
        {
            System.out.println("\nInvalid ASCII code\nEnter a number from 0 to 127!");
            System.exit(1);
        }

        // Displays the result.
        System.out.printf("\nThe character for ASCII code %d is: %c\n", asciiValue, asciiValue);
    }
}
