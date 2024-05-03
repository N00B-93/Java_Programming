package Multidimensional_Arrays;

import java.util.Scanner;

public class AirplaneSeatAssignment
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner console = new Scanner(System.in);

        // Creates a 2-Dimensional char array with 13 rows and 7 columns.
        char[][] aiplaneSeats = new char[13][6];

        // Initiallizes the array representing the airline seats with '*'.
        initializeArray(aiplaneSeats);

        // Displays the main menu.
        System.out.println("\n\t\tWelcome to N00B's Airline.\n");

        

        // Closes the scanner Object.
        console.close();
    }
    
    public static void initializeArray(char[][] airplaneSeats)
    {
        for (char[] row: airplaneSeats)
        {
            for (int i = 0; i < row.length; ++i)
            {
                row[i] = '*';
            }
        }
    }

    public static void displayAvailableSeats(char[][] airplaneSeats)
    {
        int k = 0;
        System.out.println("\tA B C\tD E F\n");
        for (char[] seat: airplaneSeats)
        {
            System.out.printf("Row %d\t", k + 1);
            k++;
            for (int i = 0; i < seat.length; ++i)
            {
                System.out.printf("%c ", seat[i]);
                if (i == 2)
                    System.out.printf("\t");
            }
            System.out.println();
        }
    }
}
