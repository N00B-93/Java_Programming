package Core_Java_Concepts.Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Ackermann’s function is a recursive mathematical algorithm that can be used to test how well
    a computer performs recursion.
    This is a program that prompts the user to enter the values of m and n and then displays the result of the Ackermann's
    function for those values.
 */

public class AckermannsFunction
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        while (true)
        {
            try
            {
                // Prompts the user to enter the values of m.
                System.out.printf("\nEnter the value of m: ");
                int m = input.nextInt();

                // Prompts the user to enter the value of n.
                System.out.printf("\nEnter the value of n: ");
                int n = input.nextInt();

                // Displays an error message if any of the user input is < 0.
                if (m < 0 || n < 0)
                {
                    System.out.printf("\nInvalid input!!!\nThe values of m and n should be > 0");
                    continue;
                }

                // Displays the result.
                System.out.printf("\nThe value of the Ackermann's Function for m = %d and n = %d is: %d\n\n", m, n, ackermann(m, n));
                break;
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("\nInvalid input, Try again.");
                input.nextLine();
            }
        }
    }

    /**
     * This returns the value of the Ackermann's function for a given m and n.
     *
     * @param m The value of m.
     * @param n The value of n.
     * @return The value of the Ackermann's function for a given m and n.
     */
    public static int ackermann(int m, int n)
    {
        if (m == 0)
            return n + 1;
        else if (n == 0)
            return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}
