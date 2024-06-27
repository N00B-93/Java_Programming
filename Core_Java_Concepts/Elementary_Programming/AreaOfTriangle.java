package Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter
    three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 */

public class AreaOfTriangle
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the co-ordinate of each vertex of the triangle.
        System.out.print("\nEnter the coordinates for x1, y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("\nEnter the coordinates for x2, y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("\nEnter the coordinates for x3, y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Determines the length of a side by calculating the distance between two of the vertices.
        double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double side2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double side3 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));

        // calculates the Perimeter.
        double perimeter = (side1 + side2 + side3) / 2.0;

        // Calculates the area using Hero's Formula.
        double area = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));

        // Displays the result.
        System.out.printf("\nThe area of the triangle is: %.2f\n", area);
    }
}
