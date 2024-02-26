package Objects_And_Classes;

/**
 * The type Fan.
 */
public class Fan
{
	// Different speeds of a Fan Object.
	public static final int SLOW = 1, FAST = 3,MEDIUM = 2;

	// Attributes of a Fan Object.
	private int speed;
	boolean on;
	double radius;
	String colour;

	/**
	 * Instantiates a new Fan Object with default values.
	 */
	public Fan()
	{
		on = false;
		radius = 5.0;
		colour = "blue";
	}

	/**
	 * Sets the speed of a Fan Object.
	 *
	 * @param speed The new speed of the fan.
	 */
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	/**
	 * Gets the current speed of the Fan.
	 *
	 * @return The speed of the Fan.
	 */
	public int getSpeed()
	{
		return (this.speed);
	}

	/**
	 * Switches the Fan ON or OFF.
	 *
	 * @param status The Fan's status.
	 */
	public void setStatus(boolean status)
	{
		this.on = status;
	}

	/**
	 * Returns a boolean value representing whether the Fan is ON or OFF.
	 *
	 * @return The Fan's ON or OFF status.
	 */
	public boolean getStatus()
	{
		return this.on;
	}

	/**
	 * Sets the Fan's radius to the specified value.
	 *
	 * @param radius The Fan's new radius.
	 */
	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	/**
	 * Returns the radius of the Fan.
	 *
	 * @return The Fan's radius.
	 */
	public double getRadius()
	{
		return (this.radius);
	}

	/**
	 * Sets the Fan's colour to the .
	 *
	 * @param colour the colour
	 */
	public void setColour(String colour)
	{
		this.colour = colour;
	}

	/**
	 * Returns the Fan's colour.
	 *
	 * @return The Fan's colour.
	 */
	public String getColour()
	{
		return this.colour;
	}

	/**
	 * Returns a String representation of the Fan.
	 *
	 * @return Description of the Fan's properties as a String.
	 */
	public String toString()
	{
		if (this.on)
			return "Speed: " + speed + "\n" + "Radius: " + radius + "\n" + "Colour: " + colour +"\n";
		return "Fan is Off" + "\n" + "Colour: " + colour + "\n" + "Radius: " + radius + "\n";
	}

	public static void main(String[] args)
	{
		// Creates two Fan Objects.
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		// Sets the first Fan's speed, colour, On status and radius.
		fan1.setSpeed(FAST);
		fan1.colour = "yellow";
		fan1.on = true;
		fan1.radius = 10;

		// Sets the second Fan's speed, colour, On status and radius.
		fan2.setSpeed(MEDIUM);
		fan2.radius = 5;
		fan2.colour = "blue";
		fan2.on = false;

		// Displays the two Fan's properties.
		System.out.println(fan1.toString());
		System.out.println();
		System.out.println(fan2.toString());
	}
}
