package Core_Java_Concepts.Object_Oriented_Thinking.MyPoint;

public class MyPoint
{
    // Attributes of a Point.
    private double x, y;

    /**
     * Instantiates a MyPoint Object and sets the value of the x and y coordinate to 0.0.
     */
    public MyPoint()
    {
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * Instantiates a new MyPoint Object.
     *
     * @param x The x-coordinate of the MyPoint.
     * @param y The y-coordinate of the MyPoint
     */
    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * This returns the x-coordinate of a MyPoint Object.
     *
     * @return The x-coordinate of a MyPoint Object.
     */
    public double getXCoordinate()
    {
        return this.x;
    }

    /**
     * This returns the y-coordinate of a MyPoint Object.
     *
     * @return The y-coordinate of a MyPoint Object.
     */
    public double getYCoordinate()
    {
        return this.y;
    }

    /**
     * This returns the distance between the current MyPoint instance and another MyPoint instance.
     *
     * @param otherPoint Another MyPoint Object.
     * @return The distance between the current MyPoint instance and another MyPoint instance.
     */
    public double distance(MyPoint otherPoint)
    {
        return Math.sqrt(Math.pow(this.getXCoordinate() - otherPoint.getXCoordinate(), 2) + Math.pow(this.getYCoordinate()
                - otherPoint.getYCoordinate(), 2));
    }

    /**
     * This returns the distance between two MyPoint instances.
     *
     * @param point1 The first MyPoint instance.
     * @param point2 The second MyPoint instance.
     * @return The distance between two MyPoint Instances.
     */
    public static double distance(MyPoint point1, MyPoint point2)
    {
        return Math.sqrt(Math.pow(point1.getXCoordinate() - point2.getXCoordinate(), 2) + Math.pow(point1.getYCoordinate()
                - point2.getYCoordinate(), 2));
    }

    /**
     * This returns the distance between the current instance to another point with specified x and y coordinate.
     *
     * @param xCoord The x-coordinate of the other point.
     * @param yCoord The x-coordinate of the other point.
     * @return The distance between the current instance to another point with specified x and y coordinate.
     */
    public double distance(double xCoord, double yCoord)
    {
        return Math.sqrt(Math.pow(this.getXCoordinate() - xCoord, 2) + Math.pow(this.getYCoordinate() - yCoord, 2));
    }
}
