package Binary_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
	This is a program that prompts the user to enter the name of a file encrypted by the EncryptFile
	program, reads the file content, decrypts it and writes the output to a new file whose name is supplied by the user.
*/

public class EncryptFile
{

    public static void main(String... args)
    {
        // Creates a Scanner Object.
        Scanner console = new Scanner(System.in);

        // Prompts the user to enter the name of the file to be decrypted.
        System.out.print("\nPlease enter the name of or path to the file to be decrypted: ");
        String filePath = console.nextLine();

        // Prompts the user to enter the name of or path to the output file.
        System.out.print("\nPlease enter the name of or path to the output file: ");
        String outputFile = console.nextLine();

	// Displays an error message and terminates the program if the output file exists already.
	if ((new File(outputFile)).exists())
	{
		System.out.printf("\nError: '%s' already exists! Try again with a new file name or path.\n", outputFile);
		System.exit(1);
	}
	
	// File Object referencing the input file.
        File file = new File(filePath);
	
	// try block with resources.
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile)))
	{
		// Represents a byte read from the file.
		int input;
		
		// Continuously read data from the input file till the EOF is reached.
		while ((input = inputStream.read()) != -1)
		{
			// Writes a byte to the output file after shifting it by subtracting 10 from it.
                	outputStream.write((byte) (input - 10));
		}

            System.out.printf("\nData decrypted and written to '%s'!\n", outputFile);
        }
	catch (IOException ex)
	{
            System.out.println(ex.getMessage());
        }
    }
}

