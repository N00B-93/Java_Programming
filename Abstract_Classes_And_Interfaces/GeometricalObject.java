package Abstract_Classes_And_Interfaces;

import java.util.Date;
import java.util.Scanner;
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
     * @param color  the color
     * @param filled the filled
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
     * @param dateCreated the date created
     */
    public void setDateCreated(Date dateCreated)
    {
        this.dateCreated = dateCreated;
    }

    /**
     * Sets filled.
     *
     * @param filled the filled
     */
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(String color)
    {
        this.color = color;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor()
    {
        return color;
    }

    /**
     * Gets date created.
     *
     * @return the date created
     */
    public Date getDateCreated()
    {
        return dateCreated;
    }

    /**
     * Is filled boolean.
     *
     * @return the boolean
     */
    public boolean isFilled()
    {
        return filled;
    }

    /**
     * Gets area.
     *
     * @return the area
     */
    public abstract double getArea();

    /**
     * Gets perimeter.
     *
     * @return the perimeter
     */
    public abstract double getPerimeter();

    public String toString() {
        return "\nCreated on: " + dateCreated + "\nColor: " + color +
                "\nisFilled? " + filled;
    }
}
class Triangle extends GeometricalObject
{
    private double side1, side2, side3;

    /**
     * Instantiates a new Triangle.
     *
     * @param color  the color
     * @param filled the filled
     * @param side1  the side 1
     * @param side2  the side 2
     * @param side3  the side 3
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
     * @return the side 3
     */
    public double getSide3()
    {
        return side3;
    }

    /**
     * Sets side 3.
     *
     * @param side3 the side 3
     */
    public void setSide3(double side3)
    {
        this.side3 = side3;
    }

    /**
     * Gets side 2.
     *
     * @return the side 2
     */
    public double getSide2()
    {
        return side2;
    }

    /**
     * Sets side 2.
     *
     * @param side2 the side 2
     */
    public void setSide2(double side2)
    {
        this.side2 = side2;
    }

    /**
     * Gets side 1.
     *
     * @return the side 1
     */
    public double getSide1()
    {
        return side1;
    }

    /**
     * Sets side 1.
     *
     * @param side1 the side 1
     */
    public void setSide1(double side1)
    {
        this.side1 = side1;
    }

    /** Returns the String description of a Triangle Object.*/
    public String toString()
    {
        return super.toString() + "\nSide1: " + side1 + "\nSide2: "+ side2 + "\nSide3: " + side3;
    }

    @Override
    /** Getter method that returns the perimeter of a Triangle Object.*/
    public double getPerimeter()
    {
        return side1 +side2 +side3;
    }

    @Override
    /** Getter method that returns the area of a Triangle Object.*/
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
