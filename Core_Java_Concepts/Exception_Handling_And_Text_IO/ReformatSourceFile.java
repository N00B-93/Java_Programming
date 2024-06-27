package Exception_Handling_And_Text_IO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    This is a program that converts a Java source
    code from the next-line brace style to the end-of-line brace style, taking input from the command line.
 */

public class ReformatSourceFile
{
    public static void main(String... doYourBest)
    {
        // Checks if the command-line arguments are complete, if not the program is terminated.
        if (doYourBest.length != 1)
        {
            System.out.println("\nusage: java ReformatSourceFile sourceFile");
            System.exit(1);
        }

        // Creates two file Objects.
        File sourceFile = new File(doYourBest[0]);
        File dummyFile = new File("dummy.txt");

        // Checks if the source file exists, if not, the program is terminated.
        if (!sourceFile.exists())
        {
            System.out.printf("\nThe file %s doesn't exist.\n", doYourBest[0]);
            System.exit(2);
        }

        try (Scanner input = new Scanner(sourceFile);
             PrintWriter output = new PrintWriter(dummyFile))
        {
            // Reads the text from the source file, replace the occurrence of { with \n{(newline followed by {).
            while (input.hasNext())
            {
                String str1 = input.nextLine();
                String str2 = str1.replace("{", "\n{");
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
