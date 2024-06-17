package Binary_IO;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/*
	This is a program that prompts the user to enter the name of a binary file containing floating point numbers
	and then reads and determines the sum of all the numbers in the file.
 */

public class SumOfNumbers
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.a
		Scanner console = new Scanner(System.in);
		double sumOfNumbers = 0.0, number;

		// Prompts the user to enter the name of or path to the file.
		System.out.print("\nEnter the name or path to a file: ");
		String filePath = console.nextLine();

		try (FileInputStream fileInput = new FileInputStream(filePath);  // try block with resources.
			DataInputStream dataInput = new DataInputStream(fileInput))
		{
			// Reads numbers from the binary file.
			while (true)
			{
				number = dataInput.readDouble();
				sumOfNumbers += number;  // Sum all the numbers in the file.
			}
		}
		catch (IOException ex)
		{
			System.out.println("\nAll numbers read from " + filePath);

			// Displays the sum of the numbers in the file.
			System.out.printf("\nThe sum of numbers in '%s' is: %.2f\n", filePath, sumOfNumbers);
		}
	}
}
