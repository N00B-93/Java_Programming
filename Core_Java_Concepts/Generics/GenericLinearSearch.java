package Core_Java_Concepts.Generics;

/*
    This is a program that uses a generic linear search method to search for a generic
    key in a generic list.
 */

public class GenericLinearSearch
{
    public static void main(String[] args)
    {
        // Creates an array of Strings.
        String[] food = {"beef brisket", "fish and chips",
                "roasted salmon", "chocolate chip cookies", "donuts and black coffee"};

        // Key to be searched for in the list.
        String key = "beef brisket";

        // Searches for the key in the list.
        int index = linearSearch(food, key);

        // Display the index of the key in the list or displays a 'key not found' message if the key isn't in the list.
        if (index != -1)
            System.out.printf("\n%s found at index %d\n", key, index);
        else
            System.out.printf("\n%s not found", key);
    }

    /**
     * Returns the index of a specified member in a list if the member is in the list, else returns -1.
     *
     * @param <E>  The type parameter.
     * @param list The list that possibly contains the key.
     * @param key  The key to search for.
     *
     * @return The index of the key else returns -1.
     */
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
    {

        for (int i = 0; i < list.length; i++)
        {
            if (list[i].compareTo(key) == 0)
                return i;
        }
        return -1;
    }
}
