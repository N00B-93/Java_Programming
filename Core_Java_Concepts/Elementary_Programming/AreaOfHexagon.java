package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter the
    side of a hexagon and displays its area.
 */

public class AreaOfHexagon
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the length of the side of a Hexagon.
        System.out.print("\nEnter the length of the side of an Hexagon: ");
        double length = input.nextDouble();

        // Calculates the area of the Hexagon.
        double areaOfHexagon = (3 * Math.sqrt(3) / 2) * Math.pow(length, 2);

        // Displays the result.
        System.out.printf("\nThe area of the Hexagon is: %.2f\n", areaOfHexagon);
    }
}
