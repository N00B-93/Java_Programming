package Abstract_Classes_And_Interfaces;

import java.util.Scanner;

/*
    This is a program that creates a Square Object class that implements the Colorable interface
    and extends the GeometricalObject class.
    An array of three GeometricObjects is then created. For each object in the array,
    the area is displayed and the howToColor method is invoked if the object is Colorable.
 */

public class Square extends GeometricalObject implements Colorable
{
    private double side;

    /** Constructor that creates a Square Object with a specified side.*/
    public Square(double side)
    {
        this.side = side;
    }

    /** Getter method that returns the area of the Square.*/
    @Override
    public double getArea()
    {
        return Math.pow(this.side, 2);
    }

    /** Getter method that returns the perimeter of the Square.*/
    @Override
    public double getPerimeter()
    {
        return this.side * 4;
    }

    @Override
    /** Method that describes hot to color a Square Object.*/
    public void howToColor()
    {
        System.out.println("How to color: Color all four sides.");
    }

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
