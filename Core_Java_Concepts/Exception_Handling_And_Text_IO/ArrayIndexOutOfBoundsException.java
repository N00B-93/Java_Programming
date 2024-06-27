package Exception_Handling_And_Text_IO;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

/*
    This program meets the following requirements:
        ■ Creates an array with 100 randomly chosen integers.
        ■ Prompts the user to enter the index of the array, then displays the corresponding
           element value. If the specified index is out of bounds, display the
           message Out of Bounds.
 */

public class ArrayIndexOutOfBoundsException
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Creates a Random Object.
        Random random = new Random();

        // Creates an Array that holds 100 random integers.
        int[] numbers = new int[100];

        // For loop that appends 100 randomly generated integers into the array numbers.
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = random.nextInt();

        try
        {
            // Reads in an array index from 0 to 99.
            System.out.printf("\nEnter an array index(0 - 99): ");
            int arrayIndex = input.nextInt();

            // Displays the result.
            System.out.printf("\nThe element at index %d is: %d\n", arrayIndex, numbers[arrayIndex]);
        }
        // Catch an IndexOutOfBoundsException when the user enters an out-of-bounds index.
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("\nOut of Bounds.");
        }
        // Catches an InputMismatchException when the user enters a character other than an integer.
        catch (InputMismatchException ex)
        {
            System.out.println("\nInvalid input, Use a valid index from 0 - 99.");
        }
    }
}
