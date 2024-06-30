package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a
    point (x, y) and checks whether the point is within the circle centered at (0, 0)
    with radius 10.
 */

public class PointsInACircle
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the coordinates of the center of the circle.
        System.out.printf("\nEnter the x-coordinate and y-coordinate of the point separated by space: ");
        double xCoord = input.nextDouble();
        double yCoord = input.nextDouble();

        // Calculates the distance between the center of the two circle.
        double distance = Math.sqrt(Math.pow(xCoord - 0, 2) + Math.pow(yCoord - 0, 2));

        // Determines whether the point is inside, outside or on the circle and displays the result.
        if (distance > 10.0)
            System.out.printf("\nPoint (%.2f, %.2f) is not in the circle.\n", xCoord, yCoord);
        else if (distance < 10.0)
            System.out.printf("\nPoint (%.2f, %.2f) is in the circle.\n", xCoord, yCoord);
        else
            System.out.printf("\nPoint (%.2f, %.2f) is on the circle.\n", xCoord, yCoord);
    }
}
