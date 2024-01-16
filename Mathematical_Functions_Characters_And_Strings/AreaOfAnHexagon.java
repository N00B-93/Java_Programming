package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter
    the length from the center of a pentagon to a vertex and computes the area of the
    Hexagon.
 */

public class AreaOfAnHexagon
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the distance from the center of the hexagon to a vertex
        System.out.printf("\nEnter the length of a side: ");
        double side = input.nextDouble();

        // calculates the area.
        double area = 6 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 6));

        // Displays the result.
        System.out.printf("\nThe area of the hexagon is: %.2f\n", area);
    }
}
