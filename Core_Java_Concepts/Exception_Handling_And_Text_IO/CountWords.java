package Exception_Handling_And_Text_IO;

import java.net.MalformedURLException;
import java.util.Scanner;
import java.net.URL;
import java.io.IOException;

/*
    This is a program that determines the number of words in President
    Abraham Lincoln’s Gettysburg address reads from a file at the address: http://cs.armstrong.edu/liang/data/
    Lincoln.txt.
 */

public class CountWords
{
    public static void main(String[] args)
    {
        // Variable representing the URL that contains the address.
        String urlString = "http://cs.armstrong.edu/liang/data/Lincoln.txt.";

        // Word counter variable.
        int wordCount = 0;

        try
        {
            // Creates a URL Object with a specified URL.
            URL url = new URL(urlString);

            // Creates a Scanner Object connected to the URL stream.
            Scanner input = new Scanner(url.openStream());

            // Reads line from the file and counts the number of words in each line.
            while (input.hasNext())
            {
                String line = input.nextLine();
                String[] words = line.split(" ");
                wordCount += words.length;
            }

            // Displays the number of words in the address.
            System.out.printf("\nThe number of words in President\n" +
                    "Abraham Lincoln’s Gettysburg address is: %d\n", wordCount);
        }
        catch (MalformedURLException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
