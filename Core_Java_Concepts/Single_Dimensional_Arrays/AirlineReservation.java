package Core_Java_Concepts.Single_Dimensional_Arrays;

import java.util.Scanner;

/*
    QUESTION: A small airline has just purchased a computer for its new automated
    reservation system. You’ve been asked to develop the new system. You’re to write an application
    to assign seats on each flight of the airline’s only plane (capacity: 10 seats).

    Your application should display the following alternatives: Please type 1 for First Class and
    Please type 2 for Economy. If the user types 1, your application should assign a seat in the first class
    section (seats 0–4). If the user types 2, your application should assign a seat in the economy
    section (seats 5–9). Your application should then display a boarding pass indicating the person’s
    seat number and whether it’s in the first-class or economy section of the plane.

    Use a one-dimensional array of primitive type boolean to represent the seating chart of the
    plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
    each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
    no longer available.

    When the economy section is full, your application should ask the person if it’s acceptable to be placed in the first-class
    section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
                "Next flight leaves in 3 hours."
 */

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

                            // Informs the user if a seat is available in the First class section
                            if (available && choice.equals("1"))
                            {
                                System.out.println("\nSeats available in First Class!");

                                // Assigns a seat in the First class section to the user.
                                int seatNumber = assignSeat(seats, choice);

                                // Displays the user's boarding pass.
                                printBoardingPass(seatNumber, "First Class");

                            }
                            else if (!available)  // Handles case when seats are no longer available in First class.
                            {
                                // Checks if seats are available in Economy.
                                available = checkAvailableSeats(seats, "2");

                                if (available)
                                {
                                    // Asks the user if he/she wants a seat in Economy class.
                                    System.out.printf("\nAll First Class seats are Occupied\nWould you like a seat in Economy('y' or 'n')? ");
                                    choice = keyBoard.next();

                                    if (choice.equalsIgnoreCase("y"))
                                    {
                                        // Assigns a seat in Economy class to the user.
                                        int seatNumber = assignSeat(seats, "2");

                                        // Displays the user's boarding pass.
                                        printBoardingPass(seatNumber, "Economy");
                                    }
                                    // Returns control to the main menu if the user selected 'n'.
                                    else if (choice.equalsIgnoreCase("n"))
                                        break;
                                    else  // Handles case when the user enters an invalid input.
                                        System.out.println("\nInvalid input, Try again.");
                                }
                                else
                                {
                                    // Informs the user that all seats in the airplane are occupied and that the next flight
                                    // will be available in 3 hours.
                                    System.out.println("\nAll Seats on this plane are occupied\nThe next flight leaves in 3 hours.");
                                }
                            }
                            break;
                        case "2":
                            // Checks if a seat is available in the Economy section.
                            available = checkAvailableSeats(seats, choice);

                            // Informs the user if a seat is available in the Economy class section
                            if (available && choice.equals("2"))
                            {
                                System.out.println("\nSeats available in Economy Class!");

                                // Assigns a seat to the user in Economy class.
                                int seatNumber = assignSeat(seats, choice);

                                // Displays the boarding pass.
                                printBoardingPass(seatNumber, "Economy");
                            }
                            else
                            {
                                // Checks if seats are available in First class.
                                available = checkAvailableSeats(seats, "1");

                                if (available)
                                {
                                    // Informs the user that all Economy class seats are occupied then asks the user
                                    // if he/she wants a seat in first class.
                                    System.out.printf("\nAll Economy Class seats are Occupied\nWould you like a seat in First Class('y' or 'n')? ");
                                    choice = keyBoard.next();

                                    if (choice.equalsIgnoreCase("y"))
                                    {
                                        // Assigns a seat for the user in First class.
                                        int seatNumber = assignSeat(seats, "1");

                                        // Displays the user's boarding pass.
                                        printBoardingPass(seatNumber, "First Class");
                                    }
                                    // Returns control to the main menu if the user doesn't want a seat in Economy class.
                                    else if (choice.equalsIgnoreCase("n"))
                                        break;
                                    else
                                        // Handles the case of an invalid user input.
                                        System.out.println("\nInvalid input, Try again.");
                                }
                                else
                                {
                                    // Informs the user that all seats in the airplane are occupied and that the next flight
                                    // will be available in 3 hours.
                                    System.out.println("\nAll Seats on this plane are occupied\nThe next flight leaves in 3 hours.");
                                }
                            }
                            break;
                        default:  // Handles the case of an invalid user input.
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
                if (!seats[i])
                    return true;
            }
        }
        else if (section.equals("2"))
        {
            for (int i = 5; i < 10; i++)
            {
                if (!seats[i])
                    return true;
            }
        }
        return flag;
    }

    /**
     * Assigns a seat number in a section of the plane if seats are available.
     *
     * @param seats Assigns a seat in an airplane section if seats are available.
     * @param section The section, either first class or economy.
     * @return The assigned seat number.
     */
    public static int assignSeat(boolean[] seats, String section)
    {
        int seatNumber = 0;

        if (section.equals("1"))
        {
            for (seatNumber = 0; seatNumber < 5; seatNumber++)
            {
                if (!seats[seatNumber])
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
                if (!seats[seatNumber])
                {
                    seats[seatNumber] = true;
                    break;
                }
            }
        }
        return seatNumber;
    }

    /**
     * Print boarding pass.
     *
     * @param seatNumber The assigned seat number.
     * @param section The section, either first class or economy.
     */
    public static void printBoardingPass(int seatNumber, String section)
    {
        System.out.println("\n********Boarding Pass********");
        System.out.printf("Seat Number: 0%d\nSection: %s", seatNumber, section);
        System.out.println("\n*****************************");
    }
}
