package Binary_IO;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.Scanner;

/**
	This is a program that prompts the user to enter the name or path to a file and the reads the 
	contents of the file, shift each byte by adding 10 to it and writes the result to a new file whose name is provided by the user.
*/

public class EncryptFile
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);

		// Prompts the user to enter the name of the file to be encrypted.
		System.out.print("\nPlease enter the name of or path to the file to be encrypted: ");
		String filePath = console.nextLine();

		// Prompts the user to enter the name of or path to the output file.
		System.out.print("\nPlease enter the name of or path to the output file: ");
		String outputFile = console.nextLine();
		
		// Displays an error message and terminates the program if the output file already exists.
		if (new File(outputFile).exists())
		{
			System.out.printf("\n'%s' already exists, Try again with a new file name or path.\n", outputFile);
			System.exit(1);
		}

		// File Object to represent the input file containing data to be encrypted.
		File file = new File(filePath);
		
		// Try block with resources.
		try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile)))
		{
			// Represents input read from a file.
			int input;
			
			// Reads bytes continuously from the input file till the EOF is reached.
			while ((input = inputStream.read()) != -1)
			{
				// Writes a byte whose value is shifted by adding 10 to it.
				outputStream.write((byte) (input + 10));
			}

			System.out.printf("\nData encrypted and written to '%s'!\n", outputFile);
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

