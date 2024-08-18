package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a temperature between -58 ºF and
    41ºF and a wind speed greater than or equal to 2 and displays the wind-chill temperature using the formula:
                twc = 35.74 + (0.6215 * ta) - (35.75 * v^0.16) + (0.4275 * ta * v^0.16)
 */

public class WindChillTemperature
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the temperature.
        System.out.print("\nEnter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();

        // Reads in the wind speed.
        System.out.print("\nEnter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        // Calculate the wind chill index.
        double windChillIndex = 35.74 + 0.6215 * temperature -
                35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        System.out.printf("\nThe wind chill index is %.2f\n", windChillIndex);
    }
}
