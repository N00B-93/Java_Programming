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

    /**
     * This returns a String that describes a Box Container.
     *
     * @return A String that describes a Box Container.
     */
    @Override
    public String toString()
    {
        String type = this.getClass().getSimpleName();
        return String.format("\nContainer Type: %s\nWidth: %.2f\nLength: %.2f\nDepth: %.2f\nSize: %.2f\nCost of Packaging and Shipping: $%.2f\n",
                type, this.width, this.length, this.depth, this.getSize(), this.getCost());
    }


    /**
     * Compares two Containers.
     *
     * @param other The other Tube Container to be compared.
     * @return The value 0 if the current instance is numerically equal to other; a value less than 0 if the current
     * instance is numerically less than other; and a value greater than 0 if the current instance is numerically greater than other.
     */
    @Override
    public int compareTo(Container other)
    {
        return Double.compare(this.getCost(), other.getCost());
    }
}
