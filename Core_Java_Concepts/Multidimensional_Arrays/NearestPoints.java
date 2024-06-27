package Multidimensional_Arrays;

/*
	    This is a program that finds the two nearest points
    	in a 3-Dimensional space given an array of 3-dimensional points.
 */

public class NearestPoints
{
	public static void main(String[] args)
	{
		// Creates a 2-D array holding 3-Dimensional points.
		double[][] points = {
			{-1, 0, 3}, {1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {3.5, 4, -0.5}
		};

		// Variables to hold the indices of the two points with the shortest distance.
		int p1 = 0, p2 = 1;

		// Initializes the leastDistance variable with the distance between the first two points.
		double leastDistance = distanceBetween(points[p1][0], points[p1][1], points[p1][2], points[p2][0], points[p2][1],
				points[p2][2]);

		// Determines the two distance with the shortest points.
		for (int i = 0; i < points.length; i++)
		{
			for (int j = i + 1; j < points.length; j++)
			{
				double distance = distanceBetween(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1],
						points[j][2]);
				if (distance < leastDistance)
				{
					leastDistance = distance;
					p1 = i;
					p2 = j;
				}
			}
		}

		// Displays the result.
		System.out.printf("\nThe closest points are; (%.2f, %.2f, %.2f), (%.2f, %.2f, %.2f)\n", points[p1][0], points[p1][1],
				points[p1][2], points[p2][0], points[p2][1], points[p2][2]);
	}

	/**
	 * Returns the distance between two points in 3-D space..
	 *
	 * @param x1 The x-coordinate of the first point.
	 * @param y1 The y-coordinate of the first point.
	 * @param z1 The z-coordinate of the first point.
	 * @param x2 The x-coordinate of the second point.
	 * @param y2 The y-coordinate of the second point.
	 * @param z2 The z-coordinate of the second point.
	 * @return The distance between the two points.
	 */
	public static double distanceBetween(double x1, double y1, double z1, double x2, double y2, double z2)
	{
		double distance = Math.sqrt((x1 - x2) * (x1 -x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2));

		return (distance);
	}
}
