package Selections;

import java.util.*;

/*
	This is a program that prompts the user to enter the center
	coordinates and radii of two circles and determines whether the second circle is
	inside the first or overlaps with the first. (Hint: circle2 is
	inside circle1 if the distance between the two centers <= |r1 - r2| and circle2
	overlaps circle1 if the distance between the two centers <= r1 + r2
 */

public class CircleInCircle
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Reads in the coordinates of the center of circle1 and the circle1's radius.
		System.out.print("\nInput the x-coord x1 of circle1: ");
		double x1 = input.nextDouble();
		System.out.print("\nInput the y-coord y1 of circle1: ");
		double y1 = input.nextDouble();
		System.out.print("\nInput the radius r1 of circle1: ");
		double r1 = input.nextDouble();

		// Reads in the coordinates of the center of circle2 and the circle2's radius.
		System.out.print("\nInput the x-coord x1 of circle2: ");
		double x2 = input.nextDouble();
		System.out.print("\nInput the y-coord y2 of circle2: ");
		double y2 = input.nextDouble();
		System.out.print("\nInput the radius r2 of circle2: ");
		double r2 = input.nextDouble();
		
		// Calculates the distance between the center of the two circles.
		double distance = Math.sqrt((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));
		
		// Calculate the absolute value of the difference between the radii of circle1 and circle2.
		double radiiDifference = Math.abs(r1 - r2);

		// Calculates the sum of the radii of circle1 and circle2.
		double radiiSum = Math.abs(r1 + r2);

		// Displays the result based on the comparison between the distance between the circle centers
		// and the absolute value of the sum and differences of circles radii respectively.
		if (distance <= radiiDifference)
			System.out.print("\nCircle2 is in Circle1\n\n");
		else if(distance <= radiiSum)
			System.out.print("\nCircle2 overlaps circle1\n\n");
		else
			System.out.print("\ncircle2 does not overlap circle1\n\n");
	}
}
