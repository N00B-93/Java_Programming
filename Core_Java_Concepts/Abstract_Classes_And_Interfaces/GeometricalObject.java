package Abstract_Classes_And_Interfaces;

import java.util.Date;
import java.util.Scanner;

/**
 * The type Geometrical object.
 */
public abstract class GeometricalObject
{
    // Declares the color, filled and dateCreated properties of a GeometricalObject.
    private String color = "white";
    private boolean filled;
    private Date dateCreated;


    /**
     * Instantiates a new Geometrical object.
     */
    public GeometricalObject()
    {
        dateCreated = new Date();
    }

    /**
     * Instantiates a new Geometrical object.
     *
     * @param color  The Object's color
     * @param filled true or false representing whether an Object is filled or not.
     */
    public GeometricalObject(String color, boolean filled)
    {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * Sets date created.
     *
     * @param dateCreated The date the Object was created.
     */
    public void setDateCreated(Date dateCreated)
    {
        this.dateCreated = dateCreated;
    }

    /**
     * Sets filled value.
     *
     * @param filled The filled value.
     */
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    /**
     * Sets color.
     *
     * @param color The color.
     */
    public void setColor(String color)
    {
        this.color = color;
    }

    /**
     * Gets Object's color.
     *
     * @return The color.
     */
    public String getColor()
    {
        return color;
    }

    /**
     * Gets date created.
     *
     * @return The date created
     */
    public Date getDateCreated()
    {
        return dateCreated;
    }

    /**
     * Is filled boolean.
     *
     * @return the true if Object is filled, otherwise returns false.
     */
    public boolean isFilled()
    {
        return filled;
    }

    /**
     * Gets Object's area.
     *
     * @return The area.
     */
    public abstract double getArea();

    /**
     * Gets Object's perimeter.
     *
     * @return The perimeter
     */
    public abstract double getPerimeter();

    /**
     * Generates a String representation of the Object.
     *
     * @return Object's String representation.
     */
    public String toString()
    {
        return "\nCreated on: " + dateCreated + "\nColor: " + color +
                "\nisFilled? " + filled;
    }
}

/**
 * The type Triangle.
 */
class Triangle extends GeometricalObject
{
    private double side1, side2, side3;

    /**
     * Instantiates a new Triangle.
     *
     * @param color  The color.
     * @param filled The filled value.
     * @param side1  The side 1.
     * @param side2  The side 2.
     * @param side3  The side 3.
     */
    public Triangle(String color, boolean filled, double side1, double side2, double side3)
    {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Gets side 3.
     *
     * @return The side 3
     */
    public double getSide3()
    {
        return side3;
    }

    /**
     * Gets side 2.
     *
     * @return The side 2.
     */
    public double getSide2()
    {
        return side2;
    }

    /**
     * Gets side 1.
     *
     * @return The side 1.
     */
    public double getSide1()
    {
        return side1;
    }

    /**
     * Generates a String representation of a Triangle.
     *
     * @return String representation of a Triangle.
     */
    public String toString()
    {
        return super.toString() + "\nSide1: " + side1 + "\nSide2: "+ side2 + "\nSide3: " + side3;
    }

    @Override
    /**
     * Calculates the perimeter of a Triangle.
     *
     * @return The Triangle's perimeter.
     */
    public double getPerimeter()
    {
        return side1 +side2 +side3;
    }

    @Override
    /**
     * Calculates the Triangle's area.
     *
     * @return The Triangle's area.
     */
    public double getArea()
    {
        double perimeterAverage = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(perimeterAverage * (perimeterAverage - side1) * (perimeterAverage - side2)
            *       (perimeterAverage - side3));
        return area;
    }
}

class TestAbstractClass
{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the triangle's color.
        System.out.printf("\nEnter color of triangle: ");
        String color = input.nextLine();

        // Prompts the user to indicate whether the triangle is filled or not.
        System.out.printf("\nIs triangle filled(true or false)? ");
        boolean isFilled = input.nextBoolean();

        // Prompts the user to enter the length of the sides of the triangle.
        System.out.printf("\nEnter the sides of the rectangle separated by space: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Creates a Triangle Object with the details supplied above.
        Triangle triangle = new Triangle(color, isFilled, side1, side2, side3);

        // Displays the triangle's properties.
        System.out.println("\n\t\tTriangle Details");
        System.out.println(triangle.toString());
        System.out.printf("Area: %.2f\nPerimeter: %.2f\n", triangle.getArea(), triangle.getPerimeter());
    }
}
