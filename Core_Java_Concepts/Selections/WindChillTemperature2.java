package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a temperature between -58 ºF and
    41ºF and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
    The program displays the wind-chill temperature if the input is valid; otherwise,
    it displays a message indicating whether the temperature and/or wind speed is
    invalid.
 */

public class WindChillTemperature2
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the temperature.
        System.out.print("\nEnter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();

        // Checks if temperature is valid.
        if (temperature < -58 || temperature > 41)
        {
            System.out.println("\nInvalid Temperature\nEnter a temperature between -58 ºF to 41 ºF. ");
            System.exit(0);
        }

        // Reads in the wind speed.
        System.out.print("\nEnter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        // Checks if windSpeed is valid.
        if (windSpeed < 2)
        {
            System.out.println("\nInvalid Wind Speed\nEnter a wind speed >= 2.");
            System.exit(0);
        }

        // Calculate the wind chill index.
        double windChillIndex = 35.74 + 0.6215 * temperature -
                35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        System.out.printf("\nThe wind chill index is %.2f\n", windChillIndex);
    }
}
