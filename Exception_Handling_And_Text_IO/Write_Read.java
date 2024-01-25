package Exception_Handling_And_Text_IO;

import java.util.Arrays;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

/*
    This is a program that creates a file, write 100 integers into the file and then read in the
    numbers into an array, sort them and displays the sorted numbers.
 */

public class Write_Read
{
    public static void main(String[] args)
    {
        // Creates a Random Object.
        Random random = new Random();

        // Creates a file Object that points to the file 'numbers.txt'.
        File file = new File("numbers.txt");

        try (PrintWriter writer = new PrintWriter(file))
        {
            for (int i = 0; i < 100; i++)
            {
                // Writes 100 integers in the range 1 to 1000 into the file numbers.txt.
                writer.print(random.nextInt(1, 1000) + " ");
            }

            System.out.println("\nNumbers written to file successfully.");

            // Creates an array to store the numbers read from the file.
            int[] numbers = new int[100];
            int i = 0;

            Scanner input = new Scanner(file);

            // Reads in numbers from the file into the array.
            while (input.hasNext())
            {
                numbers[i] = input.nextInt();
                i++;
            }

            // Sorts the numbers.
            Arrays.sort(numbers);

            // Displays the sorted numbers.
            System.out.println("\nThe sorted numbers are: ");

            for (int number: numbers)
                System.out.printf("%d ", number);

        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
