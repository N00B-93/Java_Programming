package Abstract_Classes_And_Interfaces.SortingContainers;

public abstract class Container
{
    // Attribute of a Container.
    protected double length;

    public abstract double getSize();  // Abstract method getSize.

    public abstract double getCost();  // Abstract method getCost.

    /**
     * This returns the length of a Container.
     *
     * @return The length of a Container.
     */
    public double getLength()
    {
        return this.length;
    }
}
