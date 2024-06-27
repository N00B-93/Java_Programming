package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter three cities and
    displays them in ascending order.
 */

public class OrderThreeCities
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // prompts the user to enter three city names.
        System.out.printf("\nEnter a city name: ");
        String city1 = input.nextLine();
        System.out.printf("\nEnter a city name: ");
        String city2 = input.nextLine();
        System.out.printf("\nEnter a city name: ");
        String city3 = input.nextLine();

        // Order the cities by comparing names and displays the result.
        if (city1.compareToIgnoreCase(city2) >= 0 && city2.compareToIgnoreCase(city3) >= 0)
            System.out.printf("\nThe three cities in alphabetical order are: %s, %s, %s\n", city3, city2, city1);
        else if (city1.compareToIgnoreCase(city3) >= 0 && city3.compareToIgnoreCase(city2) >= 0)
            System.out.printf("\nThe three cities in alphabetical order are: %s, %s, %s\n", city2, city3, city1);
        else if (city2.compareToIgnoreCase(city1) >= 0 && city1.compareToIgnoreCase(city3) >= 0)
            System.out.printf("\nThe three cities in alphabetical order are: %s, %s, %s\n", city3, city1, city2);
        else if (city2.compareToIgnoreCase(city3) >= 0 && city3.compareToIgnoreCase(city1) >= 0)
            System.out.printf("\nThe three cities in alphabetical order are: %s, %s, %s\n", city1, city3, city2);
        else if (city3.compareToIgnoreCase(city1) >= 0 && city1.compareToIgnoreCase(city2) >= 0)
            System.out.printf("\nThe three cities in alphabetical order are: %s, %s, %s\n", city2, city1, city3);
        else if (city3.compareToIgnoreCase(city2) >= 0 && city2.compareToIgnoreCase(city1) >= 0)
            System.out.printf("\nThe three cities in alphabetical order are: %s, %s, %s\n", city1, city2, city3);
    }
}
