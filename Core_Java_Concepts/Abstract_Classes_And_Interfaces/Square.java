package Abstract_Classes_And_Interfaces;

import java.util.Scanner;

/*
    This is a program that creates a Square Object class that implements the Colorable interface
    and extends the GeometricalObject class.
    An array of three GeometricObjects is then created. For each object in the array,
    the area is displayed and the howToColor method is invoked if the object is Colorable.
 */

/**
 * The type Square.
 */
public class Square extends GeometricalObject implements Colorable
{
    private double side;

    /**
     * Instantiates a Square Object with the given side.
     *
     * @param side
     */
    public Square(double side)
    {
        this.side = side;
    }

    /**
     * Calculate the area of a Square Object.
     *
     * @return The area of the Square Object.
     */
    @Override
    public double getArea()
    {
        return Math.pow(this.side, 2);
    }

    /**
     * Calculates the perimeter of a Square Object.
     *
     * @return The perimeter of a Square Object.
     */
    @Override
    public double getPerimeter()
    {
        return this.side * 4;
    }

    @Override
    /**
     * Describes how to color a Square Object.
     *
     * @return void
     */
    public void howToColor()
    {
        System.out.println("How to color: Color all four sides.");
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);


        // Creates an array of five GeometricalObjects(Squares).
        GeometricalObject[] object = {new Square(5), new Triangle("Blue", true, 3, 4, 5),
                new Square(3)};

        for (int i = 0; i < object.length; i++)
        {
            // Gets and displays the area of the shape.
            System.out.printf("\nArea: %.2f\n", object[i].getArea());

            // Checks if the shape is colorable and prints how to color or indicates that the shape can't be colored otherwise.
            if (object[i] instanceof Colorable)
                ((Colorable) object[i]).howToColor();
            else
                System.out.println("Cannot Colour shape.");
        }

    }
}
