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
        ArrayList<Integer> scores = new ArrayList<>();

        // Initializes the URL variable to null.
        URL url = null;

        try (Scanner scanner = new Scanner(url.openStream()))
        {
            // Assigns the url variable to a URL Object.
            url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");

            // Reads in the data from the website.
            while (scanner.hasNext())
            {
                if (scanner.next().equals(" "))
                    continue;
                else
                    scores.add(scanner.nextInt());
            }
        }
        catch (MalformedURLException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }

        int sum = 0;

        // Calculates the sum of all scores.
        System.out.print("\nThe scores are: ");
        for (Integer score : scores)
        {
            System.out.printf("%d ", score);
            sum += score;
        }

        // Calculates the average and displays the result.
        double average = sum / scores.size();
        System.out.printf("\n\nSum of scores: %d\nAverage score: %.2f\n\n", sum, average);
    }
}
