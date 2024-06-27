package Exception_Handling_And_Text_IO;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/*
	This is a program that takes a file name and a text as command-line arguments and then
	deletes all occurrence of the text from the file.
 */

public class RemoveText
{
	public static void main(String... doYourBest)
	{
		// Checks if the command-line arguments are complete, if not the program is terminated.
		if (doYourBest.length != 2)
		{
			System.out.println("\nusage: java RemoveText text sourceFile");
			System.exit(1);
		}

		// Creates two file Objects.
		File sourceFile = new File(doYourBest[1]);
		File dummyFile = new File("dummy.txt");

		// Checks if the source file exists, if not, the program is terminated.
		if (!sourceFile.exists())
		{
			System.out.printf("\nThe file %s doesn't exist.\n", doYourBest[1]);
			System.exit(2);
		}

		try (Scanner input = new Scanner(sourceFile);
			 PrintWriter output = new PrintWriter(dummyFile))
		{
			// Reads the text from the source file, replace the given string and write the result to a dummy file.
			while (input.hasNext())
			{
				String str1 = input.nextLine();
				String str2 = str1.replaceAll(doYourBest[0], "");
				output.println(str2);
			}
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}

		// Deletes the source file and renames the dummy file to the source file.
		sourceFile.delete();
		dummyFile.renameTo(sourceFile);
	}
}
