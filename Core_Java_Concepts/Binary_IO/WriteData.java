package Binary_IO;

import java.util.Random;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    This is a program that creates a binary file and writes 150 randomly generated integers between 1 - 100 into the
    file if it doesn't exist or appends 150 randomly generated integers between 1 - 100 if the file already exists.
 */

public class WriteData
{
    public static void main(String[] args)
    {
        // A String to hold the file name or path.
        String filePath = "Binary_IO\\numbers.dat";

        // try with resource that creates a FileOutputStream Object.
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath, true))
        {
            // Creates a Random Object.
            Random random = new Random();

            // Writes 150 randomly generated numbers between 1 and 1000 into the file.
            for (int i = 0; i < 150; ++i)
                fileOutputStream.write(random.nextInt(1, 1000));

            // Informs the user that the numbers have been written to the file.
            System.out.println("\n150 randomly generated numbers written to " + filePath + "!");
        }
        catch (IOException ioException)
        {
            System.out.println(ioException.getMessage());
        }
    }
}
