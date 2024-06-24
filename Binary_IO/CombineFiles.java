package Binary_IO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
    This is a program that reads in names of a number of source  text files and a destination file and then copy the
    contents of all the source file to the destination file.
 */

public class CombineFiles
{
    public static void main(String[] args)
    {
        Scanner inputStream = null;

        // File Object referencing the destination file.
        File destination = new File(args[args.length - 1]);

        // Displays an error message and terminates the program if the number of command arguments used is < 2.
        if (args.length < 2)
        {
            System.out.println("\nUsage: java CombineFiles <sourceFile1> <sourceFile2>...<targetFile>");
            System.exit(1);
        }

        // Displays an error message and terminates the program if the destination file already exist.
        else if (destination.exists())
        {
            System.out.printf("\n'%s' already exists!, Try again.\n", args[args.length - 1]);
            System.exit(2);
        }

        // Try block with resources
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(destination, true)))
        {
            for (int i = 0; i < args.length - 1; ++i)
            {
                // Opens a file for reading
                inputStream = new Scanner(new File(args[i]));

                while (inputStream.hasNext())
                {
                    // Reads a line from the file.
                    String line = inputStream.nextLine();
                    outputStream.writeBytes(line);  // Writes a line of bytes to the destination file.
                }
                outputStream.writeChar('\n');  // Writes a newline to the destination file after reading a file.
            }

            System.out.println("\nFiles copied successfully!");
        }
        catch (IOException ioException)
        {
            System.out.println(ioException.getMessage());
        }
        finally
        {
            if (inputStream != null)
                inputStream.close();  // Closes the Scanner.
        }
    }
}
