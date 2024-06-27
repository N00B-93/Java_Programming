package Objects_And_Classes;

import java.util.Scanner;

/*
    This is a program that creates a Temperature Object with a given temperature in Fahrenheit and then displays the
    Kelvin and the Celsius equivalent of the Fahrenheit Temperature.
 */

public class TestTemperature
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Prompts the user to enter a Temperature in Fahrenheit.
        System.out.printf("\nEnter a Temperature in Fahrenheit: ");
        double fahrenheitTemperature = keyBoard.nextDouble();

        // Continue to prompt the user to enter a valid temperature if the temperature entered by the user is < 32 or > 212.
        while (fahrenheitTemperature < 32 || fahrenheitTemperature > 212)
        {
            System.out.println("\nUse a Temperature in the range: 32F  - 212F!!!");
            System.out.printf("\nEnter a Temperature in Fahrenheit: ");
            fahrenheitTemperature = keyBoard.nextDouble();
        }

        // Creates a Temperature Object.
        Temperature temperature = new Temperature(fahrenheitTemperature);

        // Displays the Kelvin and the Celsius equivalent of the Fahrenheit Temperature.
        System.out.printf("\n%.2f F converted to Kelvin: %.2f K\n\n%.2f converted to Celsius: %.2f C\n",
                fahrenheitTemperature, temperature.getKelvinTemperature(), fahrenheitTemperature, temperature.getCelsius());
    }
}
