package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter
    the length of the side of a Hexagon and computes the area of the
    Hexagon.
 */

public class AreaOfAnHexagon
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the length of a side of a Hexagon.
        System.out.printf("\nEnter the length of a side of an Hexagon: ");
        double side = input.nextDouble();

        // Displays an error message and terminates the program if a user enters a length <= 0.
        if (side <= 0)
        {
            System.out.println("\nUse length of side > 0 only!!!");
            System.exit(1);
        }

        // Calculates the area.
        double area = 6 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 6));

        // Displays the result.
        System.out.printf("\nThe area of the hexagon is: %.2f\n", area);
    }
}
