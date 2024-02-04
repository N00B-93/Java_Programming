package Generics;

import java.util.ArrayList;

/*
    This is a program that uses a function with the header;
                public static <E extends Comparable<E>> void sort(ArrayList<E> list)
    to sort an ArrayList of generic Objects.
 */

public class GenericArrayListSort
{
    public static void main(String[] args)
    {
        // Creates an ArrayList of Integers.
        ArrayList<Integer> list = new ArrayList<>();

        // Adds 5 integers to the list.
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(4);

        // Sorts and displays the list.
        System.out.print("\nThe sorted list is: ");
        sort(list);
    }

    /**
     * Sorts an ArrayList of Generic type in Ascending order.
     *
     * @param <E>  The Generic type parameter.
     * @param list The list to be sorted.
     * @return void.
     */
    public static <E extends Comparable<E>> void sort(ArrayList<E> list)
    {
        for (int pass = 0; pass < list.size(); pass++)
        {
            for (int i = 1; i < list.size(); i++)
            {
                if (list.get(i).compareTo(list.get(i - 1)) < 0)
                {
                    E temp = list.get(i);
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, temp);
                }
            }
        }

        for (int k = 0; k < list.size(); k++)
            System.out.print(list.get(k) + " ");
    }
}
