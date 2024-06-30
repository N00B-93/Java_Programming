package Core_Java_Concepts.Recursion;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a String and then displays
    the String in reverse order using recursive calls.
 */

public class PrintStringInReverse
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the String to be printed in reverse.
        System.out.printf("\nEnter a String to be printed in reverse: ");
        String string = input.nextLine();

        // Displays the String.
        System.out.printf("\nOriginal String: %s\n", string);

        // Displays the String in reverse.
        System.out.print("\nReversed String: ");
        reverseDisplay(string);
        System.out.println();
    }

    /**
     * This displays a String in reverse using recursion.
     *
     * @param string The String to be displayed in reversed.
     */
    public static void reverseDisplay(String string)
    {
        if (string.length() == 0)
            return;
        System.out.printf("%c", string.charAt(string.length() - 1));
        reverseDisplay(string.substring(0, string.length() - 1));
    }
}
