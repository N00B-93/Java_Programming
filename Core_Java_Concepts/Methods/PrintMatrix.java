package Methods;

import java.util.Scanner;
import java.util.Random;

/*
    This is a program that uses a function with the header;
                public static void printMatrix(int n)
    to display an nxn matrix of 1's and 0's.
 */

public class PrintMatrix
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the number of rows of the matrix.
        System.out.printf("\nEnter the number of rows: ");
        int rows = input.nextInt();

        // Displays the matrix.
        printMatrix(rows);
    }

    /**
     * Display an n x n matrix of 1's and 0's.
     *
     * @param n The number of rows in the square matrix
     */
    public static void printMatrix(int n)
    {
        // Creates a Random Object.
        Random random = new Random();

        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
                System.out.printf("%d ", random.nextInt(0, 2));
            System.out.println();
        }
    }
}
