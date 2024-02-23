package Multidimensional_Arrays;

import java.util.Scanner;

/*
    This program uses a method with the header;
                public static double sumMajorDiagonal(double[][] matrix)
    to determine the sum of elements in the major diagonal of a 4x4 matrix.
 */

public class SumMajorDiagonal
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Creates a 2-D array(4x4 matrix).
        double[][] matrix = new double[4][4];

        // Reads in values into the array.
        for (int i = 0; i < matrix.length; i++)
        {
            System.out.printf("\nEnter the four elements of row %d: ", i);
            for (int j = 0; j < matrix.length; j++)
            {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Displays the result of adding all the elements in the major diagonal of the matrix.
        System.out.printf("\nThe sum of elements in the major diagonal is: %.2f\n", sumMajorDiagonal(matrix));
    }

    /**
     * Returns the sum of the elements in the major diagonal of a matrix.
     *
     * @param matrix The matrix whose elements in its major diagonal is to be added.
     * @return The sum of the elements in the major diagonal.
     */
    public static double sumMajorDiagonal(double[][] matrix)
    {
        double total = 0;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
            {
                if (i == j)
                    total += matrix[i][j];
            }
        return total;
    }
}
