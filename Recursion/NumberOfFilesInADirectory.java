package Recursion;

import java.io.File;
import java.util.Scanner;

public class NumberOfFilesInADirectory
{
    public static int numberOfFile = 0;
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter a directory name.
        System.out.printf("\nEnter a directory name: ");
        String directoryName = input.nextLine();

        // Checks if the user input is a directory name.
        if (!new File(directoryName).isDirectory())
        {
            System.out.printf("\n%s is not a directory, Try again with a valid directory name.\n", directoryName);
            System.exit(1);
        }

        // Displays the number of files in the directory and it's subdirectories.
        System.out.printf("\nThe number of files in %s is: %d\n\n", directoryName, numberOfFiles(new File(directoryName)));

    }
    public static int numberOfFiles(File directoryName)
    {

        File[] files = directoryName.listFiles();

        for (int i = 0; i < files.length; ++i)
        {
            if (files[i].isFile())
            {
                numberOfFile++;
                return numberOfFiles(files[++i]);
            }
            else
            {
                File[] dirContent = files[i].listFiles();
                for (File myFiles: dirContent)
                    return numberOfFiles(myFiles);
            }
        }
        return numberOfFile;
    }
}
