package Binary_IO;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.EOFException;

public class SumOfNumbers
{
	public static void main(String... args)
	{

		// Creates a Scanner Object.a
		Scanner console = new Scanner(System.in);
		double sumOfNumbers = 0.0, number = 0.0;

		// Prompts the user to enter the name of or path to the file.
		System.out.print("\nEnter the name or path to a file: ");
		String filePath = console.nextLine();

		try (FileInputStream fileInput = new FileInputStream(filePath);
			DataInputStream dataInput = new DataInputStream(fileInput))
		{
			while (true)
			{
				number = dataInput.readDouble();
				sumOfNumbers += number;
			}
		}
		catch (IOException ex)
		{
			System.out.println("\nAll numbers read from " + filePath);
			System.out.printf("\nThe sum of numbers in '%s' is: %.2f\n", filePath, sumOfNumbers);
		}
	}
}

