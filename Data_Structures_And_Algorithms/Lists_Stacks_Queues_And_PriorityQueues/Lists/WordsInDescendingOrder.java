package Lists_Stacks_Queues_And_ProirityQueues;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

/**
	This is a program that takes the name or path to a text file as a command line argument, reads 
	Strings starting with letters only from the file, adds them to an ArrayList and sorts and displays the Strings in descending order.
*/

public class WordsInDescendingOrder
{
	public static void main(String... args)
	{
		// Checks if the user specifies the file name or path as a command line argument.
		if (args.length != 1)
		{
			System.out.println("\nUsage: java WordsInDescendingOrder.java <fileNameOrPath>");
			System.exit(1);
		}

		// Creates a Collection to store words read from the file.
		ArrayList<String> words = new ArrayList<>();

		try (Scanner input = new Scanner(new File(args[0])))
		{
			// Reads words from the file.
			while (input.hasNext())
			{
				String word = input.next();
				if (word.matches("[a-zA-Z]+$"))
					words.add(word.toLowerCase());
			}

			// Displays the words before sorting.
			System.out.println("\nWords before sorting: ");
			words.forEach(e -> System.out.println(e));
			
			// Sorts the words using selection sort in descending order.
			Collections.sort(words, Collections.reverseOrder());
			
			// Displays the sorted words.
			System.out.println("\nWords after Sorting: ");
			words.forEach(e -> System.out.println(e));

		}
		catch (FileNotFoundException ex)
		{
			System.out.println("\n" + ex.getMessage());
		}

	}		
}

