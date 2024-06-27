package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that displays a random uppercase letter
    using the Math.random() method.
 */

public class RandomUpperCaseCharacter
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Displays an Uppercase letter.
        System.out.printf("\nRandom Uppercase Letter: %c\n",  (65 + (int)(Math.random() * 26)));
    }
}
