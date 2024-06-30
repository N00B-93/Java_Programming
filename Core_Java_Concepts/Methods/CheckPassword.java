package Core_Java_Concepts.Methods;

import java.util.Scanner;

/*
    Some websites impose certain rules for passwords. Write a
    method that checks whether a string is a valid password. Suppose the password
    rules are as follows:
        ■ A password must have at least eight characters.
        ■ A password consists of only letters and digits.
        ■ A password must contain at least two digits.
    This is a program that prompts the user to enter a password and displays Valid
    Password if the rules are followed or Invalid Password otherwise.
 */

public class CheckPassword
{
    public static void main(String[] args)
    {
        // Creates a ScannerObject.
        Scanner input = new Scanner(System.in);

        // Reads in a user's password.
        System.out.printf("\nEnter your Password: ");
        String password = input.next();

        // Display an error message and terminates the program if the password's length is < 8.
        if (password.length() < 8)
        {
            System.out.printf("\nInvalid Password!");
            System.exit(1);
        }

        // Checks if the password is valid or not and displays the result.
        if (countDigits(password) >= 2 && checkAlphanumericNature(password))
            System.out.printf("\n'%s' is a valid password!\n", password);
        else
            System.out.printf("\n'%s' is not a valid Password!\n", password);
    }

    /**
     * Counts the number of digits in a password string.
     *
     * @param password The password to be processed.
     * @return The number of digits in the password.
     */
    public static int countDigits(String password)
    {
        int digitCounter = 0;

        for (int i = 0; i < password.length(); i++)
        {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57)
                digitCounter++;
        }
        return digitCounter;
    }

    /**
     * Check whether a password string is alphanumeric or not.
     *
     * @param password The password to be processed.
     * @return true if password is alphanumeric, else false.
     */
    public static boolean checkAlphanumericNature(String password)
    {
        for (int i = 0; i < password.length(); i++)
        {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57)
                if (password.charAt(i) >= 65 && password.charAt(i) <= 90)
                    if (password.charAt(i) >= 91 && password.charAt(i) <= 127)
                        continue;
            else
                return false;
        }
        return true;
    }
}
