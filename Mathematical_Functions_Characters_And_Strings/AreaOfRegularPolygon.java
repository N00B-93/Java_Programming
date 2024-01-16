package Mathematical_Functions_Characters_And_Strings;

import  java.util.Scanner;

/*
    This is a program that prompts the user to enter
    the length of the side of a polygon and the number of sides and computes the area of the
    polygon.
 */

public class AreaOfRegularPolygon
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the distance from the center of the hexagon to a vertex
        System.out.printf("\nEnter the length of a side: ");
        double side = input.nextDouble();

        // Prompts the user to enter the number of sides of the polygon.
        System.out.printf("\nEnter the number of sides of the polygon: ");
        double numberOfSides = input.nextDouble();

        // Calculates the area of the polygon.
        double area = numberOfSides * Math.pow(side, 2) / (4 * Math.tan(Math.PI / numberOfSides));

        // Displays the result.
        System.out.printf("\nThe area of the polygon is: %.2f\n", area);
    }
}
