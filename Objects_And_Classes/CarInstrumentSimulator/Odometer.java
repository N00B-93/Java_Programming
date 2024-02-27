package Objects_And_Classes.CarInstrumentSimulator;

public class Odometer
{
    // Odometer Object attribute.
    private int mileage;

    /**
     * Instantiates a new Odometer.
     *
     * @param mileage The mileage on the Odometer.
     */
    public Odometer(int mileage)
    {
        this.mileage = mileage;
    }

    /**
     * Gets the current mileage of an Odometer.
     *
     * @return The current mileage.
     */
    public int getMileage()
    {
        return this.mileage;
    }

    /**
     * Increment the Odometer mileage by 1 if its < 999_999 else resets it to 0 if it exceeds 999_999.
     */
    public void incrementMileage()
    {
        if (this.mileage < 999_999)
            this.mileage++;
        else if (this.mileage >= 999_999)
            this.mileage = 0;
    }

    /**
     * Decrease the FuelGauge amountOfFuel if it is greater than 0 for every 24 miles travelled.
     *
     * @param fuelGauge The FuelGauge Object to be processed.
     */
    public void decreaseGauge(FuelGauge fuelGauge)
    {
        if (fuelGauge.getAmountOfFuel() > 0 && this.mileage % 24 == 0)
            fuelGauge.consumeFuel();
    }
}
