package Core_Java_Concepts.Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a letter and
    check whether the letter is a vowel or consonant.
 */

public class VowelOrConsonant
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // prompts the user to enter a single letter.
        System.out.printf("\nEnter a letter: ");
        char letter = input.next().charAt(0);

        // Creates a String containing all vowels.
        String vowel = "aeiouAEIOU";

        // Creates a String containing all consonant.
        String consonant = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        // Determines if the letter is a consonant or vowel and displays the result.
        if (vowel.contains((letter + "").toLowerCase()))
            System.out.printf("\n%s is a Vowel\n", letter);
        else if (consonant.contains(letter + ""))
            System.out.printf("\n%s is a consonant\n", letter);
    }
}
