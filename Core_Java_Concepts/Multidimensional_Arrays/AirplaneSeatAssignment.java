package Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AirplaneSeatAssignment
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner console = new Scanner(System.in);

        // Creates a 2-Dimensional char array with 13 rows and 7 columns.
        char[][] airplaneSeats = new char[13][6];

        // Initializes the array representing the airline seats with '*'.
        initializeArray(airplaneSeats);

        while (true)
        {
            // Displays the main menu.
            System.out.println("\n\t\tWelcome to N00B's Airline.\n");

            // Displays all the rows of seat in the airplane.
            displaySeats(airplaneSeats);

            //  Prompts the user to select a ticket type.
            System.out.println("\n1. First Class\n2. Business Class\n3. Economy");
            System.out.printf("\nSelect a Ticket type: ");
            String ticketType = console.next();


            switch (ticketType)
            {
                case "1":
                    if (!isSectionFilled(1, airplaneSeats)) {
                        System.out.println("\nSeats available in First Class are:");
                        showAvailableSeats(1, airplaneSeats);

                        System.out.printf("\nEnter a seat row and column: ");
                        String seatRow = console.next();
                        String seatColumn = console.next();

                        // Validates the row and column entered by the user.
                        if (seatRow.equals("1") || seatRow.equals("2") || seatColumn.equals("1") ||
                                seatColumn.equals("2") || seatColumn.equals("3") || seatColumn.equals("4") ||
                                seatColumn.equals("5") || seatColumn.equals("6")) {
                            while (!isSeatAvailable(Integer.parseInt(seatRow), Integer.parseInt(seatColumn), airplaneSeats)) {
                                System.out.printf("\nSeat %s is occupied, please select an empty seat", seatColumn);
                                System.out.printf("\nEnter a seat row and column: ");
                                seatRow = console.next();
                                seatColumn = console.next();
                            }

                            airplaneSeats[Integer.parseInt(seatRow) - 1][Integer.parseInt(seatColumn) - 1] = 'X';
                            System.out.println("\nSeat assigned!");
                        } else {
                            System.out.println("\nError: Invalid row or column number, Try again.\n");
                            break;
                        }
                    }
                    else
                        System.out.println("section filled, Try other sections.");
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("\nError: Invalid ticket type selected, Select ticket type 1, 2 or 3.\nTry again.");
                    break;
            }

            //break;
        }

        // Closes the scanner Object.
        //console.close();
    }
    
    /**
     * Initializes all the cells in a 2-D array representing airplane seats with '*'
     * 
     * @param airplaneSeats The airplane containing passenger seats.
     */
    public static void initializeArray(char[][] airplaneSeats)
    {
        for (char[] row: airplaneSeats)
        {
            Arrays.fill(row, '*');
        }
    }

    /**
     * Display all the seats in an airplane.
     * 
     * @param airplaneSeats The airplane containing passenger seats.
     */
    public static void displaySeats(char[][] airplaneSeats)
    {
        int k = 0;

        System.out.println("\t\tA B C\tD E F\n");
        for (char[] seat: airplaneSeats)
        {
            if (k == 0)
                System.out.println("First Class:\n");
            else if (k == 2)
                System.out.println("\nBusiness Class:\n");
            else if (k == 7)
                System.out.println("\nEconomy:\n");
            System.out.printf("Row %d\t\t", k + 1);

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

    public static void showAvailableSeats(int section, char[][] airplaneSeats)
    {
        if (section == 1)
        {
            for (int row = 0; row <= 1; row++)
            {
                System.out.printf("Row %d: ", row + 1);
                for (int col = 0; col <= 5; col++)
                {
                    if (airplaneSeats[row][col] == '*')
                        System.out.printf("%d ", col + 1);
                }
                System.out.println();
            }
        }
    }

    public static boolean isSeatAvailable(int row, int col, char[][] airplaneSeats)
    {
        return airplaneSeats[row - 1][col - 1] == '*';
    }

    public static boolean isSectionFilled(int choice, char[][] airplaneSeats)
    {
        if (choice == 1)
        {
            for (int row = 0; row < 2; row++)
            {
                for (int col = 0; col < 6; col++)
                {
                    if (airplaneSeats[row][col] == '*')
                        return true;
                }
            }
        }
        else if (choice == 2)
        {
            for (int row = 2; row < 6; row++)
            {
                for (int col = 0; col < 6; col++)
                {
                    if (airplaneSeats[row][col] == '*')
                        return true;
                }
            }
        }
        else
        {
            for (int row = 7; row < 12; row++)
            {
                for (int col = 0; col < 6; col++)
                {
                    if (airplaneSeats[row][col] == '*')
                        return true;
                }
            }
        }
            return false;
    }
}
