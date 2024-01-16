package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*  The great circle distance is the distance between
    two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
    latitude and longitude of two points. The great circle distance between the two
    points can be computed using the following formula:
        d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
    This is a program prompts the user to enter the latitude and longitude of two
    points on the earth in degrees and displays its great circle distance. The average
    earth radius is 6,371.01 km.
 */
public class GreatCircleDistance
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the latitude and longitude of the first point and converts them to radians.
        System.out.printf("\nEnter point 1 (latitude and longitude separated by space) in degrees: ");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());

        // Prompts the user to enter the latitude and longitude of the second point and converts them to radians.
        System.out.printf("\nEnter point 1 (latitude and longitude separated by space) in degrees: ");
        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());

        // Calculates the great circle distance.
        double greatCircleDistance = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2)
                                    * Math.cos(y1 - y2));

        // Displays the result.
        System.out.printf("\nThe distance between the two points is: %.2f\n", greatCircleDistance);

    }
}
