package Object_Oriented_Thinking;

/**
 * The type Circle2D.
 */
public class Circle2D
{
    // Attributes of a Circle2D
    public double x, y;
    public double radius;

    // No-arg constructor that creates a Circle2D Object with default attribute values.
    public Circle2D()
    {
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    /**
     * Instantiates a Circle2D Object with the specified x-, y-coordinate and radius.
     * @param x The x-coordinate of the Circle2D center.
     * @param y The y-coordinate of the Circle2D center.
     * @param radius The radius of the Circle2D Object.
     */
    public Circle2D(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * This returns the area of a Circle2D Object.
     * @return The area of a Circle2D Object.
     */
    public double getArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * This returns the perimeter of a Circle2D Object.
     * @return The perimeter of a Circle2D Object.
     */
    public double getPerimeter()
    {
        return 2 * Math.PI * this.radius;
    }

    /**
     * Checks if a specified point exists in the current Circle2D instance.
     * @param x The x-coordinate of the point.
     * @param y The y-coordinate of the point.
     * @return true if the point exists in the current Circle2D instance, else false.
     */
    public boolean contains(double x, double y)
    {
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));

        return distance < this.radius;
    }

    /**
     * Checks if the current Circle2D instance contains the specified Circle2D instance.
     * @param other The other Circle2D instance.
     * @return true if the current Circle2D instance contains the specified instance, else false.
     */
    public boolean contains(Circle2D other)
    {
        double distance = Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));

        return distance <= this.radius - other.radius;
    }

    /**
     * Checks if the current Circle2D instance overlaps the specified Circle2D instance.
     * @param other The other Circle2D instance.
     * @return true if the Circle2D overlaps, else false.
     */
    public boolean overlaps(Circle2D other)
    {
        double distance = Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));

        return this.radius + other.radius >= distance;
    }

    public static void main(String[] args)
    {
        // Creates a Circle2D Object.
        Circle2D circle2D = new Circle2D(2, 2, 5.5);

        // Displays the properties of the Circle2D.
        System.out.printf("\nArea: %.2f\nPerimeter: %.2f\n\n", circle2D.getArea(), circle2D.getPerimeter());

        // Checks if the Circle2D Object contains a specified point.
        double xCoord = 3, yCoord = 3;
        System.out.printf("\nDoes the circle contains (%.2f. %.2f)? %b", xCoord, yCoord, circle2D.contains(xCoord, yCoord));

        // Checks if the Circle2D Object contains another Circle2D Object.
        Circle2D otherCircle = new Circle2D(4, 5, 10.5);
        System.out.printf("\nDoes the circle contains a circle with center: (%.2f, %.2f) and radius %.2f? %b", otherCircle.x
        , otherCircle.y, otherCircle.radius, circle2D.contains(otherCircle));

        // Checks if the Circle2D Object overlaps another Circle2D Object.
        Circle2D anotherCircle = new Circle2D(3, 5, 2.3);
        System.out.printf("\nDoes the circle overlaps a circle with center: (%.2f, %.2f) and radius %.2f? %b\n", anotherCircle.x
                , anotherCircle.y, anotherCircle.radius, circle2D.overlaps(anotherCircle));
    }
}
