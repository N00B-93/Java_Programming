package Abstract_Classes_And_Interfaces.SortingContainers;

public class Tube extends Container
{
    // Attribute of a Tube.
    private double radius;
    public static final double COST_OF_PACKAGING_AND_SHIPPING = 0.25;

    /**
     * Instantiates a new Tube.
     *
     * @param radius The radius of the Tube.
     * @param length The length of the Tube.
     */
    public Tube(double radius, double length)
    {
        this.length = length;
        this.radius = radius;
    }

    /**
     * This returns the size of a Tube.
     *
     * @return The size of a Tube.
     */
    @Override
    public double getSize()
    {
        return (2 * Math.PI * this.radius) + this.length;
    }

    /**
     * This returns the cost of shipping and packaging a Tube Container.
     *
     * @return The cost of packaging and shipping a Tube.
     */
    @Override
    public double getCost()
    {
        return this.getSize() * COST_OF_PACKAGING_AND_SHIPPING;
    }

    /**
     * This returns the radius of a Tube.
     *
     * @return The radius of a Tube.
     */
    public double getRadius()
    {
        return this.radius;
    }
}
