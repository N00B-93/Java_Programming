package Recursion;

import java.io.File;
import java.util.Scanner;

/*
    This is a program that prompts the user to enter a directory name and then displays the number of Recursion.files in the
    directory and its subdirectories.
 */

public class NumberOfFilesInADirectory
{
    public static int numberOfFile = 0;
    
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter a directory name.
        System.out.printf("\nEnter an Absolute pathname to a  directory: ");
        String directoryName = input.nextLine();

        File file = new File(directoryName);

        // Checks if the user input is a directory name.
        if (!file.isDirectory())
        {
            System.out.printf("\n%s is not a directory, Try again with a valid directory name.\n", directoryName);
            System.exit(1);
        }

        // Displays the number of Recursion.files in the directory and it's subdirectories.
        System.out.printf("\nThe number of Recursion.files in %s is: %d\n\n", directoryName,
                numberOfFiles(file));
    }

    /**
     * This returns the number of Recursion.files in a directory using recursion.
     * @param directoryName The name of the directory whose number of Recursion.files is to be determined.
     * @return The number of Recursion.files in the directory.
     */
    public static int numberOfFiles(File directoryName)
    {
        File[] files = directoryName.listFiles();

        if (files != null)
        {
            for (File myFile: files)
            {
                if (myFile.isFile())
                {
                    numberOfFile++;
                }
                else if (myFile.isDirectory())
                {
                    numberOfFiles(myFile);
                }
            }
        }
        return numberOfFile;
    }
}
