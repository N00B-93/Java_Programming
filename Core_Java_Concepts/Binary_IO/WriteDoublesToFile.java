package Core_Java_Concepts.Binary_IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    This is a program that randomly generates 100 double numbers and writes them to a binary file.
 */

public class WriteDoublesToFile
{
    public static void main(String[] args) throws IOException
    {
        // Output file name.
        String fileName = "floats.dat";

        int numFloats = 100;  // Number of doubles to be generated

        // Minimum and maximum double numbers to be generated.
        double min = 1.0f;
        double max = 100.0f;

        // Try block with resources.
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName)))
        {
            for (int i = 0; i < numFloats; i++)
            {
                // Randomly generates a double.
                double randomDouble = (float) (Math.random() * (max - min)) + min;

                // Writes the generated number to the file.
                dataOutputStream.writeDouble(randomDouble);
            }
            // Informs the user that the numbers have been successfully written to the file.
            System.out.println("\n100 doubles written to " + fileName + " successfully!");
        }
    }
}
