package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a 10-digit phone number and then formats the phone number by wrapping
    the first 3 digits in parentheses, inserting a space after the first 3 digits and the inserting a hyphen after the first
    6 digits. For example, if the user enters;
                5153458912,
    The output is;
                (515) 345-8912.
 */

public class PhoneNumberFormat
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Creates a StringBuilder reference.
        StringBuilder phoneNumber;

        // Prompts the user to enter a 10-digit phone number
        System.out.printf("\nEnter a 10-digit phone number: ");
        phoneNumber = new StringBuilder(input.nextLine());

        // Displays an error message and terminates the program if the number of digits in the phone number is not 10.
        if (phoneNumber.length() != 10)
        {
            System.out.println("\nInvalid phone number!!!\nPhone Number length must be 10.");
            System.exit(1);
        }

        // Wraps the first three digits of the phone number in braces.
        phoneNumber.insert(0, "(");
        phoneNumber.insert(4, ")");

        // Inserts a space after the first 3 digits.
        phoneNumber.insert(5, " ");

        // Inserts an '-' after the first 6 digits.
        phoneNumber.insert(9, "-");

        // Displays the formatted phoneNumber.
        System.out.printf("\nFormatted Phone Number: %s\n", phoneNumber);
    }
}
