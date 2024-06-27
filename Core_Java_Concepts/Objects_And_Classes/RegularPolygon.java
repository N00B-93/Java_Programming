package Objects_And_Classes;

public class RegularPolygon
{
	// A RegularPolygon Object's attribute.
	private int numberOfSides = 3;
	private double lengthOfSide = 1;
	private double xCoord = 0.0, yCoord = 0.0;

	/**
	 * Instantiates a new Regular polygon Object with a given number of sides and length of side.
	 *
	 * @param numberOfSides The number of sides.
	 * @param lengthOfSide The length of a side.
	 */
	public RegularPolygon(int numberOfSides, double lengthOfSide)
	{
		this.numberOfSides = numberOfSides;
		this.lengthOfSide = lengthOfSide;
	}

	/**
	 * Instantiates a new Regular polygon Object with a given number of sides, length of side and
	 * coordinates of the center of the RegularPolygon.
	 *
	 * @param numberOfSides The number of sides.
	 * @param lengthOfSide The length of side.
	 * @param xCoord The x-coordinate of the center of the RegularPolygon.
	 * @param yCoord The y-coordinate of the center of the RegularPolygon.
	 */
	public RegularPolygon(int numberOfSides, double lengthOfSide, double xCoord, double yCoord)
	{
		this.numberOfSides = numberOfSides;
		this.lengthOfSide = lengthOfSide;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	/**
	 * Returns the number of sides.
	 *
	 * @return The number of sides.
	 */
	public int getNumOfSides()
	{
		return (this.numberOfSides);
	}

	/**
	 * Sets number of sides to the given value.
	 *
	 * @param numberOfSides The number of sides
	 */
	public void setNumOfSides(int numberOfSides)
	{
		this.numberOfSides = numberOfSides;
	}

	/**
	 * Gets the length of a side.
	 *
	 * @return The length of side.
	 */
	public double getLengthOfSide()
	{
		return (this.lengthOfSide);
	}

	/**
	 * Sets length of side to the given value.
	 *
	 * @param lengthOfSide The given length of side.
	 */
	public void setLengthOfSide(double lengthOfSide)
	{
		this.lengthOfSide = lengthOfSide;
	}

	/**
	 * Gets x coordinate of a RegularPolygon Object.
	 *
	 * @return The x coordinate a RegularPolygon Object.
	 */
	public double getXCoord()
	{
		return this.getXCoord();
	}

	/**
	 * Sets the x-coordinate of a RegularPolygon Object to the given value.
	 *
	 * @param xCoord The new x-coordinate
	 */
	public void setXCoord(double xCoord)
	{
		this.xCoord = xCoord;
	}

	/**
	 * Gets the y-coordinate of the RegularPolygon Object.
	 *
	 * @return The y-coordinate of the RegularPolygon Object.
	 */
	public double getYCoord()
	{
		return this.yCoord;
	}

	/**
	 * Sets the y-coordinate of the RegularPolygon Object to the given value.
	 *
	 * @param yCoord The y-coordinate of the RegularPolygon Object.
	 */
	public void setYCoord(double yCoord)
	{
		this.yCoord = yCoord;
	}

	/**
	 * Calculates the perimeter of a RegularPolygon.
	 *
	 * @return The perimeter of a RegularPolygon.
	 */
	public double getPerimeter()
	{
		return (this.numberOfSides * this.lengthOfSide);
	}

	/**
	 * Calculates the area of a RegularPolygon.
	 *
	 * @return The area of a RegularPolygon.
	 */
	public double getArea()
	{
		return ((4 * Math.pow(this.lengthOfSide, 2)) / (4 * Math.tan(Math.PI / this.getNumOfSides())));
	}

	public static void main(String[] args)
	{
		// Creates a RegularPolygon Object.
		RegularPolygon regularPolygon = new RegularPolygon(10, 4, 5.6, 7.8);

		// Displays the Perimeter and Area of the RegularPolygon Object.
		System.out.printf("\nPerimeter: %.2f\nArea: %.2f\n", regularPolygon.getPerimeter(), regularPolygon.getArea());
	}
}
