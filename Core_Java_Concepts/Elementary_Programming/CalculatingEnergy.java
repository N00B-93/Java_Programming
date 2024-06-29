package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that calculates the energy needed
    to heat water from an initial temperature to a final temperature.
 */

public class CalculatingEnergy
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the weight of water in kg.
        System.out.print("\nEnter the amount of water in kg: ");
        double amountOfWater = input.nextDouble();

        // Reads in the initial Temperature.
        System.out.print("\nEnter the initial Temperature: ");
        double initialTemperature = input.nextDouble();

        // Reads in the final Temperature.
        System.out.print("\nEnter the final Temperature: ");
        double finalTemperature = input.nextDouble();

        // Calculates the energy required.
        double energyRequired = amountOfWater * (finalTemperature - initialTemperature) * 4184;

        // Displays the result.
        System.out.printf("\nThe energy needed is: %.2f\n", energyRequired);
    }
}
