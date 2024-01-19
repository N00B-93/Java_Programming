package Abstract_Classes_And_Interfaces;

/**
 * The type Octagon.
 */
public class Octagon implements Comparable<Octagon>, Cloneable
{
    private double side;

    /**
     * Instantiates a new Octagon.
     *
     * @param side   the side
     */
    public Octagon(double side)
    {
        this.side = side;
    }

    /**
     * Gets area.
     *
     * @return the area
     */
    public double getArea()
    {
        return ((2 + 4 / Math.sqrt(2)) * Math.pow(side, 2));
    }

    /**
     * Gets perimeter.
     *
     * @return the perimeter
     */
    public double getPerimeter()
    {
        return this.side * 8;
    }

    @Override
    public int compareTo(Octagon octagon)
    {
        if (this.getArea() - octagon.getArea() < 0)
            return -1;
        else if (this.getArea() - octagon.getArea() == 0)
            return 0;
        return 1;
    }

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
