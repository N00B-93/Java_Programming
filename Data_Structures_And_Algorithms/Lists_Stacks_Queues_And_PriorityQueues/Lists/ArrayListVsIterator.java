import java.util.ArrayList;
import java.util.Iterator;

/**
	This is a program that stores 10 million integers in ascending order (i.e., 1, 2, . . ., 10m) 
	in an ArrayList, displays the execution time taken to traverse the list, and searches for the 
	10 millionth element using the get(index) vs using the iterator method.
 */

public class ArrayListVsIterator
{
    public static void main(String... args)
    {
        // Creates an ArrayList of Integers.
        ArrayList<Integer> integers = new ArrayList<>(10_000_000);

        // Populates the ArrayList with integers from 1 to 10_000_000.
        for (int i = 1; i <= 10_000_000; ++i)
            integers.add(i);

        // Measure time taken to traverse the list using the ArrayList get method.
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < integers.size(); ++i)
            integers.get(i);

        long endTime = System.currentTimeMillis();
        System.out.printf("\nTime taken to traverse list using get(index): %d ms\n", endTime - startTime);

        // Measure time taken to traverse the list using an iterator.
        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext())
            iterator.next();

        endTime = System.currentTimeMillis();
        System.out.printf("\nTime taken to traverse list using an iterator: %d ms\n", endTime - startTime);

        // Measure time taken to search for the 10 millionth element using get(index).
        startTime = System.nanoTime();
        int lastElementGet = integers.get(9_999_999);
        endTime = System.nanoTime();
        System.out.printf("\nTime taken to search for the 10 millionth element using get(index): %d ns\n", endTime - startTime);

        // Measure time taken to search for the 10 millionth element using an iterator.
        startTime = System.nanoTime();
        iterator = integers.iterator();
        int lastElementIterator = 0;

        while (iterator.hasNext())
            lastElementIterator = iterator.next();

        endTime = System.nanoTime();
        System.out.printf("\nTime taken to search for the 10 millionth element using iterator: %d ns\n", endTime - startTime);

        // Print the 10 millionth element to ensure the search was correct.
        System.out.println("\n10 millionth element using get(index): " + lastElementGet);
        System.out.println("\n10 millionth element using iterator: " + lastElementIterator);
    }
}

