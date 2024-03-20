package Recursion;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a String and a character and then determines
    the number of occurrence of that character in the String.
 */

public class CountOccurrenceOfCharacter
{
    public static void main(String[] args) {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the suer to enter a String.
        System.out.printf("\nEnter a String: ");
        String string = input.nextLine();

        // Prompts the user to enter a Character.
        System.out.printf("\nEnter the character to be counted: ");
        char character = input.nextLine().charAt(0);
    }

    public static int count(String string, char character)
    {

    }
}
