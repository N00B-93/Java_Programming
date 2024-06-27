package Objects_And_Classes;

import java.util.Scanner;

/*
    This is a program that creates a LandTract class and creates two Object of the LandTract class.
    The user is then prompted to enter the dimension of the two LandTract Objects, their area is displayed and
    the equality of the object based on their areas is checked.
 */

public class LandTract
{
    // Attributes of a LandTract Object.
    private double length, width;

    /**
     * Instantiates a new Land tract Object.
     *
     * @param length The length of the LandTract Object.
     * @param width  the width of the LandTract Object.
     */
    public LandTract(double length,double width)
    {
        this.length = length;
        this.width =width;
    }

    /**
     * Returns the length of a Land.
     *
     * @return The length of a Land.
     */
    public double getLength()
    {
        return this.length;
    }

    /**
     * Returns the width of a Land.
     *
     * @return The width of a Land.
     */
    public double getWidth()
    {
        return this.width;
    }

    /**
     * Returns the area of a Land.
     *
     * @return The area of a Land.
     */
    public double getArea()
    {
        return this.length * this.width;
    }

    /**
     * Returns true if two LandTract Object has the same area, else returns false.
     *
     * @param otherLandTract The other LandTract Object.
     * @return true if two LandTract Object has the same area, else returns false.
     */
    public boolean equals(LandTract otherLandTract)
    {
        return this.getArea() > otherLandTract.getArea();
    }

    /**
     *  Returns a String that describes the properties of a LandTract Object.
     * @return String that describes the properties of a LandTract Object.
     */
    public String toString()
    {
        return "Length: " + this.length + "\n" + "Width: " + this.width + "\n" + "Area: " + this.getArea();
    }

    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Prompts the user to  enter the dimensions of two LandTract Object.
        System.out.printf("\nEnter the length and width of the first Land separated by space: ");
        double length1 = keyBoard.nextDouble();
        double width1 = keyBoard.nextDouble();

        System.out.printf("\nEnter the length and width of the second Land separated by space: ");
        double length2 = keyBoard.nextDouble();
        double width2 = keyBoard.nextDouble();

        // Creates two LandTract Object.
        LandTract landTract1 =  new LandTract(length1, width1);
        LandTract landTract2 = new LandTract(length2, width2);

        // Displays the area of the two LandTract.
        System.out.printf("\nArea of landTract1: %.2f\n", landTract1.getArea());
        System.out.printf("\nArea of landTract2: %.2f\n", landTract2.getArea());

        // Display whether the two LandTract Object are equal.
        System.out.printf("\nLandTract1 equals LandTract2? %b\n", landTract1.equals(landTract2));
    }
}
