package Objects_And_Classes;

import java.util.Scanner;

public class Rectangle
{
	// Length and breadth attributes of a Rectangle Object.
	public double length, breadth;

	/**
	 * Returns the perimeter of a Rectangle Object.
	 *
	 * @param length The length.
	 * @param breadth The breadth.
	 * @return Perimeter of the Rectangle.
	 */
	public static double perimeter(double length, double breadth)
	{
		return (2 * (length + breadth));
	}

	/**
	 * Returns the area of the Rectangle.
	 *
	 * @param length  The length.
	 * @param breadth The breadth.
	 * @return The area of the Rectangle.
	 */
	public static double area(double length, double breadth)
	{
		return (length * breadth);
	}

	public static void main(String args[])
	{
		//  Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates a Rectangle Object.
		Rectangle rect1 = new Rectangle();

		// Reads in the Rectangle's length.
		System.out.printf("\nEnter the length: ");
		rect1.length = input.nextDouble();

		// Reads in the Rectangle's breadth.
		System.out.print("\nEnter the breadth: ");
		rect1.breadth = input.nextDouble();

		// Display the area and perimeter of the Rectangle.
		System.out.printf("\nThe area is: %.4f\n\nThe perimeter is: %.4f\n\n", area(rect1.length, rect1.breadth), perimeter(rect1.length, rect1.breadth));
	}
}
