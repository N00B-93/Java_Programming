package Abstract_Classes_And_Interfaces;

/*
    This is a program that uses a method named sumArea to calculate the sum of
    the areas of all Geometrical Objects in an array.
 */

public class SumOfAllAreas
{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        // Creates an array of four Geometrical Objects.
        GeometricalObject[] objects = {new Square(5), new Circle("blue", false, 1.2),
        new Square(6.7), new Circle("green", true, 4.9)};

        // Calls the sumAreas method.
        double sumOfAllAreas = sumAreas(objects);

        // Displays the result.
        System.out.printf("\nThe sum of all areas in the Geometrical Object array is: %.2f\n", sumOfAllAreas);
    }

    /**
     * Calculates the sum of areas of all GeometricalObjects in an array.
     *
     * @param objects Array of GeometricalObjects
     * @return The sum of the areas of all GeometricalObjects in the array.
     */
    public static double sumAreas(GeometricalObject[] objects)
    {
        double area = 0.0;

        for(GeometricalObject object: objects)
            area += object.getArea();

        return area;
    }
}
