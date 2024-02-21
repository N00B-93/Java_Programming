package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a hex digit and
    displays its corresponding binary number.
 */

public class HexToBinary
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter a hex digit.
        System.out.printf("\nEnter an Hex digit(A - F): ");
        char hexValue = input.next().charAt(0);

        // Terminates the program if the character entered by the user is not a hexadecimal character.
        if (hexValue < 65 || hexValue > 70)
        {
            System.out.println("\nInvalid Hex digit!");
            System.exit(0);
        }

        // Converts the hexadecimal number to decimal.
        int decimalValue = 10 + (int)(hexValue - 'A');

        String binaryNumber = "";

        // Determines the binary equivalent of the decimal number.
        while (decimalValue > 0)
        {
            int remainder = decimalValue % 2;
            binaryNumber += String.valueOf(remainder);
            decimalValue /= 2;
        }

        // Displays the binary equivalent of the hexadecimal number.
        System.out.printf("\nThe binary equivalent of '%c' is : ", hexValue);
        for (int i = binaryNumber.length() - 1; i >= 0; i--)
            System.out.printf("%c", binaryNumber.charAt(i));

    }
}
