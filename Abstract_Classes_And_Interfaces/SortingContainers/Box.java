package Abstract_Classes_And_Interfaces.SortingContainers;

public class Box extends Container
{
    // Attributes of a Box
    protected double width, depth;
    public static final double COST_OF_PACKAGING_AND_SHIPPING = 0.35;

    public Box(double width, double depth, double length)
    {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    /**
     * This returns the size of a Box.
     *
     * @return The size of a Box.
     */
    @Override
    public double getSize()
    {
        return this.getLength() + this.getWidth() + this.getDepth();
    }

    /**
     * This returns the cost of shipping and packaging a Box Container.
     *
     * @return The cost of packaging and shipping a Box.
     */
    @Override
    public double getCost()
    {
        return this.getSize() * COST_OF_PACKAGING_AND_SHIPPING;
    }

    /**
     * This returns the width of a Box.
     *
     * @return The width of a Box.
     */
    public double getWidth()
    {
        return width;
    }

    /**
     * This returns the depth of a Box.
     *
     * @return The depth of a Box.
     */
    public double getDepth()
    {
        return this.depth;
    }
}
