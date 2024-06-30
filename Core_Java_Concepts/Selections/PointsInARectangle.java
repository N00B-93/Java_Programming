package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter
    a point (x, y) and checks whether the point is within the rectangle centered at
    (0, 0) with width 10 and height 5.
 */

public class PointsInARectangle
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the x and y coordinate of the point.
        System.out.printf("\nEnter the x and y coordinate of the point separated by space: ");
        double xCoord = input.nextDouble();
        double yCoord = input.nextDouble();

        // Calculates the length of the diagonal of the rectangle.
        double lengthOfDiagonal = Math.sqrt(Math.pow(10, 2) + Math.pow(5, 2));

        // Calculate half the diagonal(radius of the rectangle).
        double halfDiagonal = lengthOfDiagonal / 2;

        // Calculates the length of distance between the point and the circle center.
        double distance = Math.sqrt(Math.pow(xCoord - 0, 2) + Math.pow(yCoord - 0, 2));

        // Determines whether the point is in the circle, on the circle or outside the circle.
        if (distance < halfDiagonal)
            System.out.printf("\nPoint (%.2f, %.2f) is in the circle.\n", xCoord, yCoord);
        else if (distance == halfDiagonal)
            System.out.printf("\nPoint (%.2f, %.2f) is on the circle.\n", xCoord, yCoord);
        else if (distance > halfDiagonal)
            System.out.printf("\nPoint (%.2f, %.2f) is outside the circle.\n", xCoord, yCoord);
    }
}
