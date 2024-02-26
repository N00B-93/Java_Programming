package CarInstrumentSimulator;

import java.util.Scanner;
import CarInstrumentSimulator.Odometer;
import CarInstrumentSimulator.FuelGauge;

public class Main
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter the amount of fuel for the vehicle.
		double amountOfFuel = input.nextDouble();

		// Prompts the user to enter the cost per gallon of fuel.
		System.out.printf("\nEnter the cost per gallon of fuel: $ ");
		double costPerGallon = input.nextDouble();

		// Prompts the user to enter a mileage.
		System.out.printf("\nEnter the odometer mileage: ");
		int mileage = input.nextInt();

		// Creates a FuelGauge Object.
		FuelGauge fuelGauge = new FuelGauge(amountOfFuel);

		// Creates an Odometer Object.
		Odometer odometer = new Odometer(mileage);
		
		// Filling the fuelGauge with fuel.
		System.out.println("\nFilling up the tank...");
		while (fuelGauge.getAmountOfFuel() <= 15)
		{
			fuelGauge.addFuel();
		}

		// Increases the mileage and decreases fuel till the tank runs out of fuel.
		while (fuelGauge.getAmountOfFuel() > 0)
		{
			odometer.incrementMileage();
			odometer.decreaseGauge(fuelGauge);
			System.out.printf("\nCurrentMikeage: %d\n", odometer.getMileage());
			System.out.printf("\nFuel Remaining: %d gallons\n", fuelGauge.getAmountOfFuel());
		}
	}
}

