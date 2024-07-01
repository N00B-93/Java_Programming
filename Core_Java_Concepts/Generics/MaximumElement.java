package Core_Java_Concepts.Generics;

/*
    This is a program that uses a function with the header;
                public static <E extends Comparable<E>> E max(E[] list)
    to determine the maximum element in an array of generic types.
 */
public class MaximumElement
{
    public static void main(String[] args)
    {
        // Creates an array of 10 integers.
        Integer[] numbers = {2, 99, 76, 45, 23, 100, 201, 59, 10003, 678};

        // Creates an array of Strings.
        String[] words = {"java", "leng", "buffer", "hungry", "pungent"};

        // Determines the maximum element in the Integer array.
        int maxNumber = max(numbers);

        // Determines the maximum element in the String array.
        String maxWord = max(words);

        // Displays the result.
        System.out.printf("\nThe maximum element in the integer array is: %d\n", maxNumber);

        // Display the maximum element in the String array.
        System.out.printf("\nThe maximum element in the word array is: %s\n", maxWord);
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

        for (E e : list) {
            if (max.compareTo(e) < 0)
                max = e;
        }
        return max;
    }
}
