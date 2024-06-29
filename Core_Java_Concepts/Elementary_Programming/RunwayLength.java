package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter v in meters/second (m/s) and the
    acceleration a in meters/second squared (m/s2), and displays the minimum runway
    length.
 */

public class RunwayLength
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the velocity in m/s.
        System.out.print("\nEnter the velocity in m/s: ");
        double velocity = input.nextDouble();

        // Reads in the acceleration in m/s2.
        System.out.print("\nEnter the acceleration in m/s2: ");
        double acceleration = input.nextDouble();

        // Calculates the minimum runway required.
        double length = Math.pow(velocity, 2) / (2 * acceleration);

        // Displays the result.
        System.out.printf("\nThe minimum runway length for this airplane is: %.2f\n", length);
    }
}
