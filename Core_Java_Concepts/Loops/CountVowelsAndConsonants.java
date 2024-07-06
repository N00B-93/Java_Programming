package Core_Java_Concepts.Loops;

import java.util.Scanner;

/*
 	This is a program prompts the user to enter a s	tring, and displays the number of 
	vowels and consonants in the string.
*/

public class CountVowelsAndConsonants
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter the String to be processed.
		System.out.print("\nEnter a String: ");
		String string = input.nextLine();
		
		// Creates two String variable holding upper and lower case consonants an vowels.
		String vowels = "aeiouAEIOU";
		String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

		// Initializes the vowel and consonant counters.
		int vowelCounter = 0, consonantCounter = 0;

		for (int i = 0; i < string.length(); i++)
		{
			// Increments vowelCounter by 1 in the current character is a vowel 
			if (vowels.contains(string.charAt(i) + ""))
				vowelCounter++;
			// Increments consonantCounter by 1 if the current character is a consonant.
			else if (consonants.contains(string.charAt(i) + ""))
				consonantCounter++;
		}
		// Displays the result.
		System.out.printf("\nNumber of Vowels in %s: %d\nNumber of Consonants in %s: %d\n", string, vowelCounter, string, consonantCounter);
	}
}

