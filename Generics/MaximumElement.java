package Generics;

public class MaximumElement
{
    public static void main(String[] args)
    {
        // Creates an array of 10 integers.
        Integer[] numbers = {2, 99, 76, 45, 23, 100, 201, 59, 10003, 678};

        // Determines the maximum element.
        int max = max(numbers);

        // Displays the result.
        System.out.printf("\nThe maximum element is: %d\n", max);
    }

    /**
     * Returns the maximum element in a list.
     *
     * @param <E>  The type parameter.
     * @param list The list containing elements.
     * @return The maximum element in the list.
     */
    public static <E extends Comparable<E>> E max(E[] list)
    {
        E max = list[0];

        for (int i = 0; i < list.length; i++)
        {
            if (max.compareTo(list[i]) < 0)
                max = list[i];
        }
        return max;
    }
}
