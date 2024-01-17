package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a string and displays
    its length and its first character
 */

public class ProcessAString
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter a string.
        System.out.printf("\nEnter a string to be processed: ");
        String string = input.nextLine();

        // Displays the result.
        System.out.printf("\nThe length of the string is %d\nThe first character is: %c\n",
                string.length(), string.charAt(0));
    }
}
