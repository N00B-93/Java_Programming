package Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that reads in the weight in pounds,
    converts it to kilograms and displays the result.
 */

public class PoundToKilogram
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in weight in Pounds.
        System.out.print("\nEnter the weight in pounds: ");
        double pound = input.nextDouble();

        // Calculates the weight in Kilogram.
        double kilogram = pound * 0.454;

        // Displays the result.
        System.out.printf("\n%.2f pound is %.2f kilogram\n", pound, kilogram);
    }
}
