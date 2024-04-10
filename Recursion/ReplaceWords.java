package Recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    This is a program that takes a directory or a file name and two words (the first to be replaced with the second) and
    then replaces all occurrences of the first word with the second word in the file or directory using recursion.
 */

public class ReplaceWords
{
    // Creates a Scanner Object.
    public static Scanner input;

    // Creates a PrintWriter Object.
    public static PrintWriter printWriter;

    public static void main(String[] args)
    {
        // Displays a usage message if the required amount of command line argument is missing.
        if (args.length != 3)
        {
            System.out.println("\nUsage: java ReplaceWords.java directoryName oldWord newWord");
            System.exit(1);
        }

        // Creates a File Object.
        File file = new File(args[0]);

        try
        {
            // Makes a call to the recursive function.
            replaceWords(file, args[1], args[2]);

            // Displays a message after replacing the words.
            System.out.println("\n" + args[1] + " replaced with " + args[2] + " Successfully!");
        }
        catch (IOException ioException)
        {
            System.out.println(ioException.getMessage());
        }
    }

    /**
     * This replaces all occurrence of a word with a new word in a file recursively.
     *
     * @param file The file or directory name.
     *
     * @param oldWord The word to be replaced.
     *
     * @param newWord The new word.
     *
     * @throws FileNotFoundException if the file or the directory doesn't exist.
     */
    public static void replaceWords(File file, String oldWord, String newWord) throws FileNotFoundException
    {
        if (file.isDirectory())
        {
            File[] files = file.listFiles();

            if (files != null)
            {
                for (File myFile: files)
                {
                    replaceWords(myFile, oldWord, newWord);
                }
            }
        }
        else
        {
            input = new Scanner(file);
            File outputFile = new File(file.getParent(), "__tempFile__.txt");
            printWriter = new PrintWriter(outputFile);

            while (input.hasNextLine())
            {
                String content = input.nextLine();
                String modifiedString = content.replaceAll(oldWord, newWord);
                printWriter.println(modifiedString);
            }
            String fileName = file.getName();
            input.close();
            printWriter.close();
            file.delete();
            outputFile.renameTo(new File(outputFile.getParent(), fileName));
        }
    }
}
