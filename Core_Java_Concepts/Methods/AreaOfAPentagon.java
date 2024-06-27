package Methods;

import java.util.Scanner;

/*
	This is a program that uses a method with the header;
			public static double area(double side)
	to calculate the area of a pentagon with side entered by the user.
*/

public class AreaOfAPentagon
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		// Reads in the length of the side of a pentagon.
		System.out.print("\nEnter the length of the pentagon's side: ");
		double side = input.nextDouble();

		// Displays the result.
		System.out.printf("\nThe area of the pentagon is: %.2f\n", area(side));
	}

	/**
	 * Calculates the area of a pentagon with a given length of side.
	 *
	 * @param side The length of the side of the pentagon.
	 *
	 * @return The area of the pentagon.
	 */
	public static double area(double side)
	{
		return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
	}
}

