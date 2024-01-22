package Abstract_Classes_And_Interfaces;

/**
 * The type Octagon.
 */
public class Octagon implements Comparable<Octagon>, Cloneable
{
    private double side;

    /**
     * Instantiates a new Octagon Object with the given side.
     *
     * @param The side of the Octagon.
     */
    public Octagon(double side)
    {
        this.side = side;
    }

    /**
     * Calculates the area of an Octagon Object.
     *
     * @return The area of the Octagon.
     */
    public double getArea()
    {
        return ((2 + 4 / Math.sqrt(2)) * Math.pow(side, 2));
    }

    /**
     * Calculates the perimeter of an Octagon.
     *
     * @return The perimeter of the Octagon.
     */
    public double getPerimeter()
    {
        return this.side * 8;
    }

    /**
     * Compares two Octagon Object.
     *
     * @param octagon the object to be compared.
     * @return -1, 0, or 1 that indicates whether one Octagon object is <, == or > the other.
     */
    @Override
    public int compareTo(Octagon octagon)
    {
        if (this.getArea() - octagon.getArea() < 0)
            return -1;
        else if (this.getArea() - octagon.getArea() == 0)
            return 0;
        return 1;
    }

    /**
     * Clones an Octagon Object.
     * 
     * @return A clone of an Octagon Object.
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        Octagon octagon1 = new Octagon(5);

        System.out.printf("\nArea: %.2f\nPerimeter: %.2f\n", octagon1.getArea(), octagon1.getPerimeter());

        try
        {
            Octagon octagon2 = (Octagon) octagon1.clone();
            System.out.printf("\nIs Octagon1 == Octagon2? %b\n", octagon1.compareTo(octagon2));
        }
        catch (CloneNotSupportedException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
