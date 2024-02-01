package Generics;

import java.util.ArrayList;
import java.util.Scanner;

/*
    This is a program that uses a method with the header;
                public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
      to display all the distinct elements in a list.
 */

public class DistinctElements
{
    public static void main(String[] args)
    {
        // Creates an ArrayList Object.
        ArrayList<Integer> list = new ArrayList<>();

        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        int number = -1;

        // Continues to read in numbers till user enters 0.
        while (number != 0)
        {
            System.out.printf("\nEnter an integer(press '0' to stop input): ");
            number = input.nextInt();
            if (number == 0)
                break;
            list.add(number);
        }

        // Appends the distinct elements in a new list.
        ArrayList<Integer> distinctList = removeDuplicates(list);

        // Displays the distinct elements in the list.
        System.out.println("\nThe distinct elements are: ");
        for (int i = 0; i < distinctList.size(); i++)
            System.out.printf("%d ", distinctList.get(i));
    }


    /**
     * Remove duplicates from a list.
     *
     * @param <E>  The type parameter.
     * @param list The list to be processed.
     * @return The list that contains distinct elements.
     */
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {
        ArrayList<E> distinctList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            if (distinctList.contains(list.get(i)))
                continue;
            else
                distinctList.add(list.get(i));
        }
        return distinctList;
    }
}
