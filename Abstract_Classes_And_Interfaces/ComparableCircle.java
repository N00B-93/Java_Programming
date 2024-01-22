package Abstract_Classes_And_Interfaces;

/*
    This is a program that defines a class named ComparableCircle
    that extends Circle and implements Comparable. It implements the compareTo method to compare the circles on
    the basis of area.

 */

/**
 * The type Circle.
 */
class Circle extends GeometricalObject
{
    private double radius;

    /**
     * Instantiates a new Circle.
     *
     * @param color  The color
     * @param filled Indicates whether the circle is filled or not.
     * @param radius The radius of the circle.
     */
    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Instantiates a new Circle.
     */
    public Circle(){};

    /**
     * Method that calculates the area of a circle
     *
     * @return The area of the circle.
     */
    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Method that calculates the perimeter of circle.
     *
     * @return The perimeter of the circle.
     */
    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * this.radius;
    }
}


/**
 * The type Comparable circle.
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>
{
    private double radius;

    /**
     * Instantiates a new Comparable circle.
     *
     * @param color
     * @param filled
     * @param radius
     */
    public ComparableCircle(String color, boolean filled, double radius)
    {
        super(color, filled, radius);
    }

    /**
     * Method that compares two Comparable Circle Objects.
     *
     * @param circle the object to be compared.
     * @return -1, 0, or 1 which indicates whether a circle is <, ==, or > the other.
     */
    @Override
    public int compareTo(ComparableCircle circle)
    {
        if (this.getArea() - circle.getArea() < 0)
            return -1;
        else if (this.getArea() - circle.getArea() == 0)
            return 0;
        return 1;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        ComparableCircle comparableCircle1 = new ComparableCircle("red", true, 5.2);
        ComparableCircle comparableCircle2 = new ComparableCircle("green", false, 4.7);

        if (comparableCircle1.compareTo(comparableCircle2) < 0)
            System.out.println("\nComparableCircle1 is less than ComparableCircle2");
        else if (comparableCircle1.compareTo(comparableCircle2) == 0)
            System.out.println("\nComparableCircle1 equals ComparableCircle2");
        else if (comparableCircle1.compareTo(comparableCircle2) > 0)
            System.out.println("\nComparableCircle1 is greater than ComparableCircle2");
    }
}
