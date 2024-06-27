package Methods;

import java.util.Scanner;

/*
    This is a program that uses a function with the header;
                public static int countLetters(String s)
    to count the number of letters in a String entered by the user.
 */

public class NumberOfLettersInAString
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the String to be processed.
        System.out.printf("\nEnter a String: ");
        String string = input.nextLine();

        // displays the result.
        System.out.printf("\nThe number of letters in '%s' is: %d\n", string, countLetters(string));
    }

    /**
     * Counts the number of letters in a String.
     *
     * @param s The String to be processed.
     * @return The number of letters in the String.
     */
    public static int countLetters(String s)
    {
        int letterCounter = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if ((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 91 && s.charAt(i) <= 127))
                letterCounter++;
        }
        return letterCounter;
    }
}
