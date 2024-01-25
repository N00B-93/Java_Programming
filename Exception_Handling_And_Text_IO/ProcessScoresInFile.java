package Exception_Handling_And_Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/*
    This is a program that prompts the user to enter the name of a file
    containing and unspecified amount of scores and then calculates the summand the average of the scores.
 */

public class ProcessScoresInFile
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in name of the file containing the scores.
        System.out.printf("\nEnter the name of the file to read scores from: ");
        String filename = input.next();

        // Points the file Object to the file containing scores.
        File file = new File(filename);

        // Checks if the file exists, Terminates the program if the file doesn't exist.
        if (!file.exists())
        {
            System.out.printf("\nFile '%s' doesn't exist.", file.getName());
            System.exit(1);
        }

        try
        {
            input = new Scanner(file);

            // Creates a list to hold scores.
            ArrayList<Double> scores = new ArrayList<>();

            // Reads an unspecified amount of scores into the list.
            while (input.hasNext())
            {
                scores.add(input.nextDouble());
            }

            // Initializes the sum variables.
            double sum = 0;

            for (int i = 0; i < scores.size(); i++)
            {
                // Calculate the sum of all scores.
                sum += scores.get(i);
            }

            // Displays the sum and average of the score.
            System.out.printf("\nSum = %.2f\n", sum);
            System.out.printf("\nAverage = %.2f\n", sum / scores.size());
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
