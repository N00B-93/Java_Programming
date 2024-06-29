package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that reads in a temperature in Celsius,
    converts it to Fahrenheit and displays the result.
 */

public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        // Creates a Scanner object.
        Scanner input = new Scanner(System.in);

        // Reads in the temperature in Celsius.
        System.out.print("\nEnter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Calculates the temperature if Fahrenheit.
        double fahrenheit = 9.0 / 5 * celsius + 32;

        // Displays the result.
        System.out.printf("\n%.2f Celsius is %.2f Fahrenheit\n", celsius, fahrenheit);
    }
}
