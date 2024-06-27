package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
    Two arrays list1 and list2 are strictly identical if their corresponding elements are equal.
    This is a program that prompts the user to enter two lists and determine if they are strictly identical
    by using a method with the header;
                public static boolean equals(int[] list1, int[] list2)
    NB: The first number in the input indicates the number of the elements in the list. This
    number is not part of the list.
 */

public class StrictlyIdenticalArrays
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        System.out.println("\nNOTE: The first number in the input indicates the number of the elements in the list. \nThis " +
                "number is not part of the list.");

        // Reads in element of the first list.
        System.out.printf("\nEnter the elements of the first list separated by space: ");
        String list1 = input.nextLine();

        // Reads in element of the second list.
        System.out.printf("\nEnter the elements of the second list separated by space: ");
        String list2 = input.nextLine();

        // creates two arrays that contains the numbers from each lists as Strings.
        String[] array1 = list1.split(" ");
        String[] array2 = list2.split(" ");


        // Terminates the program if the arrays are not of equal length.
        if (array1.length != array2.length)
        {
            System.out.println("\nThe two arrays are not Strictly Identical.");
            System.exit(1);
        }

        // Creates two arrays to hold the integer representation of the elements of the two lists.
        int array3[] = new int[array1.length];
        int array4[] = new int[array2.length];

        // Fills array3 and array4 with elements.
        for (int i = 0; i < array1.length; i++)
        {
            array3[i] = Integer.parseInt(array1[i]);
            array4[i] = Integer.parseInt(array2[i]);
        }

        // Displays the result.
        if (equals(array3, array4))
            System.out.println("\nThe arrays are Strictly Identical!");
        else
            System.out.println("\nThe arrays are not Strictly Identical!");
    }

    /**
     * Returns true if two arrays are strictly identical
     * @param list1 The first array.
     * @param list2 The second array.
     * @return true if the arrays are strictly identical, else false.
     */
    public static boolean equals(int[] list1, int[] list2)
    {
        for (int i = 0; i < list1.length; i++)
        {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
