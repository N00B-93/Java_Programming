package Core_Java_Concepts.Selections;

import java.util.Random;

/*
    This is a program that displays a random coordinate in a rectangle.
    The rectangle is centered at (0, 0) with width 100 and height 200.
 */

public class RandomPoint
{
    public static void main(String[] args)
    {
        // Creates a Random Object.
        Random random = new Random();

        // Generates the x-coordinate of the point between -50 to 50 for a length of 100.
        double xCoord = random.nextDouble(-50, 51);

        // Generates the y-coordinate of the point between -100 to 100 for a length of 200.
        double yCoord = random.nextDouble(-100, 101);

        // Displays the result.
        System.out.printf("\nThe x and y coordinates of the random point is: (%.2f, %.2f)\n", xCoord, yCoord);
    }
}
