package Objects_And_Classes.CarpetCalculator;

public class RoomDimension
{
    // Length and width attribute of a RoomDimension Object.
    private double length, width;

    /**
     * Instantiates a new RoomDimension Object.
     *
     * @param length The length.
     * @param width  the width.
     */
    public RoomDimension(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    /**
     * Returns the length of a room.
     *
     * @return The length of a room.
     */
    public double getLength()
    {
        return this.length;
    }

    /**
     * Returns the width of a room.
     *
     * @return The width of a room.
     */
    public double getWidth()
    {
        return this.width;
    }

    /**
     * Returns the area of a room.
     *
     * @return The area of a room.
     */
    public double getArea()
    {
        return this.length * this.width;
    }

    /**
     * Returns a String representation of the RoomDimension Object.
     * @return String representation of the RoomDimension Object.
     */
    public String toString()
    {
        return "\nLength: " + this.length + "\n" + "Width: " + this.width + "\n" + "Area: " + this.getArea();
    }
}
