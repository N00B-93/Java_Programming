package Generics;

import java.util.ArrayList;

/*
    This is a program that uses the method;
                public static <E extends Comparable<E>> E max(ArrayList<E> list)
    to determine the maximum element in a generic ArrayList.
 */

public class MaximumElementInGenericArrayList<E>
{
    public ArrayList<E> list = new ArrayList<>();

    public static void main(String[] args)
    {
        // Creates the first generic list Object to hold Integers.
        MaximumElementInGenericArrayList genericList1 = new MaximumElementInGenericArrayList();

        // Adds 10 integers to the first generic list Object.
        genericList1.list.add(1);
        genericList1.list.add(50);
        genericList1.list.add(27);
        genericList1.list.add(101);
        genericList1.list.add(45);
        genericList1.list.add(7);
        genericList1.list.add(98);
        genericList1.list.add(67);
        genericList1.list.add(81);
        genericList1.list.add(16);

        // Creates the second generic list Object to hold Characters.
        MaximumElementInGenericArrayList genericList2 = new MaximumElementInGenericArrayList();

        // Adds 10 characters to the second generic list Object.
        genericList2.list.add('z');
        genericList2.list.add('m');
        genericList2.list.add('x');
        genericList2.list.add('q');
        genericList2.list.add('r');
        genericList2.list.add('a');
        genericList2.list.add('v');
        genericList2.list.add('w');
        genericList2.list.add('b');
        genericList2.list.add('y');

        // Determines the maximum element of the Generic integer and Generic character lists respectively.
        System.out.printf("\nThe Maximum Element of the generic list of integers is: %d\n", max(genericList1.list));
        System.out.printf("\nThe Maximum Element of the generic list of characters is: %c\n", max(genericList2.list));
    }

    /**
     * Returns the maximum element in a Generic list..
     *
     * @param <E>  The type parameter
     * @param list The list whose maximum element is to be determined.
     * @return The maximum element in the list.
     */
    public static <E extends Comparable<E>> E max(ArrayList<E> list)
    {
        E max = list.get(0);

        for (int i = 0; i < list.size(); i++)
        {
            if (max.compareTo(list.get(i)) < 0)
            {
                max = list.get(i);
            }
        }
        return max;
    }
}
