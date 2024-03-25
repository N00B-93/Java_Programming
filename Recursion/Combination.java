package Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    This is a program that prompts the user to enter a number of items(represented by n) and a number of items to be
    selected(represented by r) and then displays the number of ways of selecting r items from n items.
 */

public class Combination
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        while (true)
        {
            try
            {
                // Prompts the user to enter the number of items.
                System.out.printf("\nEnter the number of items: ");
                int numberOfItems = input.nextInt();

                // Prompts the user to enter the number of items to be selected.
                System.out.printf("\nEnter the number of items to be selected: ");
                int numberOfItemsToBeSelected = input.nextInt();

                // Displays an error message if the number of items or the number of items to be selected is < 0.
                if (numberOfItems < 0 || numberOfItemsToBeSelected < 0)
                {
                    System.out.println("\nInvalid input!!!\nNumber of items and Number of items to be selected must be positive.");
                    continue;
                }

                // Displays the number of ways of selecting r items from a set of n items.
                System.out.printf("\nThe number of ways of selecting %d items from %d set of items is: %d\n",
                        numberOfItemsToBeSelected, numberOfItems, combination(numberOfItems, numberOfItemsToBeSelected));
                break;
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("\nInvalid input, Try again.");
                input.nextLine();
            }
        }
    }

    /**
     * This returns the factorial of a given integer.
     *
     * @param n The integer whose factorial is to be determined.
     * @return The factorial of n.
     */
    public static int factorial(int n)
    {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    /**
     * This returns the number of ways of selecting r items from n items.
     *
     * @param numberOfItems The number of items.
     * @param numberOfItemsToBeSelected The number of items to be selected
     * @return The number of ways of selecting r items from n items.
     */
    public static int combination(int numberOfItems, int numberOfItemsToBeSelected)
    {
        return factorial(numberOfItems) / (factorial(numberOfItems - numberOfItemsToBeSelected) *
                factorial(numberOfItemsToBeSelected));
    }
}
