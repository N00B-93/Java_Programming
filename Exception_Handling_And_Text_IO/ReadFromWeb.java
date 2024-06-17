package Exception_Handling_And_Text_IO;

import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.util.ArrayList;

/*
	This is a program that reads an unspecified number of scores from a web page
	then calculates the average of the scores.
 */

public class ReadFromWeb
{
	public static void main(String... args)
    {
        // Creates an ArrayList Object to hold the scores.
        ArrayList<Double> scores = new ArrayList<>();

        try
        {
            // Creates a URL Object with a specified url.
            URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");

            // Opens the url stream.
            Scanner scanner = new Scanner(url.openStream());

            // Reads in the data from the website.
            while (scanner.hasNext())
            {
                if (!scanner.next().equals(" "))
                    scores.add(scanner.nextDouble());
            }
            scanner.close();
        }
        catch (MalformedURLException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }

        double sum = 0;

        // Calculates the sum of all scores.
        System.out.print("\nThe scores are: ");
        for (Double score : scores)
        {
            System.out.printf("%.2f ", score);
            sum += score;
        }

        // Calculates the average and displays the result.
        double average = sum / scores.size();
        System.out.printf("\n\nSum of scores: %.2f\nAverage score: %.2f\n\n", sum, average);
    }
}
