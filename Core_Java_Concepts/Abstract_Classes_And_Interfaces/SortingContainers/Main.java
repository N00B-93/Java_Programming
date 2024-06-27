package Abstract_Classes_And_Interfaces.SortingContainers;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

/*
    This is a driver program testing the functionalities of the Container,
    Box amd the Tube classes.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner console = new Scanner(System.in);

        // Creates an array of 10 container Objects.
        Container[] containers = new Container[10];

        // Prompts the user to enter the dimension of 10 Containers.
        for (int i = 0; i < containers.length; ++i)
        {
            System.out.print("""
                    \n1. Box Container
                    2. Tube Container
                    """);
            System.out.printf("\nPlease select an option: ");

            try
            {
                int option = console.nextInt();

                if (option == 1)
                {
                    // Prompts the user to enter the width, length and depth of a Box Container.
                    System.out.printf("\nEnter the length, width and depth of the Box container: ");
                    double length = console.nextDouble();
                    double width = console.nextDouble();
                    double depth = console.nextDouble();

                    // Displays an error message and goes to the previous iteration if the user enters a negative number.
                    if (length <= 0 || width <= 0 || depth <= 0)
                    {
                        System.out.println("\nError: Use non-negative numbers greater than 0 only for Container dimension, Try again.");
                        --i;
                        continue;
                    }

                    // Creates a new Box Container with the dimension specified by the user.
                    Box box = new Box(width, depth, length);

                    // Adds the new Box to the list of Containers.
                    containers[i] = box;
                    System.out.println("\nBox container added to the list of Containers!");
                }
                else if (option == 2)
                {
                    // Prompts the user to enter the radius and the length of a Tube.
                    System.out.printf("\nEnter the length and radius of a Tube Container: ");
                    double length = console.nextDouble();
                    double radius = console.nextDouble();

                    // Displays an error message and goes to the previous iteration if the user enters a negative number.
                    if (length <= 0 || radius <= 0)
                    {
                        System.out.println("\nError: Use non-negative numbers greater than 0 only for Container dimension, Try again.");
                        --i;
                        continue;
                    }

                    // Creates a new Tube Container with the dimensions specified by the user.
                    Tube tube = new Tube(radius, length);

                    // Adds the new Tube Container to the list of Containers.
                    containers[i] = tube;
                    System.out.println("\nTube container added to the list of Containers!");
                }
            }
            catch (InputMismatchException exception)
            {
                System.out.println("\nError: Use positive real numbers > 0 only, Try again.");
                console.nextLine();
                --i;
            }
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
                console.nextLine();
                --i;
            }
        }

        // Sorts the list of Containers by cost.
        Arrays.sort(containers);

        // Displays the sorted list of Containers.
        System.out.println("\n\t\tContainer Information");
        for (Container container: containers)
            System.out.println(container);
    }
}
