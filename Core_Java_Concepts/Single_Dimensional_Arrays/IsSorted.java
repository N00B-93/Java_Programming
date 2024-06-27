package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a list of numbers separated by space
    then uses a method with the header;
                public static boolean isSorted(int[] list)
    to check if the list entered by the user is sorted or not.
 */

public class IsSorted
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter a list of numbers to be checked.
        System.out.printf("\nEnter a list of numbers separated by space: ");
        String list = input.nextLine();

        // Creates a String array to hold the elements of the list excluding whitespaces.
        String[] array1 = list.split(" ");

        int[] array2 = new int[array1.length];

        // Converts the element of array1 into integers and assign them to array2.
        for (int i = 0; i <array2.length; i++)
            array2[i] = Integer.parseInt(array1[i]);

        // checks if the array is already sorted.
        boolean sorted = isSorted(array2);

        // displays if the list ios sorted or not.
        if (sorted)
            System.out.println("\nThe list is already sorted.");
        else
            System.out.println("\nThe list is not sorted.");
    }

    /**
     * Checks if an array of integers is sorted in ascending order.
     *
     * @param list The array to be sorted.
     * @return true if the array is sorted, else return false.
     */
    public static boolean isSorted(int[] list)
    {
        for (int i = 1; i < list.length; i++)
        {
            if (list[i] >= list[i - 1])
                continue;
            else
                return false;
        }
        return true;
    }
}
