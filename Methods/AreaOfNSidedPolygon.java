package Methods;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter the length of the side of a polygon 
	and the number of sides and the calculates the area of the polygon using a method with the header;
			public static double area(int n, double side)
*/

public class AreaOfNSidedPolygon
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Reads in the length of the side of a pentagon and nunber of sides.
		System.out.print("\nEnter the number of sides: ");
		int numberOfSides = input.nextInt();

		System.out.print("\nEnter the length of a side: ");
		double lengthOfSide = input.nextDouble();

		// Displays the result.
		System.out.printf("\nThe area of the polygon is: %.2f\n", area(numberOfSides, lengthOfSide));
	}

	/**
	 * Calculates the area of an n-sided polygon given the number of sides and length of sides.
	 *
	 * @param numberOfSides The number of sides of the polygon.
	 * @param lengthOfSide The length of a side of the polygon.
	 *
	 * @return The area of an n-sided polygon.
	 */
	public static double area(int n, double side)
	{
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
}

