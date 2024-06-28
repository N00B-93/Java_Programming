package Core_Java_Concepts.Binary_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
	This is a program that prompts the user to enter the name of or path to a file and then displays
	each character in the file, and it's number of occurrence in the file.
*/

public class FrequencyOfCharacters
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);

		// Prompts the user to enter the name of or path to a file to read from.
		System.out.print("\nEnter the name of or path to a file to read from: ");
		String filePath = console.nextLine();

		// Creates an array to hold the frequency of occurrence of each character.
		int[] frequency = new int[255];
		
		// Displays an error message and terminates the program if the name of or path to the file is non-existent.
		if (!(new File(filePath)).exists())
		{
			System.out.printf("\nError: '%s' doesn't exists, Try again with a new file name.\n", filePath);
			System.exit(1);
		}

		// try block with resources.
		try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(filePath)))
		{
			// Variable to hold each character read from the file.
			int character;
			
			// Continually reads bytes from the file till EOF is reached.
			while ((character = inputStream.read()) != -1)
				// Counts the Occurrence of each character.
				++frequency[character];
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			// Displays each character and it's numbers of occurrence.
			System.out.printf("\nAll characters read from '%s'\n", filePath);
			displayCharacterAndOccurrence(frequency);
		}

	}
	
	/**
	 * Displays an ASCII character, and it's number of occurrence in a file given an array of integers containing the occurrence of each character.
	 *
	 * @param frequency An integer array containing the frequency of occurrence of each ASCII character.
	 */
	public static void displayCharacterAndOccurrence(int[] frequency)
	{
		System.out.println("\nCharacter\tFrequency");
		for (int i = 0; i < frequency.length; ++i)
		{
			if (frequency[i] != 0)
				System.out.printf("%c\t\t%d\n", i, frequency[i]);
		}
	}
}

