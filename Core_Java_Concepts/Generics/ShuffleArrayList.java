package Core_Java_Concepts.Generics;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/*
    This is a program that prompts the user to enter 10 elements which are added to a list
    and then shuffles the elements in the list using a method with the header;
                public static <E> void shuffle(ArrayList<E> list)
 */

public class ShuffleArrayList
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Creates an ArrayList.
        ArrayList<Integer> array = new ArrayList<>();

        // Reads in 10 integers into the array.
        for (int i = 0; i< 10; i++)
        {
            System.out.printf("\nEnter element %d: ", i + 1);
            array.add(input.nextInt());
        }

        // Closes the Scanner Object.
        input.close();

        // Displays the elements of the list before shuffling.
        System.out.printf("\nThe elements of the list before shuffling are: ");
        for (int element: array)
            System.out.printf("%d ", element);
        System.out.println();

        // Shuffles the list.
        shuffle(array);

        // Displays the elements of the list after shuffling.
        System.out.printf("\nThe elements of the list after shuffling are: ");
        for (int element: array)
            System.out.printf("%d ", element);
        System.out.println();
    }

    /**
     * Shuffles a Generic List..
     *
     * @param <E>  The type parameter.
     * @param list The list to be shuffled.
     */
    public static <E> void shuffle(ArrayList<E> list)
    {
        int previousIndex = 0;
        Random random = new Random();

        for (int i = 0; i < list.size(); i++)
        {
            int currentIndex = random.nextInt(0, 10);

            while (currentIndex == previousIndex)
            {
                currentIndex = random.nextInt(0, 10);
            }

            E temp = list.get(i);
            list.set(i, list.get(currentIndex));
            list.set(currentIndex, temp);
        }
    }
}
