package Core_Java_Concepts.Binary_IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
    This is a program that takes the names of a source file and a destination file as command-line arguments and then
    copies data from the source file encoded in UTF to the destination file.
 */

public class TextToUTF
{
    public static void main(String[] args)
    {
        // Creates two file Objects to represent the source and destination file.
        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);

        // Displays an error message and terminates the program if the user uses an incorrect
        // number of command-line arguments
        if (args.length != 2)
        {
            System.out.println("\nUsage: java TextToUTF <sourceFile.txt> <destinationFile.dat>");
            System.exit(1);
        }
        // Displays an error message and terminates the program is the source file doesn't exist.
        else if (!inputFile.exists())
        {
            System.out.printf("\n'%s' doesn't exist, Try again.\n", args[0]);
            System.exit(2);
        }
        // Displays an error message and terminates the program is the destination file already exist.
        else if (outputFile.exists())
        {
            System.out.printf("\n'%s' already exists, Try again.\n", args[1]);
            System.exit(3);
        }

        try (Scanner input = new Scanner(inputFile);
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(args[1])))
        {
            while (input.hasNext())
            {
                // Reads a line from the source file.
                String line = input.nextLine();
                outputStream.writeUTF(line + "\n");  // Writes a line followed by a newline to the destination file.
            }
        }
        catch (IOException ioException)
        {
            System.out.println(ioException.getMessage());
        }
    }
}
