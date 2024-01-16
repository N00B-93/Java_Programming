package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter an integer between
    0 and 15 and displays its corresponding hex number
 */

public class DecimalToHexadecimal
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter a decimal value from 0 to 15.
        System.out.printf("\nEnter a decimal value(0 to 15): ");
        int decimalValue = input.nextInt();

        // Checks if the user input is in the range 0 - 15 and terminates the program if not.
        if (decimalValue < 0 || decimalValue > 15)
        {
            System.out.println("\nInvalid number\nEnter a number from 0 to 15!");
            System.exit(0);
        }

        // Prints the original value if the number is greater than or equal to 0 or less than or equal to 9.
        if (decimalValue >= 0 && decimalValue <= 9)
            System.out.printf("\nThe Hexadecimal value is %d\n", decimalValue);
        else
        {
            // Determines the hex value for number > 9 and <= 15 then displays the result.
            char hexValue = (char) (decimalValue - 10 + 'A');
            System.out.printf("\nThe Hexadecimal value is %c\n", hexValue);
        }
    }
}
