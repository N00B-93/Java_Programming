package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that reads in a length in feet,
    calculates the meter equivalent and displays the result.
 */

public class FeetToMeters
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the length in feet.
        System.out.print("\nEnter the length in feet: ");
        double feet = input.nextDouble();

        // Calculates the length in meter.
        double meter = feet * 0.305;

        // Displays the result.
        System.out.printf("\n%.2f feet is %.2f meters\n", feet, meter);
    }
}
