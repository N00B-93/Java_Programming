package Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    This is a program that prompts the user to enter a list of 10 integers and then displays the largest number in the list
    using a recursive method and a recursive helper method.
 */

public class LargestElementInAnArray
{
    public static int max = 0;

    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Creates an array of 10 integers.
        int[] list = new int[10];

        while (true)
        {
            try
            {
                // Prompts the user to enter a list of 10 integers.
                System.out.printf("\nEnter 10 integers separated by space: ");
                for (int idx = 0; idx < 10; idx++)
                    list[idx] = input.nextInt();

                // Determines the largest element in the list entered by the user.
                System.out.printf("\nThe largest element in ");
                displayArray(list);
                System.out.printf("is: %d\n\n", getLargestElement(list));
                break;
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("\nInvalid input, use integers only.");
                input.nextLine();
            }
        }
    }

    /**
     * Displays an array array.
     *
     * @param array The array to be displayed.
     */
    public static void displayArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.printf("%d ", array[i]);
    }

    /**
     * This returns the largest element in a list of numbers by making a call to a recursive helper fubction.
     *
     * @param list The list whose largest element is to be determined.
     * @return The largest element in the list
     */
    public static int getLargestElement(int[] list)
    {
        return getLargestElementHelper(list, list.length - 1);
    }

    /**
     * Receives a list and an index from a recursive method and then determines the largest element in the list.
     *
     * @param list The list containing the numbers.
     * @param high The index of the last element in the list.
     * @return The largest element in the list.
     */
    public static int getLargestElementHelper(int[] list, int high)
    {
        if (high == 0)
            return max;
        else if (list[high] > max)
        {
            max = list[high];
        }
        return getLargestElementHelper(list, --high);
    }
}
