package Elementary_Programming;

import java.util.Scanner;

/*
    This program prompts the user to enter
    two points (x1, y1) and (x2, y2) and displays their distance between them.
 */

public class DistanceBetweenTwoPoints
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the values of points x1, y1.
        System.out.print("\nEnter x1, y1 separated by space: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        // Reads in the values of points x2, y2.
        System.out.print("\nEnter x2, y2 separated by space: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Calculates the distance between the two points.
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Displays the result.
        System.out.printf("\nThe distance between the two points is: %.2f\n", distance);
    }
}
