package Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter the starting velocity v0 in meters/
    second, the ending velocity v1 in meters/second, and the time span t in seconds,
    and displays the average acceleration.
 */

public class Acceleration
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the initial velocity.
        System.out.print("\nEnter the initial velocity: ");
        double initialVelocity = input.nextDouble();

        // Reads in the final velocity.
        System.out.print("\nEnter the final velocity: ");
        double finalVelocity = input.nextDouble();

        // Reads in the time span.
        System.out.print("\nEnter the time span: ");
        double timeSpan = input.nextDouble();

        // calculates the average Acceleration.
        double acceleration = (finalVelocity - initialVelocity) / timeSpan;

        // Displays the result.
        System.out.printf("\nThe average acceleration is %.2f\n", acceleration);
    }
}
