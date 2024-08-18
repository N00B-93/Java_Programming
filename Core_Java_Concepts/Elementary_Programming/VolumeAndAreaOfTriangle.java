package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter the length of the side of an equilateral triangle and the length
    of its height and then computes and displays the area and volume of the equilateral triangle using the following formulas.
                    area = √3/4(length of side)^2
                    volume = area x height
 */

public class VolumeAndAreaOfTriangle
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner console = new Scanner(System.in);

        // Reads in the length of a side of an equilateral triangle.
        System.out.printf("\nEnter the length of the side of an equilateral triangle: ");
        double lengthOfSide = console.nextDouble();

        // Reads in the height of an equilateral triangle.
        System.out.printf("\nEnter the height of the triangle: ");
        double lengthOfHeight = console.nextDouble();

        // Computes the area.
        double area = (Math.pow(3, 0.5) / 4.0) * Math.pow(lengthOfSide, 2);

        // Computes the volume.
        double volume = area * lengthOfHeight;

        // Displays the value of the area and volume.
        System.out.printf("\nVolume of Equilateral Triangle: %.2f\nArea of Equilateral Triangle: %.2f\n", volume, area);
    }
}
