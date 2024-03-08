package Single_Dimensional_Arrays;

import java.util.Scanner;

public class AirlineReservation
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Creates an array of 10 boolean values to represent seats.
        boolean[] seats = {false, false, false, false, false, false, false, false, false, false};

        while (true)
        {
            // Prompts the user to make a reservation ot exit the program.
            System.out.println("\n\t\t\t\tWelcome To $N00B Airlines.");
            System.out.print("""
                                \n1. Make a Reservation
                                \n2. Exit 
                    """);
            System.out.printf("\nSelect an option: ");
            String choice = keyBoard.next();

            switch (choice)
            {
                // Prompts the user to select First class or Economy section then assign seats accordingly,
                // provided that seats are available.
                case "1":
                    System.out.println("\n1. First Class\n2. Economy");
                    System.out.printf("\nSelect an Option: ");
                    choice = keyBoard.next();

                    switch (choice)
                    {
                        case "1":
                            // Checks if a seat is available in the section selected by the user.
                            boolean available = checkAvailableSeats(seats, choice);

                            // Informs the user if a seat is available in the first class section
                            if (available && choice.equals("1"))
                            {
                                System.out.println("\nSeats available in First Class!");
                                int seatNumber = assignSeat(seats, choice);
                                printBoardingPass(seatNumber, "First Class");

                            }
                            else if (!available)
                            {
                                available = checkAvailableSeats(seats, "2");

                                if (available)
                                {
                                    System.out.printf("\nAll First Class seats are Occupied\nWould you like a seat in Economy('y' or 'n')? ");
                                    choice = keyBoard.next();

                                    if (choice.equalsIgnoreCase("y"))
                                    {
                                        int seatNumber = assignSeat(seats, "2");
                                        printBoardingPass(seatNumber, "Economy");
                                    }
                                }
                                else
                                {
                                    System.out.println("\nAll Seats on this plane are occupied\nThe next flight leaves in 3 hours.");
                                }
                            }
                            break;
                        case "2":
                            // Checks if a seat is available in the section selected by the user.
                            available = checkAvailableSeats(seats, choice);

                            // Informs the user if a seat is available in the first class section
                            if (available && choice.equals("2")) {
                                System.out.println("\nSeats available in Economy Class!");
                                int seatNumber = assignSeat(seats, choice);
                                printBoardingPass(seatNumber, "Economy");
                            } else {
                                available = checkAvailableSeats(seats, "1");

                                if (available)
                                {
                                    System.out.printf("\nAll Economy Class seats are Occupied\nWould you like a seat in First Class('y' or 'n')? ");
                                    choice = keyBoard.next();

                                    if (choice.equalsIgnoreCase("y")) {
                                        int seatNumber = assignSeat(seats, "1");
                                        printBoardingPass(seatNumber, "First Class");
                                    }
                                } else {
                                    System.out.println("\nAll Seats on this plane are occupied\nThe next flight leaves in 3 hours.");
                                }
                            }
                            break;
                        default:
                            System.out.println("\nInvalid Option, Try  again.");
                            break;
                    }
                    break;
                case "2":  // Exits the program if the user enter '2'.
                    System.out.println("\nThanks for your Patronage!!!");
                    System.exit(0);
                    break;
                default:  // Handles the case of an invalid user input.
                    System.out.println("\nInvalid Input, Try again");
                    break;
            }
        }
    }

    /**
     * Checks whether seats are available in a particular section of a plane.
     *
     * @param seats The seats in the airplane.
     * @param section The section, 1 for first class and 2 for economy.
     * @return true if seats are available, else false.
     */
    public static boolean checkAvailableSeats(boolean[] seats, String section)
    {
        boolean flag = false;

        if (section.equals("1"))
        {
            for (int i = 0; i < 5; i++)
            {
                if (seats[i])
                    continue;
                else
                    flag = true;
            }
        }
        else if (section.equals("2"))
        {
            for (int i = 5; i < 10; i++)
            {
                if (seats[i])
                    continue;
                else
                    flag = true;
            }
        }
        return flag;
    }

    public static int assignSeat(boolean seats[], String section)
    {
        int seatNumber = 0;

        if (section.equals("1"))
        {
            for (seatNumber = 0; seatNumber < 5; seatNumber++)
            {
                if (seats[seatNumber])
                    continue;
                else
                {
                    seats[seatNumber] = true;
                    break;
                }
            }
        }
        else if (section.equals("2"))
        {
            for (seatNumber = 5; seatNumber < 10; seatNumber++)
            {
                if (seats[seatNumber])
                    continue;
                else
                {
                    seats[seatNumber] = true;
                    break;
                }
            }
        }
        return seatNumber;
    }

    public static void printBoardingPass(int seatNumber, String section)
    {
        System.out.println("\n********Boarding Pass********");
        System.out.printf("Seat Number: 0%d\nSection: %s", seatNumber, section);
        System.out.println("\n*****************************");
    }
}
