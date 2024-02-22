package Multidimensional_Arrays;

import java.util.Scanner;

/*
    This is a program that uses a method with the header;
                public static double sumColumn(double[][] matrix, int columnIndex)
    to determine the sum of all elements in the column of a matrix.
 */

public class SumOfElementsInColumns
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Creates a 2-D 3x4 matrix(array).
        double[][] matrix = new double[3][4];

        // Reads in elements into the 3x4 matrix
        for (int i = 0; i < 3; i++)
        {
            System.out.printf("\nEnter the four elements of row %d separated by space: ", i);
            for (int j = 0; j < 4; j++)
                matrix[i][j] = input.nextDouble();
        }

        // Displays the sum of elements in the columns of the matrix.
        for (int i = 0; i < matrix[0].length; i++)
            System.out.printf("\nThe sum of elements in column %d is: %.2f", i, sumColumn(matrix, i));
    }

    /**
     * Returns the sum of elements in a given column of a 2-D matrix(array).
     *
     * @param matrix The matrix(array) whose sum of column is to be determined.
     * @param columnIndex The column whose elements are to be summed.
     * @return The sum of elements in a specific column.
     */
    public static double sumColumn(double[][] matrix, int columnIndex)
    {
        double total = 0;

        for (int j = 0; j < matrix.length; j++)
            total += matrix[j][columnIndex];

        return total;
    }
}
