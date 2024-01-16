package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter
    the length from the center of a pentagon to a vertex and computes the area of the
    pentagon.
 */

public class AreaOfAPentagon
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the distance from the center of the pentagon to a vertex
        System.out.printf("\nEnter the distance from the center to a vertex: ");
        double distance = input.nextDouble();

        // Calculates the length of a side.
        double side = 2 * distance * Math.sin(Math.PI / 5);

        // calculates the area.
        double area = 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));

        // Displays the result.
        System.out.printf("\nThe area of the pentagon is: %.2f\n", area);
    }
}
