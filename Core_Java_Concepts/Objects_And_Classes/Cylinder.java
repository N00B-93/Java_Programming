package Objects_And_Classes;

import java.util.Scanner;

/**
 * The type Cylinder.
 */
public class Cylinder
{
	// Attributes of a Cylinder instance.
	public double radius, height;

	/**
	 * Returns the volume of a Cylinder.
	 *
	 * @param radius The radius of the Cylinder.
	 * @param height The height of the Cylinder.
	 * @return The volume of the Cylinder.
	 */
	public static double volume(double radius, double height)
	{
		return (Math.PI * Math.pow(radius, 2) * height);
	}

	/**
	 * Returns the total surface area of the Cylinder.
	 *
	 * @param radius The radius of the Cylinder.
	 * @param height The height of the Cylinder.
	 * @return The total surface area of the Cylinder.
	 */
	public static double totalSurfaceArea(double radius, double height)
	{
		return 2 * Math.PI * radius * (radius + height);
	}

	/**
	 * Returns the curved surface area of the Cylinder.
	 *
	 * @param radius The radius of the Cylinder.
	 * @param height The height of the Cylinder.
	 * @return The curved surface area.
	 */
	public static double curvedSurfaceArea(double radius, double h)
	{
		return (2 * Math.PI * Math.pow(radius, 2));
	}

	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates a Cylinder Object.
		Cylinder cylinder = new Cylinder();

		// Reads in the radius of the Cylinder.
		System.out.print("\nEnter the radius of the Cylinder: ");
		cylinder.radius = input.nextDouble();

		// Reads in the height of the Cylinder.
		System.out.print("\nEnter the height of the Cylinder: ");
		cylinder.height = input.nextDouble();

		// Displays the area, total surface area, curved surface area and volume of the Cylinder.
		System.out.printf("\nThe Volume is: %.4f\n\nThe Total Surface Area is: %.4f\n\nThe Curved Surface Area is: " +
				"%.4f\n\n", volume(cylinder.radius, cylinder.height), totalSurfaceArea(cylinder.radius, cylinder.height),
				curvedSurfaceArea(cylinder.radius, cylinder.height));
	}
}
