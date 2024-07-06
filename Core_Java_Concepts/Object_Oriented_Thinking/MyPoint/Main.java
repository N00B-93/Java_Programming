package Core_Java_Concepts.Object_Oriented_Thinking.MyPoint;

/*
    This is a driver program for the MyPoint class.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates two MyPoint instances.
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(10, 30.5);

        // Determines the distance between the two MyPoint instances using the overloaded distance methods.
        System.out.printf("\nThe distance between (%.2f, %.2f) and (%.2f, %.2f) is: %.2f\n", point1.getXCoordinate(),
                point1.getYCoordinate(), point2.getXCoordinate(), point2.getYCoordinate(), point1.distance(point2));

        System.out.printf("\nThe distance between (%.2f, %.2f) and (%.2f, %.2f) is: %.2f\n", point1.getXCoordinate(),
                point1.getYCoordinate(), point2.getXCoordinate(), point2.getYCoordinate(), MyPoint.distance(point1, point2));

        System.out.printf("\nThe distance between (%.2f, %.2f) and (%.2f, %.2f) is: %.2f\n", point1.getXCoordinate(),
                point1.getYCoordinate(), point2.getXCoordinate(), point2.getYCoordinate(),
                point1.distance(point2.getXCoordinate(), point2.getYCoordinate()));
    }
}
