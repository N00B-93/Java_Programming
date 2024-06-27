package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
    This is a program that determines the number of uppercase characters in a String entered by the user in the
    command line.
 */

public class NumberOfUppercaseLetters
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        int numberOfUppercase = 0;

        // Informs the user to enter a String in the command line.
        System.out.println("\nEnter a String to be checked in the command line.");

        // Displays a way to use the program to the user and exits the program if no command line argument is specified
        // by the user.
        if (args.length == 0)
        {
            System.out.println("\nUsage java NumberOfUppercaseLetters stringToBeChecked");
            System.exit(1);
        }

        // Determines the number of uppercase characters in the command line input.
        for (int i = 0; i < args[0].length(); i++)
        {
            if (args[0].charAt(i) >= 65 && args[0].charAt(i) <= 90)
                numberOfUppercase++;
        }

        // Displays the result.
        System.out.printf("\nThe number of uppercase character in '%s' is: %d\n\n", args[0], numberOfUppercase);
    }
}
