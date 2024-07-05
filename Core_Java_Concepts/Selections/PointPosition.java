package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter the two coordinates points p0 and p1 of the edge of a
	line and a third point p2 and then determines whether the third point is on the left or right of the line or on the line.
*/

public class PointPosition
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);
		// Prompts the user to enter the coordinates of the edge of the line.
		System.out.printf("\nEnter the coordinates of the point p0(x, y): ");
		double x0 = console.nextDouble();
		double y0 = console.nextDouble();
		System.out.printf("\nEnter the coordinates of point p1(x, y): ");
		double x1 = console.nextDouble();
		double y1 = console.nextDouble();

		// Prompts the user to enter the coordinates of a point.
		System.out.print("\nEnter the coordinate of a point p2(x, y): ");
		double x2 = console.nextDouble();
		double y2 = console.nextDouble();
		
		// Determines the position of the third point relative to the line with edges p0 and p1.
		double positionCheck = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		if (positionCheck > 0)
			System.out.printf("\n\nThe point p2(%.2f, %.2f) is on the left side of the line.\n", x2, y2);
		else if (positionCheck == 0)
			System.out.printf("\n\nThe point p2(%.2f, %.2f) is on the same line.\n", x2, y2);
		else
			System.out.printf("\n\nThe point p2(%.2f, %.2f) is on the right side of the line.\n", x2, y2);

		// Closes the Scanner.
		console.close();
	}
}

