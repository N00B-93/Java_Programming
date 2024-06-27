package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter two strings and
    reports whether the second string is a substring of the first string.
 */

public class CheckSubString
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the strings to be compared.
        System.out.printf("\nEnter String 1: ");
        String string1 = input.nextLine();

        System.out.printf("\nEnter String 2: ");
        String string2 = input.nextLine();

        // Determines whether string2 is a substring of string1 and displays the result.
        if (string1.contains(string2))
            System.out.printf("\n%s is a substring of %s\n", string2, string1);
        else
            System.out.printf("\n%s is not a substring of %s\n", string2, string1);
    }
}
