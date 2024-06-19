package Binary_IO;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

/*
    This is a program that prompts the user to enter the name of or the path to a file, reads the numbers in the file
    and then determines the maximum and the minimum numbers in the file.
 */

public class MaximumAndMinimumValues
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner console = new Scanner(System.in);

        // Prompts the user to enter the name of the input file.
        System.out.printf("\nPlease enter the name of or path to the file containing double numbers: ");
        String filePath = console.nextLine();

        // Variables to hold the maximum and minimum values.
        double maximum = 0, minimum = 0;

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(filePath)))
        {
            maximum = inputStream.readDouble();
            minimum = maximum;

            double number;

            while ((number = inputStream.readDouble()) != -1)
            {
                // Determines the maximum and minimum numbers in the file.
                if (number > maximum)
                    maximum = number;
                else if (number < minimum)
                    minimum = number;
                System.out.printf("%.2f ", number);
            }
        }
        catch (IOException ioException)
        {
            System.out.println(ioException.getMessage());
        }
        finally
        {
            // Displays the maximum and minimum values in the file.
            System.out.printf("\nMaximum = %.2f\nMinimum = %.2f\n", maximum, minimum);
        }
    }
}
