package Generics;

/*
    This is a program that uses a method with the header:
                public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
    that utilizes Binary Search Algorithm to search for an element in a Generic array.
 */

public class GenericBinarySearch
{
    public static void main(String[] args)
    {
        // Initializes two arrays containing elements.
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] words = {"cane", "door", "egg", "hunt", "ice", "junk", "monkey", "pasta", "water", "zoological"};

        // Initializes two keys to be searched for.
        Integer key1 = 5;
        String key2 = "water";

        // searches for the key and displays the result.
        System.out.printf("\n%d was found at index: %d\n", key1, binarySearch(numbers, key1));
        System.out.printf("\n'%s' was found at index: %d\n", key2, binarySearch(words, key2));
    }

    /**
     * Searches for a key in an array using Binary Search Algorithm.
     *
     * @param <E>  The type parameter.
     * @param list The array containing elements.
     * @param key  The key to be searched for.
     * @return The index where the key was found, if the key is not in the list, the position where it
     * should be in the array is returned.
     */
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
    {
        int low = 0, high = list.length - 1;

        while (high >= low)
        {
            int mid = (high + low) / 2;

            if (key.compareTo(list[mid]) < 0)
                high = mid - 1;
            else if (key.equals(list[mid]))
                return mid;
            else
                low = mid + 1;
        }
        return -low -1;
    }
}
