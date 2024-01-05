package Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that reads in the radius and length of a cylinder
    and calculates the area and volume and then displays the result.
 */
public class AreaAndVolume
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the radius of the Cylinder.
        System.out.print("\nEnter the radius of the cylinder: ");
        double radius = input.nextDouble();

        // Reads in the length of the Cylinder.
        System.out.print("\nEnter the length of the cylinder: ");
        double length = input.nextDouble();

        // Calculates the Area of the Cylinder.
        double area = Math.PI * Math.pow(radius, 2);

        // Calculates the volume of the Cylinder.
        double volume = Math.PI * length * Math.pow(radius, 2);

        // Displays the result.
        System.out.printf("\nArea = %.2f\nVolume = %.2f\n", area, volume);
    }

}
