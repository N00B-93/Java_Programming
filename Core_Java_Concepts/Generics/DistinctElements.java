package Core_Java_Concepts.Generics;

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

        int number;

        // Continues to read in numbers till user enters 0.
        while (true)
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
        System.out.print("\nThe distinct elements are: ");
        for (Integer integer : distinctList)
            System.out.printf("%d ", integer);
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

        for (E e : list) {
            if (!distinctList.contains(e))
                distinctList.add(e);
        }
        return distinctList;
    }
}
