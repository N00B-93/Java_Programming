package Objects_And_Classes;

/**
 * The type Cylinder 1.
 */
public class Cylinder1
{
	// Attributes of a Cylinder1 instance.
	private double radius, height;

	/**
	 * No-arg Constructor that instantiates a new Cylinder1 Object.
	 */
	public Cylinder1()
	{
		radius = 1;
		height = 1;
	}

	/**
	 * Instantiates a new Cylinder1 Object.
	 *
	 * @param radius The radius.
	 * @param height The height.
	 */
	public Cylinder1(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}

	/**
	 * Returns the volume of a Cylinder1 Object.
	 *
	 * @return The volume of the Cylinder1.
	 */
	public  double volume()
	{
		return (Math.PI * Math.pow(radius, 2) * height);
	}

	public static void main(String[] args)
	{
		// Creates a Cylinder1 Object.
		Cylinder1 cylinder1 = new Cylinder1(3.56, 6.71);

		// Displays the Volume of the Cylinder1 Object.
		System.out.printf("\nVolume: %.4f\n", cylinder1.volume());
	}
}
