package Objects_And_Classes.CarInstrumentSimulator;

import java.util.Scanner;

public class Main
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter the amount of fuel for the vehicle.
		System.out.printf("\nEnter the amount of Fuel: ");
		int amountOfFuel = input.nextInt();

		while (amountOfFuel > 15 || amountOfFuel < 0)
		{
			System.out.println("\nInvalid amount of fuel, Tank capacity is 15 gallons!");
			System.out.printf("\nEnter the amount of Fuel: ");
			amountOfFuel = input.nextInt();
		}

		// Prompts the user to enter a mileage.
		System.out.printf("\nEnter the odometer mileage: ");
		int mileage = input.nextInt();

		// Creates a FuelGauge Object.
		FuelGauge fuelGauge = new FuelGauge(amountOfFuel);

		// Creates an Odometer Object.
		Odometer odometer = new Odometer(mileage);
		
		// Filling the fuelGauge with fuel.
		System.out.println("\nFilling up the tank...");
		while (fuelGauge.getAmountOfFuel() != 15)
		{
			fuelGauge.addFuel();
			System.out.printf("\n1 litre added, current amount of fuel: %d gallons\n", fuelGauge.getAmountOfFuel());
			if (fuelGauge.getAmountOfFuel() == 15)
				System.out.println("\nTank filled!");
		}

		// Increases the mileage and decreases fuel till the tank runs out of fuel.
		while (fuelGauge.getAmountOfFuel() > 0)
		{
			odometer.incrementMileage();
			odometer.decreaseGauge(fuelGauge);
			System.out.printf("\nCurrentMileage: %d\n", odometer.getMileage());
			System.out.printf("Fuel Remaining: %d gallons\n", fuelGauge.getAmountOfFuel());
		}
	}
}
